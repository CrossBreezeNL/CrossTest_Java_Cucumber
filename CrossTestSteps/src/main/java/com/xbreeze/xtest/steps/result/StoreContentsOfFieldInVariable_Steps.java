package com.xbreeze.xtest.steps.result;
import com.xbreeze.xtest.modules.result.Result_Helper;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.Given;

    public class StoreContentsOfFieldInVariable_Steps
    {

        private Result_Helper _Result_helper;
        
        public StoreContentsOfFieldInVariable_Steps(Result_Helper Result_helper) {
            _Result_helper = Result_helper;
        }

        @Given("^I store the contents of the field (.+) into variable ([a-zA-Z0-9_@$#]+)$")
        public void Given_EN_I_store_the_contents_of_the_field__azAZ09___azAZ09_64__azAZ09_64___azAZ09_64____azAZ09_64___into_variable__azAZ09_64_(
            String field_name,
            String variable_name
        ) throws Throwable
        {
            _Result_helper.StoreContentsOfFieldInVariable(
                field_name,
                variable_name
            );
        }

    }