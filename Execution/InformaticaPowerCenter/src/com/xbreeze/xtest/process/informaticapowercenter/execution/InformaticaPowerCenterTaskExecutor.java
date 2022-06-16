/*******************************************************************************
 * Copyright (c) 2021 CrossBreeze
 *
 * This file is part of CrossTest.
 *
 * CrossTest is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 * CrossTest is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with CrossTest.  If not, see <https://www.gnu.org/licenses/>.
 *      
 * Contributors:
 * Willem Otten - CrossBreeze
 * Harmen Wessels - CrossBreeze
 * Jacob Siemaszko - CrossBreeze
 *******************************************************************************/
package com.xbreeze.xtest.process.informaticapowercenter.execution;

import java.util.HashMap;

import com.xbreeze.xtest.config.ProcessConfig;
import com.xbreeze.xtest.config.ProcessServerConfig;
import com.xbreeze.xtest.exception.XTestProcessException;
import com.xbreeze.xtest.process.execution.ProcessExecutor;


/**
 * 
 * Executor for informatica powercenter processes 
 * @author Willem
 */
public class InformaticaPowerCenterTaskExecutor implements ProcessExecutor {
	
	
	private HashMap<String, InformaticaPowerCenterServerInstance> _connections;
	/**
	 * Constructor for initializing a executor
	 *
	 */
	public InformaticaPowerCenterTaskExecutor() {
		_connections = new HashMap<>();
	}

	public void runProcess(ProcessConfig config, String processName) throws XTestProcessException{
		
		InformaticaPowerCenterServerInstance ipsc = initializeConnection(config);
		//processName should be:
		// workflow.taskname or workflow.worklet.taskname
		int firstPeriod = processName.indexOf("."); 
		if (firstPeriod < 1) {
			throw new XTestProcessException(String.format("Invalid processName format: %s the processName should be in format workflowname.taskname or workflowname.workletname.taskname", processName));
		}		
		//extract workflow name
		String workflowName = processName.substring(0, firstPeriod);
		String taskPath = processName.substring(firstPeriod + 1);
		ipsc.runTaskFromProcess(config, workflowName, taskPath);		
	}
	
	/**
	 * Initialize connection and return sessionheader
	 * @return
	 */
	private InformaticaPowerCenterServerInstance initializeConnection(ProcessConfig config) throws XTestProcessException {
		ProcessServerConfig serverConfig = config.getProcessServerConfig();
		if (_connections.containsKey(serverConfig.getServerUrl())) {
			return _connections.get(serverConfig.getServerUrl());
		}
		
		//If not existing, create and return connectionheader
		 InformaticaPowerCenterServerInstance ipcs = new InformaticaPowerCenterServerInstance(config);
	     _connections.put(serverConfig.getServerUrl(), ipcs);
	     return ipcs;	     
	}

	@Override
	public void cleanUp() throws XTestProcessException {
		//Close all existing connections
		for (InformaticaPowerCenterServerInstance ipcs : _connections.values()) {
			ipcs.closeConnection();
		}
	}
	
}
