package com.xbreeze.xtest.steps.data_database_dbtable;
import com.xbreeze.xtest.modules.data.database.dbtable.DbTable_Helper;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.When;

    public class InsertDataIntoTableUsingTemplate_Steps
    {

        private DbTable_Helper _DbTable_helper;
        
        public InsertDataIntoTableUsingTemplate_Steps(DbTable_Helper DbTable_helper) {
            _DbTable_helper = DbTable_helper;
        }

        @When("^I insert the following data in ([a-zA-Z0-9_@$#-]+) table (.+) using template ([a-zA-Z0-9_@$#-]+):$")
        public void When_EN_InsertDataIntoTableUsingTemplate_93EF7C5A_6C4C_4426_BEED_61F6D417252A(
            String database_config,
            String table_name,
            String object_template,
            DataTable data_to_insert
        ) throws Throwable
        {
            _DbTable_helper.InsertDataIntoTableUsingTemplate(
                database_config,
                table_name,
                object_template,
                data_to_insert
            );
        }

    }