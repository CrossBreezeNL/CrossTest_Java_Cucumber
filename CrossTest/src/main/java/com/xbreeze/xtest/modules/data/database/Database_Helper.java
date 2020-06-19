package com.xbreeze.xtest.modules.data.database;

import java.sql.Connection;

import com.xbreeze.xtest.config.XTestConfig;
import com.xbreeze.xtest.database.helpers.DataHelper;
import com.xbreeze.xtest.exception.XTestDatabaseException;
import com.xbreeze.xtest.exception.XTestException;
import com.xbreeze.xtest.result.ResultContext;

public class Database_Helper{
	
	protected XTestConfig _config;
	protected ResultContext _resultContext;
	protected DataHelper _dataHelper;
	
	public Database_Helper(ResultContext resultContext, DataHelper dataHelper) throws XTestException {
		this._resultContext = resultContext;
		this._dataHelper = dataHelper;
		resultContext.setDataHelper(dataHelper);
		_config = XTestConfig.getConfig();
	}
	
	protected Connection getConnection(String dbConfig) throws XTestDatabaseException{
		return this._dataHelper.getConnection(_config.getDatabaseConfig(dbConfig));			
	}
}
