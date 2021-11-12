package com.xbreeze.xtest.steps.data_database_query;
import com.xbreeze.xtest.modules.data.database.query.Query_Helper;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.When;

public class ExecuteTheFollowingStatementOnConnection_Steps
{

    private Query_Helper _Query_helper;
    
    public ExecuteTheFollowingStatementOnConnection_Steps(Query_Helper Query_helper) {
        _Query_helper = Query_helper;
    }

    @When("^I execute the following statement on ([a-zA-Z0-9_@$#-]+):$")
    public void When_EN_ExecuteTheFollowingStatementOnConnection_CAEB9F8D_0FA5_4E6D_B0FA_7C8E2B1D0741(
        String database_config,
        String query_text
    ) throws Throwable
    {
        _Query_helper.ExecuteTheFollowingStatementOnConnection(
            database_config,
            query_text
        );
    }


}