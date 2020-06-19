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
        public void Then_EN_I_expect_the_following_results(
            DataTable expected_results
        ) throws Throwable
        {
            _Result_helper.CompareExpectedAndActualResult(
                expected_results
            );
        }

        @Dan("verwacht ik het volgende resultaat:")
        public void Then_NL_verwacht_ik_het_volgende_resultaat(
            DataTable expected_results
        ) throws Throwable
        {
            _Result_helper.CompareExpectedAndActualResult(
                expected_results
            );
        }

        @Then("I expect the following result:")
        public void Then_EN_I_expect_the_following_result(
            DataTable expected_results
        ) throws Throwable
        {
            _Result_helper.CompareExpectedAndActualResult(
                expected_results
            );
        }

    }