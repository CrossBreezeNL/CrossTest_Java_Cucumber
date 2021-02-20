package com.xbreeze.xtest.steps.config_processconfig;
import com.xbreeze.xtest.modules.config.processconfig.ProcessConfig_Helper;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.When;

    public class SetParameterValueForProcessConfig_Steps
    {

        private ProcessConfig_Helper _ProcessConfig_helper;
        
        public SetParameterValueForProcessConfig_Steps(ProcessConfig_Helper ProcessConfig_helper) {
            _ProcessConfig_helper = ProcessConfig_helper;
        }

        @When("^I set parameter {parameter name} for process config {process config name} to {parameter value}$")
        public void SetParameterForProcessConfig(
            String parameter_name,
            String process_config_name,
            String parameter_value
        ) throws Throwable
        {
            _ProcessConfig_helper.SetParameterValueForProcessConfig(
                parameter_name,
                process_config_name,
                parameter_value
            );
        }

    }