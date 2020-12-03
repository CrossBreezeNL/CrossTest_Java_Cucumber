package com.xbreeze.xtest.steps.result;
import com.xbreeze.xtest.modules.result.Result_Helper;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.Then;
import io.cucumber.java.nl.Dan;

    public class CompareExpectedAndActualResult_Steps
    {

        private Result_Helper _Result_helper;
        
        public CompareExpectedAndActualResult_Steps(Result_Helper Result_helper) {
            _Result_helper = Result_helper;
        }

        @Then("I expect the following results:")
        public void Then_EN_CompareExpectedAndActualResult_AA2AEE5E_7E89_4007_9AC5_7498C31C672A(
            DataTable expected_results
        ) throws Throwable
        {
            _Result_helper.CompareExpectedAndActualResult(
                expected_results
            );
        }

        @Dan("verwacht ik het volgende resultaat:")
        public void Then_NL_CompareExpectedAndActualResult_37C08280_EDCD_4BA6_B348_5504806874F1(
            DataTable expected_results
        ) throws Throwable
        {
            _Result_helper.CompareExpectedAndActualResult(
                expected_results
            );
        }

        @Then("I expect the following result:")
        public void Then_EN_CompareExpectedAndActualResult_0178899F_F9A8_413D_AF7D_8E43E215F3BE(
            DataTable expected_results
        ) throws Throwable
        {
            _Result_helper.CompareExpectedAndActualResult(
                expected_results
            );
        }

    }