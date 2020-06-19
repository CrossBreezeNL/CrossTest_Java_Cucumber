package com.xbreeze.xtest.steps.data_database_query;
import com.xbreeze.xtest.modules.data.database.query.Query_Helper;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.When;

    public class ExecuteTheFollowingQueryOnConnection_Steps
    {

        private Query_Helper _Query_helper;
        
        public ExecuteTheFollowingQueryOnConnection_Steps(Query_Helper Query_helper) {
            _Query_helper = Query_helper;
        }

        @When("^I execute the following query on ([a-zA-Z0-9_@$#-]+):$")
        public void When_EN_I_execute_the_following_query_on__azAZ09_64_(
            String database_config,
            String query_text
        ) throws Throwable
        {
            _Query_helper.ExecuteTheFollowingQueryOnConnection(
                database_config,
                query_text
            );
        }

    }