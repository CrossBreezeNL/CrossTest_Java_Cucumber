/*******************************************************************************
 * Copyright (c) 2019 CrossBreeze
 *
 *  This file is part of CrossTest.
 *
 *     CrossTest is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     CrossTest is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with CrossTest.  If not, see <https://www.gnu.org/licenses/>.
 *     
 * Contributors:
 *     Willem Otten - CrossBreeze
 *     Harmen Wessels - CrossBreeze
 *******************************************************************************/
package com.xbreeze.xtest.process.informaticapowercenter.wsdl;

public class DataIntegrationInterfaceProxy implements com.xbreeze.xtest.process.informaticapowercenter.wsdl.DataIntegrationInterface {
  private String _endpoint = null;
  private com.xbreeze.xtest.process.informaticapowercenter.wsdl.DataIntegrationInterface dataIntegrationInterface = null;
  
  public DataIntegrationInterfaceProxy() {
    _initDataIntegrationInterfaceProxy();
  }
  
  public DataIntegrationInterfaceProxy(String endpoint) {
    _endpoint = endpoint;
    _initDataIntegrationInterfaceProxy();
  }
  
  private void _initDataIntegrationInterfaceProxy() {
    try {
      dataIntegrationInterface = (new com.xbreeze.xtest.process.informaticapowercenter.wsdl.DataIntegrationServiceLocator()).getDataIntegration();
      if (dataIntegrationInterface != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)dataIntegrationInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)dataIntegrationInterface)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (dataIntegrationInterface != null)
      ((javax.xml.rpc.Stub)dataIntegrationInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DataIntegrationInterface getDataIntegrationInterface() {
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface;
  }
  
  public java.lang.String login(com.xbreeze.xtest.process.informaticapowercenter.wsdl.LoginRequest param) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.login(param);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse logout(com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidRequest param) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.logout(param);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse initializeDIServerConnection(com.xbreeze.xtest.process.informaticapowercenter.wsdl.InitializeDIServerConnectionRequest param) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.initializeDIServerConnection(param);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse deinitializeDIServerConnection(com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidRequest param) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.deinitializeDIServerConnection(param);
  }
  
  public int startWorkflowLogFetch(com.xbreeze.xtest.process.informaticapowercenter.wsdl.StartWorkflowLogFetchRequest param) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.startWorkflowLogFetch(param);
  }
  
  public int startSessionLogFetch(com.xbreeze.xtest.process.informaticapowercenter.wsdl.StartSessionLogFetchRequest param) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.startSessionLogFetch(param);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.LogSegment getNextLogSegment(com.xbreeze.xtest.process.informaticapowercenter.wsdl.GetNextLogSegmentRequest param) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.getNextLogSegment(param);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.EPingState pingDIServer(com.xbreeze.xtest.process.informaticapowercenter.wsdl.PingDIServerRequest pingDIServer) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.pingDIServer(pingDIServer);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerProperties getDIServerProperties(com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServiceInfo getDIServerProperties) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.getDIServerProperties(getDIServerProperties);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse startWorkflow(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest startWorkflow) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.startWorkflow(startWorkflow);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.TypeStartWorkflowExResponse startWorkflowEx(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TypeStartWorkflowExRequest startWorkflowEx) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.startWorkflowEx(startWorkflowEx);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse startWorkflowFromTask(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest startWorkflowFromTask) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.startWorkflowFromTask(startWorkflowFromTask);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse stopWorkflow(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest stopWorkflow) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.stopWorkflow(stopWorkflow);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse scheduleWorkflow(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest scheduleWorkflow) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.scheduleWorkflow(scheduleWorkflow);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse unscheduleWorkflow(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest unscheduleWorkflow) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.unscheduleWorkflow(unscheduleWorkflow);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse waitTillWorkflowComplete(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest waitTillWorkflowComplete) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.waitTillWorkflowComplete(waitTillWorkflowComplete);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse resumeWorkflow(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest resumeWorkflow) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.resumeWorkflow(resumeWorkflow);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse startTask(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskRequest startTask) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.startTask(startTask);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse stopTask(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskRequest stopTask) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.stopTask(stopTask);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse waitTillTaskComplete(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskRequest waitTillTaskComplete) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.waitTillTaskComplete(waitTillTaskComplete);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse recoverWorkflow(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest recoverWorkflow) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.recoverWorkflow(recoverWorkflow);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDetails monitorDIServer(com.xbreeze.xtest.process.informaticapowercenter.wsdl.MonitorDIServerRequest monitorDIServer) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.monitorDIServer(monitorDIServer);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowDetails getWorkflowDetails(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest getWorkflowDetails) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.getWorkflowDetails(getWorkflowDetails);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDetails getWorkflowDetailsEx(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TypeGetWorkflowDetailsExRequest getWorkflowDetailsEx) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.getWorkflowDetailsEx(getWorkflowDetailsEx);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskDetails getTaskDetails(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskRequest getTaskDetails) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.getTaskDetails(getTaskDetails);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDetails getTaskDetailsEx(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TypeGetTaskDetailsExRequest getTaskDetailsEx) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.getTaskDetailsEx(getTaskDetailsEx);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.SessionStatistics getSessionStatistics(com.xbreeze.xtest.process.informaticapowercenter.wsdl.GetSessionStatisticsRequest getSessionStatistics) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.getSessionStatistics(getSessionStatistics);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.SessionPerformanceData getSessionPerformanceData(com.xbreeze.xtest.process.informaticapowercenter.wsdl.GetSessionPerformanceDataRequest getSessionPerformanceData) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.getSessionPerformanceData(getSessionPerformanceData);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.Log getWorkflowLog(com.xbreeze.xtest.process.informaticapowercenter.wsdl.GetWorkflowLogRequest getWorkflowLog) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.getWorkflowLog(getWorkflowLog);
  }
  
  public com.xbreeze.xtest.process.informaticapowercenter.wsdl.Log getSessionLog(com.xbreeze.xtest.process.informaticapowercenter.wsdl.GetSessionLogRequest getSessionLog) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails{
    if (dataIntegrationInterface == null)
      _initDataIntegrationInterfaceProxy();
    return dataIntegrationInterface.getSessionLog(getSessionLog);
  }
  
  
}