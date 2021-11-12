package com.xbreeze.xtest.steps.data_database_context;
import com.xbreeze.xtest.modules.data.database.context.Context_Helper;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.nl.Gegeven;
import io.cucumber.java.nl.Wanneer;
import io.cucumber.java.Before;

public class SpecifyTestTransaction_Steps
{

    private Context_Helper _Context_helper;
    
    public SpecifyTestTransaction_Steps(Context_Helper Context_helper) {
        _Context_helper = Context_helper;
    }

    @Given("the test has been executed within a transaction")
    public void Given_EN_SpecifyTestTransaction_863B1416_6775_4A6C_89A1_BE06B1DEC854(
    ) throws Throwable
    {
        _Context_helper.SpecifyTestTransaction(
        );
    }

    @When("the test is being executed within a transaction")
    public void When_EN_SpecifyTestTransaction_191CAA7E_8E0B_4B7C_B70C_810F16361E3F(
    ) throws Throwable
    {
        _Context_helper.SpecifyTestTransaction(
        );
    }

    @Gegeven("de test binnen een transactie wordt uitgevoerd")
    public void Given_NL_SpecifyTestTransaction_0A2B1F29_81FE_470D_BACA_B4FB68018F5F(
    ) throws Throwable
    {
        _Context_helper.SpecifyTestTransaction(
        );
    }

    @Wanneer("de test binnen een transactie uitgevoerd wordt")
    public void When_NL_SpecifyTestTransaction_65286361_EC9A_4376_8F1D_35BC1C6B9418(
    ) throws Throwable
    {
        _Context_helper.SpecifyTestTransaction(
        );
    }

    @Before("@Transactional")
    public void Before_BeforeTransactional(
    ) throws Throwable
    {
        _Context_helper.SpecifyTestTransaction(
        );
    }

}