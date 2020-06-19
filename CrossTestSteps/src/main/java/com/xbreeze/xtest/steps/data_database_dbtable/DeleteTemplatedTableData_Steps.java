package com.xbreeze.xtest.steps.data_database_dbtable;
import com.xbreeze.xtest.modules.data.database.dbtable.DbTable_Helper;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.Given;

    public class DeleteTemplatedTableData_Steps
    {

        private DbTable_Helper _DbTable_helper;
        
        public DeleteTemplatedTableData_Steps(DbTable_Helper DbTable_helper) {
            _DbTable_helper = DbTable_helper;
        }

        @Given("^the ([a-zA-Z0-9_@$#-]+) table (.+) is empty$")
        public void Given_EN_the__azAZ09_64__table__azAZ09___azAZ09_64__azAZ09_64___azAZ09_64____azAZ09_64___is_empty(
            String database_config,
            String table_name
        ) throws Throwable
        {
            _DbTable_helper.DeleteTemplatedTableData(
                database_config,
                table_name
            );
        }

    }