package com.xbreeze.xtest.modules.data.database.query;

import com.xbreeze.xtest.database.helpers.DatabaseCommandExecutor;
import com.xbreeze.xtest.config.XTestConfig;
import com.xbreeze.xtest.database.helpers.DataHelper;
import com.xbreeze.xtest.exception.XTestException;
import com.xbreeze.xtest.modules.data.database.Database_Helper;
import com.xbreeze.xtest.result.ResultContext;

import com.xbreeze.xtest.exception.XTestDatabaseException;

import javax.sql.rowset.CachedRowSet;

public class Query_Helper extends Database_Helper {

	public Query_Helper(ResultContext resultContext, DataHelper dataHelper, XTestConfig config) throws XTestException {
		super(resultContext, dataHelper, config);
	}
	
	public void ExecuteTheFollowingQueryOnConnection(String dbConfig,String query) throws XTestDatabaseException {
		query = _resultContext.substituteVariables(query);
		CachedRowSet crs = DatabaseCommandExecutor.executeCommandWithCachedResult(getConnection(dbConfig), query, _config.getDatabaseConfig(dbConfig));
		//Set result context if the query resulted in a result set.
		if (crs != null) {
			_resultContext.setResult(crs);
			_resultContext.setDatabaseConfig(_config.getDatabaseConfig(dbConfig));
		}
	}

	public void ExecuteTheFollowingStatementOnConnection(String dbConfig, String statement) throws XTestDatabaseException {
		statement = _resultContext.substituteVariables(statement);
		DatabaseCommandExecutor.executeCommandWithoutResult(getConnection(dbConfig), statement, _config.getDatabaseConfig(dbConfig));		
	}

	
}
