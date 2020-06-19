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
 * LinkDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xbreeze.xtest.process.informaticapowercenter.wsdl;

public class LinkDetails  implements java.io.Serializable {
    private java.lang.String folderName;

    private java.lang.String workflowName;

    private java.lang.String workletInstanceName;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskDetails fromTaskInstanceDetails;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskDetails toTaskInstanceDetails;

    private int workflowRunId;

    private int workletRunId;

    public LinkDetails() {
    }

    public LinkDetails(
           java.lang.String folderName,
           java.lang.String workflowName,
           java.lang.String workletInstanceName,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskDetails fromTaskInstanceDetails,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskDetails toTaskInstanceDetails,
           int workflowRunId,
           int workletRunId) {
           this.folderName = folderName;
           this.workflowName = workflowName;
           this.workletInstanceName = workletInstanceName;
           this.fromTaskInstanceDetails = fromTaskInstanceDetails;
           this.toTaskInstanceDetails = toTaskInstanceDetails;
           this.workflowRunId = workflowRunId;
           this.workletRunId = workletRunId;
    }


    /**
     * Gets the folderName value for this LinkDetails.
     * 
     * @return folderName
     */
    public java.lang.String getFolderName() {
        return folderName;
    }


    /**
     * Sets the folderName value for this LinkDetails.
     * 
     * @param folderName
     */
    public void setFolderName(java.lang.String folderName) {
        this.folderName = folderName;
    }


    /**
     * Gets the workflowName value for this LinkDetails.
     * 
     * @return workflowName
     */
    public java.lang.String getWorkflowName() {
        return workflowName;
    }


    /**
     * Sets the workflowName value for this LinkDetails.
     * 
     * @param workflowName
     */
    public void setWorkflowName(java.lang.String workflowName) {
        this.workflowName = workflowName;
    }


    /**
     * Gets the workletInstanceName value for this LinkDetails.
     * 
     * @return workletInstanceName
     */
    public java.lang.String getWorkletInstanceName() {
        return workletInstanceName;
    }


    /**
     * Sets the workletInstanceName value for this LinkDetails.
     * 
     * @param workletInstanceName
     */
    public void setWorkletInstanceName(java.lang.String workletInstanceName) {
        this.workletInstanceName = workletInstanceName;
    }


    /**
     * Gets the fromTaskInstanceDetails value for this LinkDetails.
     * 
     * @return fromTaskInstanceDetails
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskDetails getFromTaskInstanceDetails() {
        return fromTaskInstanceDetails;
    }


    /**
     * Sets the fromTaskInstanceDetails value for this LinkDetails.
     * 
     * @param fromTaskInstanceDetails
     */
    public void setFromTaskInstanceDetails(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskDetails fromTaskInstanceDetails) {
        this.fromTaskInstanceDetails = fromTaskInstanceDetails;
    }


    /**
     * Gets the toTaskInstanceDetails value for this LinkDetails.
     * 
     * @return toTaskInstanceDetails
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskDetails getToTaskInstanceDetails() {
        return toTaskInstanceDetails;
    }


    /**
     * Sets the toTaskInstanceDetails value for this LinkDetails.
     * 
     * @param toTaskInstanceDetails
     */
    public void setToTaskInstanceDetails(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskDetails toTaskInstanceDetails) {
        this.toTaskInstanceDetails = toTaskInstanceDetails;
    }


    /**
     * Gets the workflowRunId value for this LinkDetails.
     * 
     * @return workflowRunId
     */
    public int getWorkflowRunId() {
        return workflowRunId;
    }


    /**
     * Sets the workflowRunId value for this LinkDetails.
     * 
     * @param workflowRunId
     */
    public void setWorkflowRunId(int workflowRunId) {
        this.workflowRunId = workflowRunId;
    }


    /**
     * Gets the workletRunId value for this LinkDetails.
     * 
     * @return workletRunId
     */
    public int getWorkletRunId() {
        return workletRunId;
    }


    /**
     * Sets the workletRunId value for this LinkDetails.
     * 
     * @param workletRunId
     */
    public void setWorkletRunId(int workletRunId) {
        this.workletRunId = workletRunId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LinkDetails)) return false;
        LinkDetails other = (LinkDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.folderName==null && other.getFolderName()==null) || 
             (this.folderName!=null &&
              this.folderName.equals(other.getFolderName()))) &&
            ((this.workflowName==null && other.getWorkflowName()==null) || 
             (this.workflowName!=null &&
              this.workflowName.equals(other.getWorkflowName()))) &&
            ((this.workletInstanceName==null && other.getWorkletInstanceName()==null) || 
             (this.workletInstanceName!=null &&
              this.workletInstanceName.equals(other.getWorkletInstanceName()))) &&
            ((this.fromTaskInstanceDetails==null && other.getFromTaskInstanceDetails()==null) || 
             (this.fromTaskInstanceDetails!=null &&
              this.fromTaskInstanceDetails.equals(other.getFromTaskInstanceDetails()))) &&
            ((this.toTaskInstanceDetails==null && other.getToTaskInstanceDetails()==null) || 
             (this.toTaskInstanceDetails!=null &&
              this.toTaskInstanceDetails.equals(other.getToTaskInstanceDetails()))) &&
            this.workflowRunId == other.getWorkflowRunId() &&
            this.workletRunId == other.getWorkletRunId();
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
        if (getFolderName() != null) {
            _hashCode += getFolderName().hashCode();
        }
        if (getWorkflowName() != null) {
            _hashCode += getWorkflowName().hashCode();
        }
        if (getWorkletInstanceName() != null) {
            _hashCode += getWorkletInstanceName().hashCode();
        }
        if (getFromTaskInstanceDetails() != null) {
            _hashCode += getFromTaskInstanceDetails().hashCode();
        }
        if (getToTaskInstanceDetails() != null) {
            _hashCode += getToTaskInstanceDetails().hashCode();
        }
        _hashCode += getWorkflowRunId();
        _hashCode += getWorkletRunId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LinkDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "LinkDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("workletInstanceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorkletInstanceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromTaskInstanceDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FromTaskInstanceDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "TaskDetails"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toTaskInstanceDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ToTaskInstanceDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "TaskDetails"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowRunId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorkflowRunId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workletRunId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorkletRunId"));
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
