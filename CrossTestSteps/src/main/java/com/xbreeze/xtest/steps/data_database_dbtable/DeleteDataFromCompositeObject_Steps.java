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
        public void Given_EN_DeleteDataFromCompositeObject_97715AEA_B8A3_46F8_8CFE_83B1B6B41FBC(
            String composite_object
        ) throws Throwable
        {
            _DbTable_helper.DeleteDataFromCompositeObject(
                composite_object
            );
        }

    }