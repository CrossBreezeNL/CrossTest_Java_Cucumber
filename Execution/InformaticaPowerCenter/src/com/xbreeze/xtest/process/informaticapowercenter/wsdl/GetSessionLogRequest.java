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
 * GetSessionLogRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xbreeze.xtest.process.informaticapowercenter.wsdl;

public class GetSessionLogRequest  implements java.io.Serializable {
    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServiceInfo DIServiceInfo;

    private java.lang.String folderName;

    private java.lang.String workflowName;

    private java.lang.String taskInstancePath;

    private int timeout;

    public GetSessionLogRequest() {
    }

    public GetSessionLogRequest(
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServiceInfo DIServiceInfo,
           java.lang.String folderName,
           java.lang.String workflowName,
           java.lang.String taskInstancePath,
           int timeout) {
           this.DIServiceInfo = DIServiceInfo;
           this.folderName = folderName;
           this.workflowName = workflowName;
           this.taskInstancePath = taskInstancePath;
           this.timeout = timeout;
    }


    /**
     * Gets the DIServiceInfo value for this GetSessionLogRequest.
     * 
     * @return DIServiceInfo
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServiceInfo getDIServiceInfo() {
        return DIServiceInfo;
    }


    /**
     * Sets the DIServiceInfo value for this GetSessionLogRequest.
     * 
     * @param DIServiceInfo
     */
    public void setDIServiceInfo(com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServiceInfo DIServiceInfo) {
        this.DIServiceInfo = DIServiceInfo;
    }


    /**
     * Gets the folderName value for this GetSessionLogRequest.
     * 
     * @return folderName
     */
    public java.lang.String getFolderName() {
        return folderName;
    }


    /**
     * Sets the folderName value for this GetSessionLogRequest.
     * 
     * @param folderName
     */
    public void setFolderName(java.lang.String folderName) {
        this.folderName = folderName;
    }


    /**
     * Gets the workflowName value for this GetSessionLogRequest.
     * 
     * @return workflowName
     */
    public java.lang.String getWorkflowName() {
        return workflowName;
    }


    /**
     * Sets the workflowName value for this GetSessionLogRequest.
     * 
     * @param workflowName
     */
    public void setWorkflowName(java.lang.String workflowName) {
        this.workflowName = workflowName;
    }


    /**
     * Gets the taskInstancePath value for this GetSessionLogRequest.
     * 
     * @return taskInstancePath
     */
    public java.lang.String getTaskInstancePath() {
        return taskInstancePath;
    }


    /**
     * Sets the taskInstancePath value for this GetSessionLogRequest.
     * 
     * @param taskInstancePath
     */
    public void setTaskInstancePath(java.lang.String taskInstancePath) {
        this.taskInstancePath = taskInstancePath;
    }


    /**
     * Gets the timeout value for this GetSessionLogRequest.
     * 
     * @return timeout
     */
    public int getTimeout() {
        return timeout;
    }


    /**
     * Sets the timeout value for this GetSessionLogRequest.
     * 
     * @param timeout
     */
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSessionLogRequest)) return false;
        GetSessionLogRequest other = (GetSessionLogRequest) obj;
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
            ((this.folderName==null && other.getFolderName()==null) || 
             (this.folderName!=null &&
              this.folderName.equals(other.getFolderName()))) &&
            ((this.workflowName==null && other.getWorkflowName()==null) || 
             (this.workflowName!=null &&
              this.workflowName.equals(other.getWorkflowName()))) &&
            ((this.taskInstancePath==null && other.getTaskInstancePath()==null) || 
             (this.taskInstancePath!=null &&
              this.taskInstancePath.equals(other.getTaskInstancePath()))) &&
            this.timeout == other.getTimeout();
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
        if (getFolderName() != null) {
            _hashCode += getFolderName().hashCode();
        }
        if (getWorkflowName() != null) {
            _hashCode += getWorkflowName().hashCode();
        }
        if (getTaskInstancePath() != null) {
            _hashCode += getTaskInstancePath().hashCode();
        }
        _hashCode += getTimeout();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSessionLogRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "GetSessionLogRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DIServiceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DIServiceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "DIServiceInfo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folderName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FolderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorkflowName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskInstancePath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaskInstancePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Timeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
