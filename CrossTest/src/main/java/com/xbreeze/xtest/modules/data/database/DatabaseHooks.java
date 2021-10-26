package com.xbreeze.xtest.modules.data.database;

import com.xbreeze.xtest.database.helpers.DataHelper;

import io.cucumber.java.After;

/***
 * Hooks for database pre and post actions on scenarios
 * @author Willem
 *
 */
public class DatabaseHooks {

	DataHelper _dataHelper;
	
	/***
	 * Constructor, stores a reference to the dataHelper singleton
	 * @param resultContext
	 */
	public DatabaseHooks(DataHelper dataHelper) {
		this._dataHelper = dataHelper;
	}
	
	@After
	/***
	 * Cleanup all database connections after every scenario.
	 */
	public void cleanupDatabaseConnections() {
		this._dataHelper.closeConnections();
	}
}
