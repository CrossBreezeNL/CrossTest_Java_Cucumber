package com.xbreeze.xtest.modules.data.database.dbtable;

import com.xbreeze.xtest.config.CompositeObjectConfig;
import com.xbreeze.xtest.config.CompositeObjectTableConfig;
import com.xbreeze.xtest.config.DatabaseConfig;
import com.xbreeze.xtest.config.ObjectTemplateConfig;
import com.xbreeze.xtest.config.XTestConfig;
import com.xbreeze.xtest.database.helpers.DataHelper;
import com.xbreeze.xtest.database.helpers.DatabaseCommandExecutor;
import com.xbreeze.xtest.exception.XTestDatabaseException;
import com.xbreeze.xtest.exception.XTestException;
import com.xbreeze.xtest.modules.data.database.Database_Helper;
import com.xbreeze.xtest.result.ResultContext;

import io.cucumber.datatable.DataTable;

public class DbTable_Helper extends Database_Helper{
	
	public DbTable_Helper(ResultContext resultContext, DataHelper dataHelper, XTestConfig config) throws XTestException {
		super(resultContext, dataHelper, config);
	}

	public void DeleteTemplatedTableData(String dbConfig,String tableName) throws Throwable {
		DatabaseCommandExecutor.emptyDatabaseObject(super.getConnection(dbConfig), _config.getDatabaseConfig(dbConfig).getQualifiedTableName(tableName), _config.getDatabaseConfig(dbConfig));
	}
	
	public void InsertDataIntoTable(String dbConfig,String tableName, DataTable table) throws Throwable{
		this._dataHelper.writeDataTableToDatabase(tableName, table, _config.getDatabaseConfig(dbConfig), false, true);
	}
	
	public void InsertDataIntoTableUsingTemplate (
            String dbConfig,String tableName, String objectTemplate, DataTable table) throws Throwable {
			
			//Temporary overwrite config for table
			DatabaseConfig databaseConfig = _config.getDatabaseConfig(dbConfig);
			ObjectTemplateConfig originalTemplate = databaseConfig.getTemplate();
			ObjectTemplateConfig newTemplate = _config.getObjectTemplateConfig(objectTemplate);
			databaseConfig.setTemplate(newTemplate);
			databaseConfig.setTemplateName(newTemplate.getName());
			
			//Then insert data
			InsertDataIntoTable (dbConfig, tableName, table);
			
			//Restore config
			databaseConfig.setTemplate(originalTemplate);
			if (originalTemplate != null) {
				databaseConfig.setTemplateName(originalTemplate.getName());
			} else {
				databaseConfig.setTemplateName(null);
			}
		
	}
	
	public void RetrieveDataOfTemplatedTable(String dbConfig, String tableName) throws XTestDatabaseException{
		//Set properties of the result context so, based on the expected result, the appropriate query can be executed (using table and db config)
		_resultContext.setTableName(_config.getDatabaseConfig(dbConfig).getQualifiedTableName(tableName));
		_resultContext.setDatabaseConfig(_config.getDatabaseConfig(dbConfig));
		//Reset any result already in result context
		_resultContext.setResult(null);
	}
	
	public void DeleteDataFromCompositeObject(String objectName) throws Throwable {
		CompositeObjectConfig coc = _config.getCompositeObjectConfig(objectName);
		//Truncate all context tables for the composite object
		for (CompositeObjectTableConfig coTable:coc.getContextTables()) {
			DatabaseCommandExecutor.emptyDatabaseObject(getConnection(coTable.getDatabaseConfigName()), _config.getDatabaseConfig(coTable.getDatabaseConfigName()).getQualifiedTableName(coTable.getTableName()), _config.getDatabaseConfig(coTable.getDatabaseConfigName()));
		}
		//Truncate all key tables for the composite object
		for (CompositeObjectTableConfig coTable:coc.getKeyTables()) {
			DatabaseCommandExecutor.emptyDatabaseObject(getConnection(coTable.getDatabaseConfigName()), _config.getDatabaseConfig(coTable.getDatabaseConfigName()).getQualifiedTableName(coTable.getTableName()), _config.getDatabaseConfig(coTable.getDatabaseConfigName()));
		}		
	}
	
	public void AddKeyTableToCompositeObject(String keyTable, String dbConfig, String compositeObject) throws Throwable{
		_config.addKeyTableForCompositeObject(compositeObject, dbConfig, keyTable);
	}

	public void AddContextTableToCompositeObject(String contextTable, String dbConfig, String compositeObject) throws Throwable{
		_config.addContextTableForCompositeObject(compositeObject, dbConfig, contextTable);
	}
	
	public void LoadDataForCompositeObject(String objectName, DataTable table) throws Throwable{
		CompositeObjectConfig coc = _config.getCompositeObjectConfig(objectName);
		for (CompositeObjectTableConfig coTable:coc.getKeyTables()) {
			this._dataHelper.writeDataTableToDatabase(coTable.getTableName(), table, _config.getDatabaseConfig(coTable.getDatabaseConfigName()), true, false );
		}
		
		for (CompositeObjectTableConfig coTable:coc.getContextTables()) {
			this._dataHelper.writeDataTableToDatabase(coTable.getTableName(), table, _config.getDatabaseConfig(coTable.getDatabaseConfigName()), false, false);
			
		}
	}

}