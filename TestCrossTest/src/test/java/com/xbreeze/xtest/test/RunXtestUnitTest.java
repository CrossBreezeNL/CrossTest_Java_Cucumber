package com.xbreeze.xtest.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


/**
 * Class to set the options for the Cucumber runner for unit tests.
 * @author Willem
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		// Find the feature files in the root 'features' folder.
		features = "src/test/resources/features",
		glue = "com.xbreeze.xtest",
		plugin = {"pretty", "json:target/cucumber-unit.json"},
		tags = {"@Unit"}
)

public class RunXtestUnitTest {

}


