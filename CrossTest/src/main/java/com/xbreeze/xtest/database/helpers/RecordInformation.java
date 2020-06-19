package com.xbreeze.xtest.database.helpers;

import java.util.LinkedList;

/**
 * Class is used to store record information during comparison of actual and expected results
 * @author Willem
 *
 */
public class RecordInformation {

	
	/**
	 * The record hash
	 */
	private String _hashValue;
	
	/**
	 * A list of record numbers having the same hash value
	 */
	private LinkedList<Integer> _recordPointers;

	public RecordInformation(String hashValue, int recordNr) {
		this._hashValue = hashValue;
		_recordPointers = new LinkedList<>();
		_recordPointers.add(recordNr);		
	}
	
	/** 
	 * Adds a record number to the list
	 * @param recordNr
	 */
	public void addRecordNumber(int recordNr) {
		this._recordPointers.add(recordNr);
	}
	
	/**
	 * Returns the number of occurences or the record hash
	 * @return
	 */
	public int getOccurences() {
		return this._recordPointers.size();
	}
	
	/**
	 * Returns the list of record numbers
	 * @return
	 */
	public LinkedList<Integer> getRecords() {
		return this._recordPointers;
	}
}
