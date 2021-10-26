/*******************************************************************************
 * Copyright (c) 2019 CrossBreeze
 *
 *  This file is part of CrossTest.
 *
 *     CrossTest is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     CrossTest is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with CrossTest.  If not, see <https://www.gnu.org/licenses/>.
 *     
 * Contributors:
 *     Willem Otten - CrossBreeze
 *     Harmen Wessels - CrossBreeze
 *******************************************************************************/
package com.xbreeze.xtest.result;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import javax.sql.RowSet;
import javax.sql.RowSetMetaData;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import com.xbreeze.xtest.CucumberDataComparison.Exceptions.CucumberDataComparisonException;
import com.xbreeze.xtest.config.DatabaseConfig;
import com.xbreeze.xtest.database.helpers.DataHelper;
import com.xbreeze.xtest.database.helpers.DatabaseCommandExecutor;
import com.xbreeze.xtest.database.helpers.RecordInformation;
import com.xbreeze.xtest.exception.XTestDatabaseException;
import com.xbreeze.xtest.exception.XTestException;
import com.xbreeze.xtest.exception.XTestResultComparisonException;

import io.cucumber.datatable.DataTable;

/**
 * ResultContext stores the result of the scenario
 * @author Willem
 *
 */

public class ResultContext {
	private RowSet _result;
	private String _tableName;
	private DatabaseConfig _dbconfig;
	private HashMap<String,String> _variables;
	static final Logger logger = Logger.getLogger(ResultContext.class.getName());
	public static final String VARIABLE_PREFIX = "XTestVariables."; 
	private DataHelper _dataHelper;
	private Boolean _inTransaction = false;
	
	public ResultContext() {
		this._variables = new HashMap<>();		
	}
	
	public void startTransaction() {
		this._inTransaction = true;
	}
	
	public void stopTransaction() {
		this._inTransaction = false;
	}
	
	public Boolean isInTransaction() {
		return this._inTransaction;
	}
	
	//Set the datahelper since this cannot be done via Picocontainer, leads to dependancy cycle
	public void setDataHelper(DataHelper dataHelper) {
		this._dataHelper = dataHelper;
	}
	
	public void setResult(RowSet rowSet) {
		this._result = rowSet;
	}
	
	public void setTableName(String tableName) {
		this._tableName = tableName;
	}
	
	public String getTableName() {
		return this._tableName;
	}
	
	public void setDatabaseConfig(DatabaseConfig config) {
		this._dbconfig = config;
	}
	
	public DatabaseConfig getDatabaseConfig() {
		return this._dbconfig;
	}
	
	/**
	 * Stores the value of a field from the current result set to a variable with specified name
	 * 
	 * @param fieldName the field to lookup in result set
	 * @param variableName the variable name to store the resulting value under
	 * @throws XTestException exception is thrown when there is no resultset, the nr of rows in the resultset is not equal to one, the field name is not found in the resultset or the value for the field is null.
	 */
	public void setVariable(String fieldName, String variableName) throws XTestException {
		int columnToRead = -1;	
		boolean isArray = false;
		if (this._result == null) {
				throw new XTestException("No result is stored to read variable from");
			}
			
			try {
				//move cursor to last row, if false no row was found
				if (this._result.last()==false) {
					throw new XTestException(String.format("The result contains no rows to read variable %s from", variableName));
				}		
				
				//Get row number of last row, if not one, isArray is true
				if (this._result.getRow() != 1) {
					isArray = true;
					logger.info(String.format("Reading %d rows into variable %s", this._result.getRow(), variableName));
				}
				
				//Limit records to read to 500
				if (this._result.getRow() > 500) {
					throw new XTestException(String.format("Trying to read %d records into variable %s from %s. the max no of records supported is 500", this._result.getRow(), variableName, fieldName));
				}
			} catch (SQLException e) {
				throw new XTestException(XTestException.getCompositeErrorMessage("Error getting last record in result set for setting variable", e));
			}
			
			
			try {
				//Lookup field name, if not found, throw error
				for (int i = 1; i <= this._result.getMetaData().getColumnCount();i++) {
					if (this._result.getMetaData().getColumnName(i).equalsIgnoreCase(fieldName)) {
						columnToRead = i;					
					}
				}
				if (columnToRead == -1) { 
					throw new XTestException(String.format("Field %s not found in resultset for setting variable", fieldName));
				}
				if (isArray == false) {
					//Get result and store in variables hashmap
					readVariableFromResult(fieldName, columnToRead, variableName);
				}
				else {
					this._result.beforeFirst();
					int rowCount = 0;
					while (this._result.next()) {
						String arrVariableName = String.format("%s[%d]", variableName, rowCount);
						readVariableFromResult(fieldName, columnToRead, arrVariableName);						
						rowCount++;
					}
				}
					
			} catch (SQLException e) {
				throw new XTestException(XTestException.getCompositeErrorMessage("Error looking up field in result for setting variable", e));
			}
	}
	
	/**
	 * Reads a value from the result set's current record and stores it under the given variable name
	 * @param fieldName the column name to read
	 * @param columnToRead the column position to read
	 * @param variableName the variable name to use
	 */
	private void readVariableFromResult(String fieldName, int columnToRead, String variableName) throws XTestException {
		try {
			String variableValue = this._result.getString(columnToRead);
			logger.info(String.format("Storing value %s from field %s under variable name %s", variableValue, fieldName, variableName));
			this._variables.put(ResultContext.VARIABLE_PREFIX.concat(variableName), variableValue);
			if (this._result.wasNull()) {
				logger.info(String.format("Read NULL for %s into %s", fieldName, variableName));
				throw new XTestException(String.format("Result read for %s was null", fieldName));
			}
		}
		catch (SQLException e) {
			throw new XTestException(XTestException.getCompositeErrorMessage(String.format("Error reading %s from position %d into variable %s", fieldName, columnToRead, variableName), e));
		}
	}
	
	/**
	 * 
	 * Retrieves the value of a variable
	 * @param variableName the variable to get the value of
	 * @return the value found
	 * @throws XTestException exception when the variable is not found
	 */
	public String getVariable(String variableName) throws XTestException{
		if (this._variables.containsKey(variableName)) {
			return this._variables.get(variableName);
		}
		else throw new XTestException(String.format("Variable %s not found", variableName));
	}
	
	/**
	 * Replace all variables that are used in the text with their proper values
	 * @param text the text that contains variables to substitute
	 * @return the text with substituted variables
 
	 */
	public String substituteVariables(String text){
		//Loop through all defined variables
		//First sort the variables based on length so there is no replacement of partial variable names if a longer one also exist
		logger.info(String.format("Start replacing variables in text %s", text));
		LinkedList<String> sortedKeys =new LinkedList<>();
		//Get value and substitute in text
		for(String varKey:this._variables.keySet()) {			
			Boolean addedKey = false;
			for (int i = 0; i < sortedKeys.size();i++) {
				//If current key is smaller then sorted key add it at the current position so larger keys are shifted right
				if (varKey.length() < sortedKeys.get(i).length()) {
					sortedKeys.add(i, varKey);
					addedKey = true;
					break;
				}
			}
			//If key is not added at this point, add it to end of the list.
			if (!addedKey) {
				sortedKeys.addLast(varKey);
			}
		}
		//Now process sorted key list backwards
		for (int i = sortedKeys.size() -1; i >=0;i--) {
			String sortedKey = sortedKeys.get(i);
			logger.info(String.format("Replacing variable %s", sortedKey));
			String varValue = this._variables.get(sortedKey);
			text = text.replaceAll(sortedKey.replace("[",  "\\[").replace("]", "\\]"), varValue);
		}
		logger.info(String.format("Text with substituted variables: %s", text));
		return text;
	}
	
	public void compareResult(DataTable expectedResults) throws XTestException {
		try {
			DatabaseConfig databaseConfig = this.getDatabaseConfig();
			//Define actual rowset first
			if (this._result == null) {
				//Only possible if connection and table are set
				if (this._tableName == null) {
					throw new XTestException(String.format("Trying to compare result but connection or table is not set in result context, retrieve data first"));
				}
				this._result = DatabaseCommandExecutor.executeCommandWithCachedResult(this._dataHelper.getConnection(databaseConfig), this._dataHelper.getSQLSelectFrom(expectedResults, this._tableName, databaseConfig), databaseConfig);
			}
			else {
				if (this._result.getMetaData() == null) {
					throw new XTestException("There is no actual result to compare with");
				}
			}
			
			RowSet actualRowSet = this._result;
			
			RowSetFactory factory = RowSetProvider.newFactory();
			CachedRowSet expectedRowSet = factory.createCachedRowSet();
			// Set the metadata of the cached rowset to the same as one the actual rowset.
			expectedRowSet.setMetaData((RowSetMetaData)actualRowSet.getMetaData());
			expectedRowSet.setTypeMap(actualRowSet.getTypeMap());
			this._dataHelper.populateCachedRowSetFromDataTable(expectedRowSet, expectedResults, false, true, true, databaseConfig);
			//CachedRowSet ExpectedRowSet = DataHelper.dataTableToRowSet(ResultContext.getResultContext().getTableName(), expectedResults, ResultContext.getResultContext().getConnection(), true, false, ResultContext.getResultContext().getDatabaseConfig());
			
			
			
			//Compare metadata
			resultSetMetaDataIsEqual(expectedRowSet);		
			//Get list of fields to compare
			List<List<String>> list = expectedResults.asLists();
			if (list.size() > 0) {
				//Get column names from first row			}
				LinkedList<String>columnNames = new LinkedList<>();
				for (String s: list.get(0)) {
					columnNames.addLast(s.toLowerCase());
				}				
				resultSetDataIsEqual(expectedRowSet, columnNames);
			}
					
		} catch (SQLException e) {
			throw new XTestException(e.getMessage());
		} finally {
			//Unset result after comparison to allow for multiple compares in one scenario
			this._result = null;
		}
	}
	
	private void resultSetMetaDataIsEqual(RowSet expectedResult) throws XTestException{
		try {
			ResultSetMetaData actualMetaData = _result.getMetaData();
			ResultSetMetaData expectedMetaData = expectedResult.getMetaData();
			String findings = "";
			//Check if all expected columns are found with appropriate datatype
			for (int i = 1; i <= expectedMetaData.getColumnCount();i++) {
				if (actualMetaData.getColumnCount() < i) {
					findings = findings.concat(String.format("Expected column %s on position %d but actual result does not have this column " , expectedMetaData.getColumnName(i), i));
				}
				else {
					//Check for name
					if (!expectedMetaData.getColumnName(i).equalsIgnoreCase(actualMetaData.getColumnName(i))) {
						findings = findings.concat(String.format("Expected column %s on position %d but found %s ", expectedMetaData.getColumnName(i), i, actualMetaData.getColumnName(i)));
					}
					//check for datatype
					else {
						if (!expectedMetaData.getColumnTypeName(i).equalsIgnoreCase(actualMetaData.getColumnTypeName(i))) {
							findings = findings.concat(String.format("Expected type %s for column %s but found %s ", expectedMetaData.getColumnTypeName(i), expectedMetaData.getColumnName(i), actualMetaData.getColumnTypeName(i)));
						}
					}
				}
			}						
			//Assert.assertTrue(findings, findings.equalsIgnoreCase(""));
			if (!findings.equalsIgnoreCase("")) {
				throw new XTestResultComparisonException(findings);
			}
		}
		catch (SQLException e) {
			throw new XTestDatabaseException(e.getMessage());
		}
	}

	private LinkedList<LinkedList<String>> getRecordsToReport(String baseSetName, HashMap<String, RecordInformation> baseHashes, RowSet baseRows, String compareWithSetName, HashMap<String, RecordInformation> compareWithHashes, boolean doCompareOccurences, StringBuilder findingsSB)
			throws XTestException {
		LinkedList<LinkedList<String>> recordsToReport = new LinkedList<>();
		for (String baseHash:baseHashes.keySet()) {
			// If an base hash can't be found in the compare-with-hashset, we have one or multiple base-set-rows which aren't found in the compare-with-set.
			if (!compareWithHashes.containsKey(baseHash)) {
				int currentRowNumber = 0;
				int reportedRowsCount = 0;
				LinkedList<Integer> recordNumbersToReport = baseHashes.get(baseHash).getRecords();
				// Loop through the expected records which match the current hash, and report the records.
				try {
					// Perform the first in an if because we shouldn't call .next when the rowset is empty.
					baseRows.beforeFirst();
					while (baseRows.next()) {
						// Increase the row counter.
						currentRowNumber++;
						// If the current row number is in the list of records to report, report it.
						if (recordNumbersToReport.contains(currentRowNumber)) {
							findingsSB.append(String.format("%s record %d not found in %s result ", baseSetName, currentRowNumber, compareWithSetName)).append("\n");
							logger.info(String.format("%s record %d not found in %s result ", baseSetName, currentRowNumber, compareWithSetName));
							recordsToReport.addLast(this._dataHelper.rowSetRecordToList(baseRows));
							reportedRowsCount++;

							// Break out of the while loop if we have reported all rows.
							if (reportedRowsCount == recordNumbersToReport.size())
								break;
						}
					}

					// If we haven't reported the rows whe should have, throw an exception.
					if (reportedRowsCount != recordNumbersToReport.size()) {
						logger.severe("We haven't reported all records which can't be found!");
					}
				}
				catch(SQLException exc) {
					throw new XTestException(String.format("Error getting records from %s results: %s", baseSetName, exc.getMessage()));
				}
			}
			// If an expected hash can be found in the actual set, but the number of occurrences doesn't match, report it.
			else if (doCompareOccurences && baseHashes.get(baseHash).getOccurences() != compareWithHashes.get(baseHash).getOccurences()) {
				int rowToFind = baseHashes.get(baseHash).getRecords().getFirst();
				findingsSB.append(String.format("%s record %d has a different number of duplicate rows in the %s and %s result (%d rows vs %d rows).", baseSetName, rowToFind, baseSetName, compareWithSetName, baseHashes.get(baseHash).getOccurences(), compareWithHashes.get(baseHash).getOccurences())).append("\n");
				logger.info(String.format("%s record %d has a different number of duplicate rows in the %s and %s result (%d rows vs %d rows).", baseSetName, rowToFind, baseSetName, compareWithSetName, baseHashes.get(baseHash).getOccurences(), compareWithHashes.get(baseHash).getOccurences()));
			}
		}
		//If records were found, add header
		if (recordsToReport.size() > 0) {
			recordsToReport.addFirst(this._dataHelper.rowSetHeader(baseRows));
		}
		else {
			recordsToReport = null;
		}
		return recordsToReport;
	}
	
	private void resultSetDataIsEqual(RowSet expectedResult, LinkedList<String> fieldsToCheck) throws XTestException, CucumberDataComparisonException {
		
		HashMap<String, RecordInformation> actualHashes = this._dataHelper.getHashSet(this._result, fieldsToCheck);
		HashMap<String, RecordInformation> expectedHashes = this._dataHelper.getHashSet(expectedResult, fieldsToCheck);
		
		StringBuilder findingsSB = new StringBuilder();
		// Both hashsets should have the same nr of records
		if (actualHashes.size() != expectedHashes.size()) {
			findingsSB.append(String.format("Expected %d unique records but found %d unique records ", expectedHashes.size(), actualHashes.size())).append("\n");
			logger.info(String.format("Expected %d unique records but found %d unique records ", expectedHashes.size(), actualHashes.size()));
		}
		
		//Check if all records expected are found
		//Add rows not found to the expectedNotfound table
		logger.info("Comparing expected against actual");
		LinkedList<LinkedList<String>> expectedNotFound =  getRecordsToReport("expected", expectedHashes, expectedResult, "actual", actualHashes, true, findingsSB);
		
		//Check if all records found are expected
		logger.info("Comparing actual against expected");
		LinkedList<LinkedList<String>> foundNotExpected = getRecordsToReport("actual", actualHashes, this._result, "expected", expectedHashes, false, findingsSB);
		
		//Findings should be an empty string
		String findings = findingsSB.toString();
		if (findings.length() > 0) {
			throw new CucumberDataComparisonException(findings, expectedNotFound, foundNotExpected);
		}
	}
	
	/**
	private LinkedList<LinkedList<String>> getMissingRecords(HashMap<String, Integer> baseSet, HashMap<String, Integer> targetSet, RowSet targetRowSet)throws SQLException, XTestException{
		LinkedList<LinkedList<String>> missingRecords = new LinkedList<>();
		for (String hashToFind:baseSet.keySet()) {
			if (!targetSet.containsKey(hashToFind)) {
				int currentRow = 1;
				int rowToFind = baseSet.get(hashToFind);				
				
				if (targetRowSet.first()) {
					while (currentRow <= rowToFind) {
						if (currentRow==rowToFind) {
							missingRecords.addLast(DataHelper.rowSetRecordToList(targetRowSet));
						}							
						targetRowSet.next();
						currentRow++;
					}
				}					
			}
		}
		//If records were found, add header
		if (missingRecords.size() > 0) {
			missingRecords.addFirst(DataHelper.rowSetHeader(targetRowSet));
			return missingRecords;
		}
		else {
			return null;
		}	
	}
	*/
}
