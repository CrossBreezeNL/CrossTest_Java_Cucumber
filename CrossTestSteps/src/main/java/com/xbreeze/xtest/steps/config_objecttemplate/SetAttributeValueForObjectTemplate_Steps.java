package com.xbreeze.xtest.steps.config_objecttemplate;
import com.xbreeze.xtest.modules.config.objecttemplate.ObjectTemplate_Helper;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.When;

    public class SetAttributeValueForObjectTemplate_Steps
    {

        private ObjectTemplate_Helper _ObjectTemplate_helper;
        
        public SetAttributeValueForObjectTemplate_Steps(ObjectTemplate_Helper ObjectTemplate_helper) {
            _ObjectTemplate_helper = ObjectTemplate_helper;
        }

        @When("^I set (value|seed|increment) for attribute ([a-zA-Z0-9_@$#-]+) in template ([a-zA-Z0-9_@$#-]+) to (.*)$")
        public void When_EN_SetAttributeValueForObjectTemplate_67941746_782D_4127_97FC_06AD48168B11(
            String attribute_property,
            String attribute_name,
            String object_template,
            String property_value
        ) throws Throwable
        {
            _ObjectTemplate_helper.SetAttributeValueForObjectTemplate(object_template, attribute_name, attribute_property, property_value);
        }

    }