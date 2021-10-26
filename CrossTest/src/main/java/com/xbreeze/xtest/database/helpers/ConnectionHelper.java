package com.xbreeze.xtest.database.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Properties;
import java.util.logging.Logger;

import com.xbreeze.xtest.config.DatabaseConfig;
import com.xbreeze.xtest.config.DatabaseCustomDataTypeConfig;
import com.xbreeze.xtest.config.DatabaseServerConfig;
import com.xbreeze.xtest.exception.XTestDatabaseException;
import com.xbreeze.xtest.exception.XTestException;
import com.xbreeze.xtest.modules.security.CredentialProvider_Helper;

public class ConnectionHelper {
	static final Logger logger = Logger.getLogger(DataHelper.class.getName());
	
	private String _connectionName;
	private Connection _connection;
	// Store the current schema, so we know when to switch schema during test execution.
	private String _currentSchema = null; 

	private ConnectionHelper(String connectionName, Connection connection) {
		this._connectionName = connectionName;
		this._connection = connection;
	}
	
	public Connection getConnection () {
		return this._connection;
	}
	
	/***
	 * Create a new connection for a specific database server configuration object.
	 * @param databaseServerConfig The database server configuration.
	 * @returnThe new connection
	 * @throws XTestDatabaseException
	 */
	public static ConnectionHelper fromDatabaseServerConfig(DatabaseServerConfig databaseServerConfig, CredentialProvider_Helper credentialProviderHelper) throws XTestDatabaseException {
		Connection conn = null;
	    Properties connectionProps = new Properties();
	    //Set username and password if given
		if (databaseServerConfig.getUsername() != null) {
	    	connectionProps.put("user", getResolvedCredential(credentialProviderHelper, databaseServerConfig.getCredentialProvider(), databaseServerConfig.getUsername()));
	    }
	    if (databaseServerConfig.getPassword() != null) {		    
	    	connectionProps.put("password", getResolvedCredential(credentialProviderHelper, databaseServerConfig.getCredentialProvider(), databaseServerConfig.getPassword()));
	    }
	    
	    try {
			conn = DriverManager.getConnection(databaseServerConfig.getJDBCUrl(), connectionProps);
		} catch (SQLException e) {
			throw new XTestDatabaseException(e.getMessage());
		}
	    
	    //Set custom type map custom data types defined in config		
	 	HashMap<String, Class<?>> cTypes  = new HashMap<>();
	 	for(DatabaseCustomDataTypeConfig cdt: databaseServerConfig.getCustomDataTypes()) {
				cTypes.put(cdt.getDataType(), cdt.getClassRef());
	 	}
		try {
			conn.setTypeMap(cTypes);
		} catch (SQLException exc){
			throw new XTestDatabaseException(String.format("Could not set custom typemap on connection '%s': %s", databaseServerConfig.getName(), exc.getMessage()));
		}
	    logger.info(String.format("Connected to database server '%s'", databaseServerConfig.getName()));
	    return new ConnectionHelper(databaseServerConfig.getName(), conn);
	}
	
	private static String getResolvedCredential(CredentialProvider_Helper credentialProviderHelper, String credentialProvider, String credential) throws XTestDatabaseException {
		//If no credential provider was given, return the credential unprocessed
		if (credentialProvider == null || credentialProvider.equalsIgnoreCase("")) {
			return credential;
		} else {
			//Resolve the credential via the credentialprovider
			try {
				return credentialProviderHelper.resolveCredential(credentialProvider, credential);
			} catch(XTestException exc) {
				throw new XTestDatabaseException(String.format("Could not resolve %s using credential provider %s: %s", credential, credentialProvider, exc.getMessage()));
			}
		}
	}
	
	/***
	 * Configure a server connection using the Database Config specified in the current phrase.
	 * @param conn The connection to configure.
	 * @param dbConfig The database config to use.
	 * @throws XTestDatabaseException
	 */
	public void configureServerConnection(DatabaseConfig dbConfig, boolean scenarioIsInTransaction) throws XTestDatabaseException {
	    //If a schema was given on the database config, try to set it as a default catalog or schema behavior is DB platform specific
	    String schemaName = dbConfig.getSchema().trim();
	    // If the schema name is specified and it differs from the current schema, switch from schema.
		if (schemaName.length() > 0 && (this._currentSchema == null || !schemaName.equals(this._currentSchema))) { 
	    	//If a custom statement is specified for set schema, substitute database name in template and execute statement
	    	if (dbConfig.getDatabaseServerConfig().getSetSchemaTemplate() != null) {	    		
	    		String stmtText = dbConfig.getDatabaseServerConfig().getSetSchemaTemplate().replace("{SCHEMA}", schemaName);
	    		logger.info(String.format("Setting default catalog using setSchema template, statement is '%s'", stmtText));
	    		try {
	    		  Statement stmt = this._connection.createStatement() ;
	    		  stmt.executeUpdate (stmtText);
	    		  stmt.close(); 
	    		}
	    		catch (SQLException exc) {
	    			throw new XTestDatabaseException(String.format("Could not set default catalog using setSchema template: '%s'", exc.getMessage()));	    			
	    		}
	    	}
	    	//If no custom statement is specified, try to set db using setSchema and setCatalog
	    	else {
		    	boolean schemaSet = false;
		    	boolean dbSet = false; 
			    try {
			    	//Set the catalog based on the schema
			    	logger.fine(String.format("Setting default catalog to '%s'", schemaName));
			    	this._connection.setCatalog(schemaName);
					dbSet = true;
			    }
			    catch (SQLException | AbstractMethodError exc){
			    	logger.fine(String.format("Could not set catalog based on schema '%s': %s", schemaName, exc.getMessage()));		    	
			    }
			    
			    try {
		    		logger.fine(String.format("Setting default schema to: '%s'", schemaName));
		    		this._connection.setSchema(schemaName);
		    		schemaSet = true;
		    	}
		    	catch (SQLException | AbstractMethodError excs) {
		    		logger.fine(String.format("Could not set schema to '%s': %s", schemaName, excs.getMessage()));
		    		if (dbSet == false && schemaSet == false) {
		    			throw new XTestDatabaseException(String.format("Could not set default catalog or schema to '%s'", schemaName));
		    		}
		    	}
	    	}
	    	// Store the current schema.
	    	this._currentSchema = schemaName;
	    }
	    
		// If transaction mode is enabled on the scenario context, but it's not enabled yet on the connection, enable it here.
		try {
			if (scenarioIsInTransaction && this._connection.getAutoCommit() != false) {
				logger.info(String.format("Running in a transaction, setting AutoCommit off for connection '%s'", this._connectionName));
				// If scenario is run in a transaction set autocommit to false on the connection.
				this._connection.setAutoCommit(false);
				// Set the isolation level to repeatable read.
				this._connection.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
			}
		} catch (SQLException e) {
			throw new XTestDatabaseException(String.format("Error while starting transaction on connection '%s': %s", this._connectionName, e.getMessage()));
		}
	}
}
