package com.xbreeze.xtest.test;

import com.xbreeze.xtest.config.ProcessConfig;
import com.xbreeze.xtest.config.SecurableConfigProperty;
import com.xbreeze.xtest.exception.XTestProcessException;
import com.xbreeze.xtest.process.execution.ProcessExecutor;

public class TestProcessExecutor implements ProcessExecutor {

	@Override
	public void runProcess(ProcessConfig config, String method) throws XTestProcessException {
		System.out.println("Running process " + method);
		// TODO Auto-generated method stub
		for (SecurableConfigProperty scp:config.getProcessServerConfig().getProperties()) {
			System.out.println(String.format("config property %s with value %s found", scp.getName(), scp.getValue()));
		}
	}

}
