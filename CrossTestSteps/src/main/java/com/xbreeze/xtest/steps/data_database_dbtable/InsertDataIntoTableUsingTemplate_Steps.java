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

    @When("^I insert the following data using template ([a-zA-Z0-9_@$#-]+) in ([a-zA-Z0-9_@$#-]+) table (.+):$")
    public void When_EN_InsertDataIntoTableUsingTemplate_93EF7C5A_6C4C_4426_BEED_61F6D417252A(
        String object_template,
        String database_config,
        String table_name,
        DataTable data_to_insert
    ) throws Throwable
    {
        _DbTable_helper.InsertDataIntoTableUsingTemplate(
            object_template,
            database_config,
            table_name,
            data_to_insert
        );
    }


}