package com.xbreeze.xtest.steps.data_database_dbtable;
import com.xbreeze.xtest.modules.data.database.dbtable.DbTable_Helper;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.When;

public class InsertDataIntoTable_Steps
{

    private DbTable_Helper _DbTable_helper;
    
    public InsertDataIntoTable_Steps(DbTable_Helper DbTable_helper) {
        _DbTable_helper = DbTable_helper;
    }

    @When("^I insert the following data in ([a-zA-Z0-9_@$#-]+) table (.+):$")
    public void When_EN_InsertDataIntoTable_490666FF_ED5E_45AB_9BE1_49A0D0AD61BA(
        String database_config,
        String table_name,
        DataTable data_to_insert
    ) throws Throwable
    {
        _DbTable_helper.InsertDataIntoTable(
            database_config,
            table_name,
            data_to_insert
        );
    }


}