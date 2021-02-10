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
 * DataIntegrationServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xbreeze.xtest.process.informaticapowercenter.wsdl;

public class DataIntegrationServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.xbreeze.xtest.process.informaticapowercenter.wsdl.DataIntegrationInterface {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[30];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "Login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "LoginRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.LoginRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "LoginReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "Logout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "VoidRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "VoidResponse"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "LogoutReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("initializeDIServerConnection");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "InitializeDIServerConnection"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "InitializeDIServerConnectionRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.InitializeDIServerConnectionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "VoidResponse"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "InitializeDIServerConnectionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deinitializeDIServerConnection");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "DeinitializeDIServerConnection"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "VoidRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "VoidResponse"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "DeinitializeDIServerConnectionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startWorkflowLogFetch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "StartWorkflowLogFetch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "StartWorkflowLogFetchRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.StartWorkflowLogFetchRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "StartWorkflowLogFetchReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startSessionLogFetch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "StartSessionLogFetch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "StartSessionLogFetchRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.StartSessionLogFetchRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "StartSessionLogFetchReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNextLogSegment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetNextLogSegment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetNextLogSegmentRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.GetNextLogSegmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "LogSegment"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.LogSegment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetNextLogSegmentReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pingDIServer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "PingDIServer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "PingDIServerRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.PingDIServerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "EPingState"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.EPingState.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "PingDIServerReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDIServerProperties");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetDIServerProperties"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "DIServiceInfo"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServiceInfo.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "DIServerProperties"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerProperties.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetDIServerPropertiesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startWorkflow");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "StartWorkflow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WorkflowRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "VoidResponse"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "StartWorkflowReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startWorkflowEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "StartWorkflowEx"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "TypeStartWorkflowExRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.TypeStartWorkflowExRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "TypeStartWorkflowExResponse"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TypeStartWorkflowExResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "StartWorkflowExReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startWorkflowFromTask");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "StartWorkflowFromTask"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WorkflowRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "VoidResponse"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "StartWorkflowFromTaskReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("stopWorkflow");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "StopWorkflow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WorkflowRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "VoidResponse"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "StopWorkflowReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("scheduleWorkflow");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "ScheduleWorkflow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WorkflowRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "VoidResponse"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "ScheduleWorkflowReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("unscheduleWorkflow");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "UnscheduleWorkflow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WorkflowRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "VoidResponse"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "UnscheduleWorkflowReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("waitTillWorkflowComplete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WaitTillWorkflowComplete"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WorkflowRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "VoidResponse"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WaitTillWorkflowCompleteReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resumeWorkflow");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "ResumeWorkflow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WorkflowRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "VoidResponse"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "ResumeWorkflowReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startTask");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "StartTask"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "TaskRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "VoidResponse"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "StartTaskReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("stopTask");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "StopTask"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "TaskRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "VoidResponse"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "StopTaskReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("waitTillTaskComplete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WaitTillTaskComplete"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "TaskRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "VoidResponse"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WaitTillTaskCompleteReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recoverWorkflow");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "RecoverWorkflow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WorkflowRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "VoidResponse"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "RecoverWorkflowReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("monitorDIServer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "MonitorDIServer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "MonitorDIServerRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.MonitorDIServerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "DIServerDetails"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "MonitorDIServerReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWorkflowDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetWorkflowDetails"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WorkflowRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WorkflowDetails"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetWorkflowDetailsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWorkflowDetailsEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetWorkflowDetailsEx"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "TypeGetWorkflowDetailsExRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.TypeGetWorkflowDetailsExRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "DIServerDetails"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetWorkflowDetailsExReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTaskDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetTaskDetails"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "TaskRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "TaskDetails"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetTaskDetailsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTaskDetailsEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetTaskDetailsEx"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "TypeGetTaskDetailsExRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.TypeGetTaskDetailsExRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "DIServerDetails"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDetails.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetTaskDetailsExReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSessionStatistics");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetSessionStatistics"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetSessionStatisticsRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.GetSessionStatisticsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "SessionStatistics"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.SessionStatistics.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetSessionStatisticsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSessionPerformanceData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetSessionPerformanceData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetSessionPerformanceDataRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.GetSessionPerformanceDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "SessionPerformanceData"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.SessionPerformanceData.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetSessionPerformanceDataReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWorkflowLog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetWorkflowLog"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetWorkflowLogRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.GetWorkflowLogRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "Log"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.Log.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetWorkflowLogReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSessionLog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetSessionLog"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetSessionLogRequest"), com.xbreeze.xtest.process.informaticapowercenter.wsdl.GetSessionLogRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "Log"));
        oper.setReturnClass(com.xbreeze.xtest.process.informaticapowercenter.wsdl.Log.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetSessionLogReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WSHFaultDetails"),
                      "com.informatica.www.wsh.FaultDetails",
                      new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails"), 
                      true
                     ));
        _operations[29] = oper;

    }

    public DataIntegrationServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public DataIntegrationServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public DataIntegrationServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "Attribute");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.Attribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "DIServerDate");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "DIServerDetails");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "DIServerProperties");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerProperties.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "DIServiceInfo");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServiceInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "EDIServerMode");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.EDIServerMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "EDIServerMonitorMode");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.EDIServerMonitorMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "EDIServerRunStatus");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.EDIServerRunStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "EPerformanceCounterType");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.EPerformanceCounterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "EPingState");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.EPingState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "ETaskRunMode");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.ETaskRunMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "ETaskRunStatus");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.ETaskRunStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "ETaskType");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.ETaskType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "EWorkflowRunStatus");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.EWorkflowRunStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "EWorkflowRunType");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.EWorkflowRunType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "FaultDetails");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetNextLogSegmentRequest");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.GetNextLogSegmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetSessionLogRequest");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.GetSessionLogRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetSessionPerformanceDataRequest");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.GetSessionPerformanceDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetSessionStatisticsRequest");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.GetSessionStatisticsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetWorkflowLogRequest");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.GetWorkflowLogRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "InitializeDIServerConnectionRequest");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.InitializeDIServerConnectionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "Key");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.Key.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "LinkDetails");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.LinkDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "Log");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.Log.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "LoginRequest");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.LoginRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "LogSegment");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.LogSegment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "MonitorDIServerRequest");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.MonitorDIServerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "Parameter");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.Parameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "ParameterArray");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.Parameter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "Parameter");
            qName2 = new javax.xml.namespace.QName("", "Parameters");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "PerformanceCounter");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.PerformanceCounter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "PingDIServerRequest");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.PingDIServerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "SessionPerformanceData");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.SessionPerformanceData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "SessionStatistics");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.SessionStatistics.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "StartSessionLogFetchRequest");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.StartSessionLogFetchRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "StartWorkflowLogFetchRequest");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.StartWorkflowLogFetchRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "TableStatistics");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.TableStatistics.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "TaskDetails");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "TaskRequest");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "TypeGetTaskDetailsExRequest");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.TypeGetTaskDetailsExRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "TypeGetWorkflowDetailsExRequest");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.TypeGetWorkflowDetailsExRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "TypeStartWorkflowExRequest");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.TypeStartWorkflowExRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "TypeStartWorkflowExResponse");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.TypeStartWorkflowExResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "VoidRequest");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "VoidResponse");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WorkflowDetails");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WorkflowRequest");
            cachedSerQNames.add(qName);
            cls = com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public java.lang.String login(com.xbreeze.xtest.process.informaticapowercenter.wsdl.LoginRequest param) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse logout(com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidRequest param) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "logout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse initializeDIServerConnection(com.xbreeze.xtest.process.informaticapowercenter.wsdl.InitializeDIServerConnectionRequest param) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "initializeDIServerConnection"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse deinitializeDIServerConnection(com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidRequest param) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deinitializeDIServerConnection"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int startWorkflowLogFetch(com.xbreeze.xtest.process.informaticapowercenter.wsdl.StartWorkflowLogFetchRequest param) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "startWorkflowLogFetch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int startSessionLogFetch(com.xbreeze.xtest.process.informaticapowercenter.wsdl.StartSessionLogFetchRequest param) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "startSessionLogFetch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.LogSegment getNextLogSegment(com.xbreeze.xtest.process.informaticapowercenter.wsdl.GetNextLogSegmentRequest param) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getNextLogSegment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.LogSegment) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.LogSegment) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.LogSegment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.EPingState pingDIServer(com.xbreeze.xtest.process.informaticapowercenter.wsdl.PingDIServerRequest pingDIServer) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pingDIServer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pingDIServer});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.EPingState) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.EPingState) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.EPingState.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerProperties getDIServerProperties(com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServiceInfo getDIServerProperties) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDIServerProperties"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getDIServerProperties});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerProperties) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerProperties) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerProperties.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse startWorkflow(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest startWorkflow) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "startWorkflow"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {startWorkflow});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.TypeStartWorkflowExResponse startWorkflowEx(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TypeStartWorkflowExRequest startWorkflowEx) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "startWorkflowEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {startWorkflowEx});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.TypeStartWorkflowExResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.TypeStartWorkflowExResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.TypeStartWorkflowExResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse startWorkflowFromTask(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest startWorkflowFromTask) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "startWorkflowFromTask"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {startWorkflowFromTask});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse stopWorkflow(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest stopWorkflow) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "stopWorkflow"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {stopWorkflow});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse scheduleWorkflow(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest scheduleWorkflow) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "scheduleWorkflow"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {scheduleWorkflow});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse unscheduleWorkflow(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest unscheduleWorkflow) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "unscheduleWorkflow"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {unscheduleWorkflow});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse waitTillWorkflowComplete(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest waitTillWorkflowComplete) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "waitTillWorkflowComplete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {waitTillWorkflowComplete});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse resumeWorkflow(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest resumeWorkflow) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "resumeWorkflow"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {resumeWorkflow});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse startTask(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskRequest startTask) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "startTask"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {startTask});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse stopTask(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskRequest stopTask) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "stopTask"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {stopTask});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse waitTillTaskComplete(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskRequest waitTillTaskComplete) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "waitTillTaskComplete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {waitTillTaskComplete});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse recoverWorkflow(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest recoverWorkflow) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "recoverWorkflow"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {recoverWorkflow});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.VoidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDetails monitorDIServer(com.xbreeze.xtest.process.informaticapowercenter.wsdl.MonitorDIServerRequest monitorDIServer) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "monitorDIServer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {monitorDIServer});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowDetails getWorkflowDetails(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowRequest getWorkflowDetails) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getWorkflowDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getWorkflowDetails});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDetails getWorkflowDetailsEx(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TypeGetWorkflowDetailsExRequest getWorkflowDetailsEx) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getWorkflowDetailsEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getWorkflowDetailsEx});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskDetails getTaskDetails(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskRequest getTaskDetails) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTaskDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getTaskDetails});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDetails getTaskDetailsEx(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TypeGetTaskDetailsExRequest getTaskDetailsEx) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTaskDetailsEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getTaskDetailsEx});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDetails) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDetails) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDetails.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.SessionStatistics getSessionStatistics(com.xbreeze.xtest.process.informaticapowercenter.wsdl.GetSessionStatisticsRequest getSessionStatistics) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSessionStatistics"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getSessionStatistics});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.SessionStatistics) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.SessionStatistics) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.SessionStatistics.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.SessionPerformanceData getSessionPerformanceData(com.xbreeze.xtest.process.informaticapowercenter.wsdl.GetSessionPerformanceDataRequest getSessionPerformanceData) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSessionPerformanceData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getSessionPerformanceData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.SessionPerformanceData) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.SessionPerformanceData) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.SessionPerformanceData.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.Log getWorkflowLog(com.xbreeze.xtest.process.informaticapowercenter.wsdl.GetWorkflowLogRequest getWorkflowLog) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getWorkflowLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getWorkflowLog});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.Log) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.Log) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.Log.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.Log getSessionLog(com.xbreeze.xtest.process.informaticapowercenter.wsdl.GetSessionLogRequest getSessionLog) throws java.rmi.RemoteException, com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSessionLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getSessionLog});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.Log) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.xbreeze.xtest.process.informaticapowercenter.wsdl.Log) org.apache.axis.utils.JavaUtils.convert(_resp, com.xbreeze.xtest.process.informaticapowercenter.wsdl.Log.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) {
              throw (com.xbreeze.xtest.process.informaticapowercenter.wsdl.FaultDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
