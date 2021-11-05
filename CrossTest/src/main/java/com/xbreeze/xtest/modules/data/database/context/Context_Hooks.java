package com.xbreeze.xtest.modules.data.database.context;

import java.util.logging.Logger;

import com.xbreeze.xtest.database.helpers.DataHelper;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;

public class Context_Hooks {
	static final Logger logger = Logger.getLogger(DataHelper.class.getName());

	@Before("@Transactional")
	public void beforeTransactionalScenario(Scenario scenario) throws Throwable {
		logger.info("Scenario is Transactional, so setting transactional on context helper.");
		//context_helper.SpecifyTestTransaction();
	}
}
