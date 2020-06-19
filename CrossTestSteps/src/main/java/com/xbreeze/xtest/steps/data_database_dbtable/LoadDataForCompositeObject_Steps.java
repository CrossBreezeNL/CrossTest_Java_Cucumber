package com.xbreeze.xtest.steps.data_database_dbtable;
import com.xbreeze.xtest.modules.data.database.dbtable.DbTable_Helper;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.When;

    public class LoadDataForCompositeObject_Steps
    {

        private DbTable_Helper _DbTable_helper;
        
        public LoadDataForCompositeObject_Steps(DbTable_Helper DbTable_helper) {
            _DbTable_helper = DbTable_helper;
        }

        @When("^I insert the following data for object (.+):$")
        public void When_EN_I_insert_the_following_data_for_object__azAZ09___azAZ09_64__azAZ09_64___azAZ09_64____azAZ09_64__(
            String composite_object,
            DataTable data_to_insert
        ) throws Throwable
        {
            _DbTable_helper.LoadDataForCompositeObject(
                composite_object,
                data_to_insert
            );
        }

    }