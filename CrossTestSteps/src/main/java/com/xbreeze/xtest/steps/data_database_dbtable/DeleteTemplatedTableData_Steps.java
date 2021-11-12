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
    public void Given_EN_DeleteTemplatedTableData_E5D5FEE2_8DC3_49A3_9EAC_3FD646E35940(
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