package com.xbreeze.xtest.test;

import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

/**
 * JUnit 5 Suite class to run Cucumber tests in the features folder.
 * @author Harmen
 */
@Suite
@SelectClasspathResource("features")
public class TestCrossTest {
}
