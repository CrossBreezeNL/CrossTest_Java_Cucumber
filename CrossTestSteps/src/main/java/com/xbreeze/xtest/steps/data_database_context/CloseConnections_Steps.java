package com.xbreeze.xtest.steps.data_database_context;
import com.xbreeze.xtest.modules.data.database.context.Context_Helper;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.After;

public class CloseConnections_Steps
{

    private Context_Helper _Context_helper;
    
    public CloseConnections_Steps(Context_Helper Context_helper) {
        _Context_helper = Context_helper;
    }

    @After("")
    public void After_CloseConnections(
    ) throws Throwable
    {
        _Context_helper.CloseConnections(
        );
    }

}