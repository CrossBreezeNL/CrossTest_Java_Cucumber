package com.xbreeze.xtest.steps.data_database_dbtable;
import com.xbreeze.xtest.modules.data.database.dbtable.DbTable_Helper;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.Given;

    public class AddKeyTableToCompositeObject_Steps
    {

        private DbTable_Helper _DbTable_helper;
        
        public AddKeyTableToCompositeObject_Steps(DbTable_Helper DbTable_helper) {
            _DbTable_helper = DbTable_helper;
        }

        @Given("^I have a key table named (.+) in ([a-zA-Z0-9_@$#-]+) for object (.+)$")
        public void Given_EN_I_have_a_key_table_named__azAZ09___azAZ09_64__azAZ09_64___azAZ09_64____azAZ09_64___in__azAZ09_64__for_object__azAZ09___azAZ09_64__azAZ09_64___azAZ09_64____azAZ09_64__(
            String table_name,
            String database_config,
            String composite_object
        ) throws Throwable
        {
            _DbTable_helper.AddKeyTableToCompositeObject(
                table_name,
                database_config,
                composite_object
            );
        }

    }