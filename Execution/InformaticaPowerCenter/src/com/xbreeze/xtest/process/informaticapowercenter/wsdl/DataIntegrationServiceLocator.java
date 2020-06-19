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
/**
 * DataIntegrationServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xbreeze.xtest.process.informaticapowercenter.wsdl;

public class DataIntegrationServiceLocator extends org.apache.axis.client.Service implements com.xbreeze.xtest.process.informaticapowercenter.wsdl.DataIntegrationService {

    public DataIntegrationServiceLocator() {
    }


    public DataIntegrationServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DataIntegrationServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DataIntegration
    private java.lang.String DataIntegration_address = "http://localhost:7333/wsh/services/BatchServices/DataIntegration";

    public java.lang.String getDataIntegrationAddress() {
        return DataIntegration_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DataIntegrationWSDDServiceName = "DataIntegration";

    public java.lang.String getDataIntegrationWSDDServiceName() {
        return DataIntegrationWSDDServiceName;
    }

    public void setDataIntegrationWSDDServiceName(java.lang.String name) {
        DataIntegrationWSDDServiceName = name;
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DataIntegrationInterface getDataIntegration() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DataIntegration_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDataIntegration(endpoint);
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DataIntegrationInterface getDataIntegration(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xbreeze.xtest.process.informaticapowercenter.wsdl.DataIntegrationServiceSoapBindingStub _stub = new com.xbreeze.xtest.process.informaticapowercenter.wsdl.DataIntegrationServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getDataIntegrationWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDataIntegrationEndpointAddress(java.lang.String address) {
        DataIntegration_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xbreeze.xtest.process.informaticapowercenter.wsdl.DataIntegrationInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xbreeze.xtest.process.informaticapowercenter.wsdl.DataIntegrationServiceSoapBindingStub _stub = new com.xbreeze.xtest.process.informaticapowercenter.wsdl.DataIntegrationServiceSoapBindingStub(new java.net.URL(DataIntegration_address), this);
                _stub.setPortName(getDataIntegrationWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DataIntegration".equals(inputPortName)) {
            return getDataIntegration();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.informatica.com/wsh", "DataIntegrationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "DataIntegration"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DataIntegration".equals(portName)) {
            setDataIntegrationEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
