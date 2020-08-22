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
package com.xbreeze.xtest.database.helpers;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.util.logging.Logger;

import com.xbreeze.xtest.config.DatabaseConfig;
import com.xbreeze.xtest.exception.XTestDatabaseException;

public class DatabaseCommandExecutor {
	
	static final Logger logger = Logger.getLogger(DatabaseCommandExecutor.class.getName());

	
	/**
	 * Execute a command to an open connection, expecting no result *such as update, truncate, etc)
	 * @param connection the connection to use
	 * @param sqlCommand the command to execute
	 * @throws XTestDatabaseException
	 */
	public static void executeCommandWithoutResult(Connection connection, String sqlCommand, DatabaseConfig dbConfig) throws XTestDatabaseException {
		Statement stmt;
		try {
			stmt = connection.createStatement();
			if (dbConfig.getCommandTimeOut() > 0) {
				stmt.setQueryTimeout(dbConfig.getCommandTimeOut());
			}
			logger.info(String.format("executeCommandWithoutResult: '%s'", sqlCommand));
			stmt.executeUpdate(sqlCommand);
			stmt.close();
		} catch (SQLException e) {			
			throw new XTestDatabaseException(e.getMessage());
		}	
		
	}
	
	/**
	 * Execute a query to populate a cached rowset
	 * connection the database conection to use
	 * @param sqlCommand the query to execute
	 * @return a cached rowset with the query result
	 * @throws XTestDatabaseException
	 */
	
	public static CachedRowSet executeCommandWithCachedResult(Connection connection, String sqlCommand, DatabaseConfig dbConfig) throws XTestDatabaseException {
		try {
			logger.info(String.format("executeCommandWithCachedResult: '%s'", sqlCommand));
			RowSetFactory factory = RowSetProvider.newFactory();
			CachedRowSet crs = factory.createCachedRowSet();			
			crs.setCommand(sqlCommand);
			
			if (dbConfig.getCommandTimeOut() > 0) {
				crs.setQueryTimeout(dbConfig.getCommandTimeOut());
			}
			crs.execute(connection);
			//crs.setUrl(connection.getMetaData().getURL());
			return crs;
		}
		catch(SQLException exc) {
			throw new XTestDatabaseException(exc.getMessage());
		}
	}
	
	/**
	 * Procedure to empty a database object.
	 * We use DELETE i.s.o. TRUNCATE, because:
	 * 	- Not all DMBS systems support TRUNCATE (f.e. Teradata)
	 *  - If a table has foreign keys defined on it you cannot truncate.
	 * @param connection The connection to use.
	 * @param fqObjectNameToEmpty The fully qualified object name to empty.
	 * @throws XTestDatabaseException
	 */
	public static void emptyDatabaseObject(Connection connection, String fqObjectNameToEmpty, DatabaseConfig dbConfig) throws XTestDatabaseException {
		logger.info(String.format("Executing DELETE FROM %s;",fqObjectNameToEmpty));
		executeCommandWithoutResult(connection, String.format("DELETE FROM %s;", fqObjectNameToEmpty), dbConfig);
	}
}
