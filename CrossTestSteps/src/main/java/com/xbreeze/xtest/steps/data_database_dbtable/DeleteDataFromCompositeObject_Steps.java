package com.xbreeze.xtest.steps.data_database_dbtable;
import com.xbreeze.xtest.modules.data.database.dbtable.DbTable_Helper;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.Given;

    public class DeleteDataFromCompositeObject_Steps
    {

        private DbTable_Helper _DbTable_helper;
        
        public DeleteDataFromCompositeObject_Steps(DbTable_Helper DbTable_helper) {
            _DbTable_helper = DbTable_helper;
        }

        @Given("^the object (.+) is empty$")
        public void Given_EN_the_object__azAZ09___azAZ09_64__azAZ09_64___azAZ09_64____azAZ09_64___is_empty(
            String composite_object
        ) throws Throwable
        {
            _DbTable_helper.DeleteDataFromCompositeObject(
                composite_object
            );
        }

    }