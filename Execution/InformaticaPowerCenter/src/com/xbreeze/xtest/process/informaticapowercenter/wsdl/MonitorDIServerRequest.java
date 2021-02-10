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
 * MonitorDIServerRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xbreeze.xtest.process.informaticapowercenter.wsdl;

public class MonitorDIServerRequest  implements java.io.Serializable {
    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServiceInfo DIServiceInfo;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.EDIServerMonitorMode monitorMode;

    public MonitorDIServerRequest() {
    }

    public MonitorDIServerRequest(
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServiceInfo DIServiceInfo,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.EDIServerMonitorMode monitorMode) {
           this.DIServiceInfo = DIServiceInfo;
           this.monitorMode = monitorMode;
    }


    /**
     * Gets the DIServiceInfo value for this MonitorDIServerRequest.
     * 
     * @return DIServiceInfo
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServiceInfo getDIServiceInfo() {
        return DIServiceInfo;
    }


    /**
     * Sets the DIServiceInfo value for this MonitorDIServerRequest.
     * 
     * @param DIServiceInfo
     */
    public void setDIServiceInfo(com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServiceInfo DIServiceInfo) {
        this.DIServiceInfo = DIServiceInfo;
    }


    /**
     * Gets the monitorMode value for this MonitorDIServerRequest.
     * 
     * @return monitorMode
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.EDIServerMonitorMode getMonitorMode() {
        return monitorMode;
    }


    /**
     * Sets the monitorMode value for this MonitorDIServerRequest.
     * 
     * @param monitorMode
     */
    public void setMonitorMode(com.xbreeze.xtest.process.informaticapowercenter.wsdl.EDIServerMonitorMode monitorMode) {
        this.monitorMode = monitorMode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MonitorDIServerRequest)) return false;
        MonitorDIServerRequest other = (MonitorDIServerRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DIServiceInfo==null && other.getDIServiceInfo()==null) || 
             (this.DIServiceInfo!=null &&
              this.DIServiceInfo.equals(other.getDIServiceInfo()))) &&
            ((this.monitorMode==null && other.getMonitorMode()==null) || 
             (this.monitorMode!=null &&
              this.monitorMode.equals(other.getMonitorMode())));
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
        if (getDIServiceInfo() != null) {
            _hashCode += getDIServiceInfo().hashCode();
        }
        if (getMonitorMode() != null) {
            _hashCode += getMonitorMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MonitorDIServerRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "MonitorDIServerRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DIServiceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DIServiceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "DIServiceInfo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monitorMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MonitorMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "EDIServerMonitorMode"));
        elemField.setNillable(false);
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
