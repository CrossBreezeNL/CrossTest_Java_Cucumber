package com.xbreeze.xtest.database.helpers;

import java.sql.SQLData;
import java.sql.Struct;

public interface CustomDataType extends SQLData, Struct {

	/**
	 * Initialize the data type with the attribute values coming from the array
	 * @param attributes
	 */
	public void initalize(String[] attributes);
	
	/**
	 * Returns all attributes in string value
	 */
	public String toString();
	
}
