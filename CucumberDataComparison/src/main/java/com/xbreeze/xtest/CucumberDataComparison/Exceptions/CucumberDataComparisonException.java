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
package com.xbreeze.xtest.CucumberDataComparison.Exceptions;

import java.util.LinkedList;

public class CucumberDataComparisonException extends AssertionError {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4512280558619984142L;

	private LinkedList<LinkedList<String>> expectedNotFound;
	private LinkedList<LinkedList<String>> foundNotExpected;
	private String shortMessage;
	public CucumberDataComparisonException(String message, LinkedList<LinkedList<String>> expectedNotFound, LinkedList<LinkedList<String>> foundNotExpected) {
		super(buildFullMessage(expectedNotFound, foundNotExpected));
		this.expectedNotFound = expectedNotFound;
		this.foundNotExpected = foundNotExpected;
		this.shortMessage = message;
	}
	
	public String getShortMessage () {
		return this.shortMessage;
	}
	public LinkedList<LinkedList<String>> getExpectedNotFound() {
		return this.expectedNotFound;
	}
	
	public LinkedList<LinkedList<String>> getFoundNotExpected(){		
		return this.foundNotExpected;
	}
	
	private static String buildFullMessage(LinkedList<LinkedList<String>> expectedNotFound, LinkedList<LinkedList<String>> foundNotExpected) {
		String message = "Differences found: \n";
		if (expectedNotFound != null && expectedNotFound.size() > 0) {
			message = message.concat("Expected not found: \n");
			message = message.concat(transformRecordsToMessage(expectedNotFound));
		}
		
		if (foundNotExpected != null && foundNotExpected.size() > 0) {
			message = message.concat("Found not expected: \n");
			message = message.concat(transformRecordsToMessage(foundNotExpected));
		}
		return message;
	}
	
	private static String transformRecordsToMessage(LinkedList<LinkedList<String>> diffTable) {
		String message = "";
		LinkedList<Integer> fieldLengths = new LinkedList<>();
		//Loop over columns
		for (int i = 0;i < diffTable.get(0).size(); i++) {
			//For each column, determine max length of values in diffTable
			fieldLengths.addLast(1);
			for (LinkedList<String> record : diffTable) {
				if (record.get(i).length() > fieldLengths.get(i)) {
					fieldLengths.set(i, record.get(i).length());
				}
			}
		}
		//Add all records, padd to proper column length
		for (LinkedList<String> record : diffTable) {
			for (int i = 0;i < record.size(); i++) {
				String fieldValue = record.get(i);
				int fieldPadding = fieldLengths.get(i) + 1;
				 
				message = message.concat("| ").concat(String.format("%1$-" + fieldPadding + "s", fieldValue));
			}
			message = message.concat("|\n");
		}
		return message;
	}
	
	

}
