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
 * InitializeDIServerConnectionRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xbreeze.xtest.process.informaticapowercenter.wsdl;

public class InitializeDIServerConnectionRequest  implements java.io.Serializable {
    private java.lang.String loginHandle;

    private java.lang.String DIServerName;

    private java.lang.String DIServerDomain;

    public InitializeDIServerConnectionRequest() {
    }

    public InitializeDIServerConnectionRequest(
           java.lang.String loginHandle,
           java.lang.String DIServerName,
           java.lang.String DIServerDomain) {
           this.loginHandle = loginHandle;
           this.DIServerName = DIServerName;
           this.DIServerDomain = DIServerDomain;
    }


    /**
     * Gets the loginHandle value for this InitializeDIServerConnectionRequest.
     * 
     * @return loginHandle
     */
    public java.lang.String getLoginHandle() {
        return loginHandle;
    }


    /**
     * Sets the loginHandle value for this InitializeDIServerConnectionRequest.
     * 
     * @param loginHandle
     */
    public void setLoginHandle(java.lang.String loginHandle) {
        this.loginHandle = loginHandle;
    }


    /**
     * Gets the DIServerName value for this InitializeDIServerConnectionRequest.
     * 
     * @return DIServerName
     */
    public java.lang.String getDIServerName() {
        return DIServerName;
    }


    /**
     * Sets the DIServerName value for this InitializeDIServerConnectionRequest.
     * 
     * @param DIServerName
     */
    public void setDIServerName(java.lang.String DIServerName) {
        this.DIServerName = DIServerName;
    }


    /**
     * Gets the DIServerDomain value for this InitializeDIServerConnectionRequest.
     * 
     * @return DIServerDomain
     */
    public java.lang.String getDIServerDomain() {
        return DIServerDomain;
    }


    /**
     * Sets the DIServerDomain value for this InitializeDIServerConnectionRequest.
     * 
     * @param DIServerDomain
     */
    public void setDIServerDomain(java.lang.String DIServerDomain) {
        this.DIServerDomain = DIServerDomain;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InitializeDIServerConnectionRequest)) return false;
        InitializeDIServerConnectionRequest other = (InitializeDIServerConnectionRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loginHandle==null && other.getLoginHandle()==null) || 
             (this.loginHandle!=null &&
              this.loginHandle.equals(other.getLoginHandle()))) &&
            ((this.DIServerName==null && other.getDIServerName()==null) || 
             (this.DIServerName!=null &&
              this.DIServerName.equals(other.getDIServerName()))) &&
            ((this.DIServerDomain==null && other.getDIServerDomain()==null) || 
             (this.DIServerDomain!=null &&
              this.DIServerDomain.equals(other.getDIServerDomain())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getLoginHandle() != null) {
            _hashCode += getLoginHandle().hashCode();
        }
        if (getDIServerName() != null) {
            _hashCode += getDIServerName().hashCode();
        }
        if (getDIServerDomain() != null) {
            _hashCode += getDIServerDomain().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InitializeDIServerConnectionRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "InitializeDIServerConnectionRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LoginHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DIServerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DIServerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DIServerDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DIServerDomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
