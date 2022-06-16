package com.xbreeze.xtest.test;

import java.util.logging.Logger;

import com.xbreeze.xtest.config.ProcessConfig;
import com.xbreeze.xtest.config.SecurableConfigProperty;
import com.xbreeze.xtest.database.helpers.DataHelper;
import com.xbreeze.xtest.exception.XTestProcessException;
import com.xbreeze.xtest.process.execution.ProcessExecutor;

public class TestProcessExecutor implements ProcessExecutor {
	static final Logger logger = Logger.getLogger(DataHelper.class.getName());

	@Override
	public void runProcess(ProcessConfig config, String method) throws XTestProcessException {
		logger.info("TestProcessExecutor - Running process " + method);
		for (SecurableConfigProperty scp:config.getProcessServerConfig().getProperties()) {
			logger.info(String.format("TestProcessExecutor - config property %s with value %s found", scp.getName(), scp.getValue()));
		}
	}

	@Override
	public void cleanUp() throws XTestProcessException {
		logger.info("Cleanup invoked");
		
	}

}
