package com.xbreeze.xtest.steps.data_database_dbtable;
import com.xbreeze.xtest.modules.data.database.dbtable.DbTable_Helper;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.When;

    public class SetKeyFieldsForCompositeObject_Steps
    {

        private DbTable_Helper _DbTable_helper;
        
        public SetKeyFieldsForCompositeObject_Steps(DbTable_Helper DbTable_helper) {
            _DbTable_helper = DbTable_helper;
        }

        @When("^I set \\(.*\\) as key for object (.+)$")
        public void ISetKeyForCompositeObject(
            String key_fields,
            String composite_object
        ) throws Throwable
        {
            _DbTable_helper.SetKeyFieldsForCompositeObject(
                key_fields,
                composite_object
            );
        }

    }