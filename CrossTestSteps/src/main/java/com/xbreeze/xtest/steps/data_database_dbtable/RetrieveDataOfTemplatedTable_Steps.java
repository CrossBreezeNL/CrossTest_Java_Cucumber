package com.xbreeze.xtest.steps.data_database_dbtable;
import com.xbreeze.xtest.modules.data.database.dbtable.DbTable_Helper;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.When;

    public class RetrieveDataOfTemplatedTable_Steps
    {

        private DbTable_Helper _DbTable_helper;
        
        public RetrieveDataOfTemplatedTable_Steps(DbTable_Helper DbTable_helper) {
            _DbTable_helper = DbTable_helper;
        }

        @When("^I retrieve the contents of the ([a-zA-Z0-9_@$#-]+) (.+) (?:table|view)$")
        public void When_EN_I_retrieve_the_contents_of_the__azAZ09_64___azAZ09___azAZ09_64__azAZ09_64___azAZ09_64____azAZ09_64___tableview(
            String database_config,
            String table_name
        ) throws Throwable
        {
            _DbTable_helper.RetrieveDataOfTemplatedTable(
                database_config,
                table_name
            );
        }

    }