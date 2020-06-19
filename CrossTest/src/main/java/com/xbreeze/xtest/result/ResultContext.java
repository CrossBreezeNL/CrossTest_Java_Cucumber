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
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import javax.sql.RowSet;
import javax.sql.RowSetMetaData;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import com.xbreeze.xtest.CucumberDataComparison.Exceptions.CucumberDataComparisonException;
import com.xbreeze.xtest.config.DatabaseConfig;
import com.xbreeze.xtest.database.helpers.DataHelper;
import com.xbreeze.xtest.database.helpers.RecordInformation;
import com.xbreeze.xtest.database.helpers.DatabaseCommandExecutor;
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
		if (this._result == null) {
				throw new XTestException("No result is stored to read variable from");
			}
			
			try {
				//move cursor to last row, if false no row was found
				if (this._result.last()==false) {
					throw new XTestException("The result contains no rows to read variable from");
				}		
				
				//Get row number of last row, if not one, throw error
				if (this._result.getRow() != 1) {
					throw new XTestException(String.format("The result contains %d rows. Can only store result in variable when there is one row.",this._result.getRow()));
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
				//Get result and store in variables hashmap				
				String variableValue = this._result.getString(columnToRead);
				logger.info(String.format("Storing value %s from field %s under variable name %s", variableValue, fieldName, variableName));
				this._variables.put(ResultContext.VARIABLE_PREFIX.concat(variableName), variableValue);
				if (this._result.wasNull()) {
					throw new XTestException(String.format("Result read for %s was null", fieldName));
				}
					
			} catch (SQLException e) {
				throw new XTestException(XTestException.getCompositeErrorMessage("Error looking up field in result for setting variable", e));
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
			text = text.replaceAll(sortedKey, varValue);
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
			this._dataHelper.populateCachedRowSetFromDataTable(expectedRowSet, expectedResults, false, true, true, databaseConfig);
			//CachedRowSet ExpectedRowSet = DataHelper.dataTableToRowSet(ResultContext.getResultContext().getTableName(), expectedResults, ResultContext.getResultContext().getConnection(), true, false, ResultContext.getResultContext().getDatabaseConfig());
			
			
			
			//Compare metadata
			resultSetMetaDataIsEqual(expectedRowSet);		
			//Get list of fields to compare
			List<Map<String, String>> list = expectedResults.asMaps(String.class, String.class);
			if (list.size() > 0) {
				//Get column names from first row			}
				LinkedList<String>columnNames = new LinkedList<>();
				for (String s: list.get(0).keySet()) {
					columnNames.addLast(s.toLowerCase());
				}				
				resultSetDataIsEqual(expectedRowSet, columnNames);			}
					
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
	
	private void resultSetDataIsEqual(RowSet expectedResult, LinkedList<String> fieldsToCheck) throws XTestException, CucumberDataComparisonException {
		
		HashMap<String, RecordInformation> actualHashes = this._dataHelper.getHashSet(_result, fieldsToCheck);
		HashMap<String, RecordInformation> expectedHashes = this._dataHelper.getHashSet(expectedResult, fieldsToCheck);
		LinkedList<LinkedList<String>> expectedNotFound = new LinkedList<>();
		LinkedList<LinkedList<String>> foundNotExpected = new LinkedList<>();
		
		String findings = "";
		//Both hashsets should have the same nr of records
		if (actualHashes.size() != expectedHashes.size()) {
			findings.concat(String.format("Expected %d unique records but found %d unique records ", expectedHashes.size(), actualHashes.size()));
		}
		
		//Check if all records expected are found
		//Add rows not found to the expectedNotfound table
		try {
			for (String expectedHash:expectedHashes.keySet()) {
				if (!actualHashes.containsKey(expectedHash)) {
					int currentRow = 1;
					int rowToFind = expectedHashes.get(expectedHash).getRecords().getFirst();
					findings = findings.concat(String.format("Expected record %d not found in actual result ", rowToFind));					
					if (expectedResult.first()) {
						while (currentRow <= rowToFind) {
							if (currentRow==rowToFind) {
								expectedNotFound.addLast(this._dataHelper.rowSetRecordToList(expectedResult));
							}							
							expectedResult.next();
							currentRow++;
						}
					}					
				}
				else if (expectedHashes.get(expectedHash).getOccurences() != actualHashes.get(expectedHash).getOccurences()) {
					int rowToFind = expectedHashes.get(expectedHash).getRecords().getFirst();
					findings = findings.concat(String.format("Expected record %d has a different number of duplicate rows in the expected and actual result (%d rows vs %d rows).", rowToFind, expectedHashes.get(expectedHash).getOccurences(), actualHashes.get(expectedHash).getOccurences()));					
				}
			}
			//If records were found, add header
			if (expectedNotFound.size() > 0) {
				expectedNotFound.addFirst(this._dataHelper.rowSetHeader(expectedResult));
			}
			else {
				expectedNotFound = null;
			}
		}
		catch(SQLException exc) {
			throw new XTestDatabaseException(String.format("Error getting records from expected results: %s", exc.getMessage()));
		}
		
		//Check if all records found are expected
		try {
			for (String actualHash:actualHashes.keySet()) {
				if (!expectedHashes.containsKey(actualHash)) {
					int currentRow = 1;
					int rowToFind = actualHashes.get(actualHash).getRecords().getFirst();
					
					findings = findings.concat(String.format("Actual record %d not found in expected result", rowToFind));
					if (_result.first()) {
						while (currentRow <= rowToFind) {
							if (currentRow==rowToFind) {
								foundNotExpected.addLast(this._dataHelper.rowSetRecordToList(_result));
							}							
							_result.next();
							currentRow++;
						}
					}					
				}				
			}
			//If records were found, add header
			if (foundNotExpected.size() > 0) {
				foundNotExpected.addFirst(this._dataHelper.rowSetHeader(_result));
			}
			else {
				foundNotExpected = null;
			}	
		}
		catch(SQLException exc) {
			throw new XTestDatabaseException(String.format("Error getting records from actual results: %s", exc.getMessage()));
		}
		
		//Findings should be an empty string
		if (!findings.equals("")) {
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
