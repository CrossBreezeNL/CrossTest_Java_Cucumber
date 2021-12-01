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
    public void When_EN_RetrieveDataOfTemplatedTable_D8FAAFB9_9EDA_448A_9F47_9ED4F4DBAAF3(
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