package com.xbreeze.xtest.modules.config.processconfig;

import com.xbreeze.xtest.config.ConfigProperty;
import com.xbreeze.xtest.config.ProcessConfig;
import com.xbreeze.xtest.config.XTestConfig;
import com.xbreeze.xtest.exception.XTestException;


public class ProcessConfig_Helper {
	private XTestConfig _config;
	
	public ProcessConfig_Helper (XTestConfig config) throws XTestException {
		this._config = config.getConfig();		
	}
	
	public void SetParameterValueForProcessConfig(String parameter_name, String process_config_name,
		String parameter_value) throws XTestException{
		//Lookup process config
		ProcessConfig pc = _config.getProcessConfig(process_config_name);
		boolean foundProp = false;
		//Get defined parameters, if found, update value, otherwise add to collection
		for (ConfigProperty cp: pc.getParameters()) {
			if (cp.getName().equals(parameter_name)) {
				foundProp = true;
				cp.setValue(parameter_value);
			}
		}
		//If parameter is not found, add it to config parameter collection
		if (!foundProp) {
			ConfigProperty cpNew = new ConfigProperty(parameter_name, parameter_value);
			pc.getParameters().add(cpNew);
		}		
	}
}
