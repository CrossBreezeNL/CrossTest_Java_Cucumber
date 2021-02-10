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
/**
 * DataIntegrationInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xbreeze.xtest.process.informaticapowercenter.wsdl;

public interface DataIntegrationInterface extends java.rmi.Remote {
    public java.lang.String login(com.xbreeze.xtest.process.informaticapowercenter.wsdl.LoginRequest param) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse logout(com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidRequest param) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse initializeDIServerConnection(com.xbreeze.xtest.process.informaticapowercenter.wsdl.InitializeDIServerConnectionRequest param) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse deinitializeDIServerConnection(com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidRequest param) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public int startWorkflowLogFetch(com.xbreeze.xtest.process.informaticapowercenter.wsdl.StartWorkflowLogFetchRequest param) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public int startSessionLogFetch(com.xbreeze.xtest.process.informaticapowercenter.wsdl.StartSessionLogFetchRequest param) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.LogSegment getNextLogSegment(com.xbreeze.xtest.process.informaticapowercenter.wsdl.GetNextLogSegmentRequest param) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.EPingState pingDIServer(com.xbreeze.xtest.process.informaticapowercenter.wsdl.PingDIServerRequest pingDIServer) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerProperties getDIServerProperties(com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServiceInfo getDIServerProperties) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse startWorkflow(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest startWorkflow) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.TypeStartWorkflowExResponse startWorkflowEx(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TypeStartWorkflowExRequest startWorkflowEx) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse startWorkflowFromTask(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest startWorkflowFromTask) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse stopWorkflow(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest stopWorkflow) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse scheduleWorkflow(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest scheduleWorkflow) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse unscheduleWorkflow(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest unscheduleWorkflow) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse waitTillWorkflowComplete(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest waitTillWorkflowComplete) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse resumeWorkflow(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest resumeWorkflow) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse startTask(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskRequest startTask) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse stopTask(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskRequest stopTask) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse waitTillTaskComplete(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskRequest waitTillTaskComplete) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse recoverWorkflow(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest recoverWorkflow) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDetails monitorDIServer(com.xbreeze.xtest.process.informaticapowercenter.wsdl.MonitorDIServerRequest monitorDIServer) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowDetails getWorkflowDetails(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest getWorkflowDetails) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDetails getWorkflowDetailsEx(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TypeGetWorkflowDetailsExRequest getWorkflowDetailsEx) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskDetails getTaskDetails(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskRequest getTaskDetails) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDetails getTaskDetailsEx(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TypeGetTaskDetailsExRequest getTaskDetailsEx) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.SessionStatistics getSessionStatistics(com.xbreeze.xtest.process.informaticapowercenter.wsdl.GetSessionStatisticsRequest getSessionStatistics) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.SessionPerformanceData getSessionPerformanceData(com.xbreeze.xtest.process.informaticapowercenter.wsdl.GetSessionPerformanceDataRequest getSessionPerformanceData) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.Log getWorkflowLog(com.xbreeze.xtest.process.informaticapowercenter.wsdl.GetWorkflowLogRequest getWorkflowLog) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.Log getSessionLog(com.xbreeze.xtest.process.informaticapowercenter.wsdl.GetSessionLogRequest getSessionLog) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails;
}
