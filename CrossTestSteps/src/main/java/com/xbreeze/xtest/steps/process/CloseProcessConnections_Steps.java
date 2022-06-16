package com.xbreeze.xtest.steps.process;
import com.xbreeze.xtest.modules.process.Process_Helper;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.After;

public class CloseProcessConnections_Steps
{

    private Process_Helper _Process_helper;
    
    public CloseProcessConnections_Steps(Process_Helper Process_helper) {
        _Process_helper = Process_helper;
    }

    @After("")
    public void After_Close_process_connections(
    ) throws Throwable
    {
        _Process_helper.CloseProcessConnections(
        );
    }

}