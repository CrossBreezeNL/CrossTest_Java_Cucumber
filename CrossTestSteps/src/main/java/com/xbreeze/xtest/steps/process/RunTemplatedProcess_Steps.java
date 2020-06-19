package com.xbreeze.xtest.steps.process;
import com.xbreeze.xtest.modules.process.Process_Helper;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.When;

    public class RunTemplatedProcess_Steps
    {

        private Process_Helper _Process_helper;
        
        public RunTemplatedProcess_Steps(Process_Helper Process_helper) {
            _Process_helper = Process_helper;
        }

        @When("^I run the ([a-zA-Z0-9_@$#]+) process ([a-zA-Z0-9_@$#]+)$")
        public void When_EN_I_run_the__azAZ09_64__process__azAZ09_64_(
            String process_config,
            String process_name
        ) throws Throwable
        {
            _Process_helper.RunTemplatedProcess(
                process_config,
                process_name
            );
        }

    }