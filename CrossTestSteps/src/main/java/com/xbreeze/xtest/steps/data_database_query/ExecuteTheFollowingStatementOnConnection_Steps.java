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
        public void When_EN_I_execute_the_following_statement_on__azAZ09_64_(
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