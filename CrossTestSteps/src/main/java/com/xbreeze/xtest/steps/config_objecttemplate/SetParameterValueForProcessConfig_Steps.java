package com.xbreeze.xtest.steps.config_objecttemplate;
import com.xbreeze.xtest.modules.config.objecttemplate.ObjectTemplate_Helper;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.When;

    public class SetParameterValueForProcessConfig_Steps
    {

        private ObjectTemplate_Helper _ObjectTemplate_helper;
        
        public SetParameterValueForProcessConfig_Steps(ObjectTemplate_Helper ObjectTemplate_helper) {
            _ObjectTemplate_helper = ObjectTemplate_helper;
        }

        @When("^I set parameter {parameter name} for process config {process config name} to {parameter value}$")
        public void Step_Expression_1(
            String parameter_name,
            String process_config_name,
            String parameter_value
        ) throws Throwable
        {
            _ObjectTemplate_helper.SetParameterValueForProcessConfig(
                parameter_name,
                process_config_name,
                parameter_value
            );
        }

    }