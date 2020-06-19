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
package com.xbreeze.xtest.exception;

public class XTestResultComparisonException extends AssertionError {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8359490619263394798L;
	
	private static String UNDEFINED = "-UNDEFINED-";
	private String expectedResult = UNDEFINED;
	private String actualResult = UNDEFINED;
	private String errorMessage = "";
	
	public XTestResultComparisonException(String message) {
		super(message);	
		errorMessage = message;
	}
	
	@Override 
	public String getMessage() {
		if(expectedResult.equals(UNDEFINED) && actualResult.equals(UNDEFINED)) {
			return errorMessage;
		}					
		return String.format("%s: expected %s but found %s",errorMessage, expectedResult, actualResult);
	}
	
	public XTestResultComparisonException (String message, String expectedResult, String actualResult) {
		this(message);
		this.errorMessage = message;
		this.expectedResult = expectedResult;
		this.actualResult = actualResult;
	}
	
}
