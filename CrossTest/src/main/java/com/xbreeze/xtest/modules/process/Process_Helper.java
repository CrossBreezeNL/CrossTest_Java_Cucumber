package com.xbreeze.xtest.modules.process;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import com.xbreeze.xtest.config.XTestConfig;
import com.xbreeze.xtest.exception.XTestException;
import com.xbreeze.xtest.exception.XTestProcessException;
import com.xbreeze.xtest.process.execution.ProcessExecutor;

public class Process_Helper {

	private XTestConfig _config;
	private HashMap<String, ProcessExecutor> _executors;
	
	public Process_Helper() throws XTestException{
		this._config = XTestConfig.getConfig();
		this._executors = new HashMap<>();
	}
	
	public void RunTemplatedProcess(String processConfig, String processName) throws Throwable{	
		getProcessExecutor(processConfig).runProcess(_config.getProcessConfig(processConfig), processName);		
	}
		
	private ProcessExecutor getProcessExecutor(String processConfig) throws XTestProcessException{
		if (!_executors.containsKey(processConfig)) {
			//Initialize executor and add to collection
			try {
				Class<?> c = this.getClass().getClassLoader().loadClass(_config.getProcessConfig(processConfig).getProcessServerConfig().getExecutionClass());
				ProcessExecutor pe = (ProcessExecutor)c.getDeclaredConstructor().newInstance();
				_executors.put(processConfig, pe);
			} catch (ClassNotFoundException e) {			
				throw new XTestProcessException(String.format("Execution class %s for process config %s was not found",_config.getProcessConfig(processConfig).getProcessServerConfig().getExecutionClass(), processConfig));
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
				throw new XTestProcessException(String.format("Could not instantiate execution class %s for process config %s: %s",_config.getProcessConfig(processConfig).getProcessServerConfig().getExecutionClass(), processConfig, e.getMessage()));
			}
			
		}
		return _executors.get(processConfig);
	}
	
}
