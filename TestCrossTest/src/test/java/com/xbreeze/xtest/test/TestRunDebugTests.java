package com.xbreeze.xtest.test;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

/**
 * JUnit 5 Suite class to run Cucumber tests in the features folder.
 * @author Harmen
 */
@Suite
@SelectClasspathResource("features")
@IncludeTags("Debug")
public class TestRunDebugTests {
}