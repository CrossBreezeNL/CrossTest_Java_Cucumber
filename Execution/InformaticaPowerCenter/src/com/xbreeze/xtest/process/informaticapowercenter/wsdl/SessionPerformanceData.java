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
 * SessionPerformanceData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xbreeze.xtest.process.informaticapowercenter.wsdl;

public class SessionPerformanceData  implements java.io.Serializable {
    private java.lang.String folderName;

    private java.lang.String workflowName;

    private java.lang.String instanceName;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.ETaskRunStatus taskRunStatus;

    private int workflowRunId;

    private int workletRunId;

    private java.lang.String workflowRunInstanceName;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.PerformanceCounter[] performanceCounter;

    public SessionPerformanceData() {
    }

    public SessionPerformanceData(
           java.lang.String folderName,
           java.lang.String workflowName,
           java.lang.String instanceName,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.ETaskRunStatus taskRunStatus,
           int workflowRunId,
           int workletRunId,
           java.lang.String workflowRunInstanceName,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.PerformanceCounter[] performanceCounter) {
           this.folderName = folderName;
           this.workflowName = workflowName;
           this.instanceName = instanceName;
           this.taskRunStatus = taskRunStatus;
           this.workflowRunId = workflowRunId;
           this.workletRunId = workletRunId;
           this.workflowRunInstanceName = workflowRunInstanceName;
           this.performanceCounter = performanceCounter;
    }


    /**
     * Gets the folderName value for this SessionPerformanceData.
     * 
     * @return folderName
     */
    public java.lang.String getFolderName() {
        return folderName;
    }


    /**
     * Sets the folderName value for this SessionPerformanceData.
     * 
     * @param folderName
     */
    public void setFolderName(java.lang.String folderName) {
        this.folderName = folderName;
    }


    /**
     * Gets the workflowName value for this SessionPerformanceData.
     * 
     * @return workflowName
     */
    public java.lang.String getWorkflowName() {
        return workflowName;
    }


    /**
     * Sets the workflowName value for this SessionPerformanceData.
     * 
     * @param workflowName
     */
    public void setWorkflowName(java.lang.String workflowName) {
        this.workflowName = workflowName;
    }


    /**
     * Gets the instanceName value for this SessionPerformanceData.
     * 
     * @return instanceName
     */
    public java.lang.String getInstanceName() {
        return instanceName;
    }


    /**
     * Sets the instanceName value for this SessionPerformanceData.
     * 
     * @param instanceName
     */
    public void setInstanceName(java.lang.String instanceName) {
        this.instanceName = instanceName;
    }


    /**
     * Gets the taskRunStatus value for this SessionPerformanceData.
     * 
     * @return taskRunStatus
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.ETaskRunStatus getTaskRunStatus() {
        return taskRunStatus;
    }


    /**
     * Sets the taskRunStatus value for this SessionPerformanceData.
     * 
     * @param taskRunStatus
     */
    public void setTaskRunStatus(com.xbreeze.xtest.process.informaticapowercenter.wsdl.ETaskRunStatus taskRunStatus) {
        this.taskRunStatus = taskRunStatus;
    }


    /**
     * Gets the workflowRunId value for this SessionPerformanceData.
     * 
     * @return workflowRunId
     */
    public int getWorkflowRunId() {
        return workflowRunId;
    }


    /**
     * Sets the workflowRunId value for this SessionPerformanceData.
     * 
     * @param workflowRunId
     */
    public void setWorkflowRunId(int workflowRunId) {
        this.workflowRunId = workflowRunId;
    }


    /**
     * Gets the workletRunId value for this SessionPerformanceData.
     * 
     * @return workletRunId
     */
    public int getWorkletRunId() {
        return workletRunId;
    }


    /**
     * Sets the workletRunId value for this SessionPerformanceData.
     * 
     * @param workletRunId
     */
    public void setWorkletRunId(int workletRunId) {
        this.workletRunId = workletRunId;
    }


    /**
     * Gets the workflowRunInstanceName value for this SessionPerformanceData.
     * 
     * @return workflowRunInstanceName
     */
    public java.lang.String getWorkflowRunInstanceName() {
        return workflowRunInstanceName;
    }


    /**
     * Sets the workflowRunInstanceName value for this SessionPerformanceData.
     * 
     * @param workflowRunInstanceName
     */
    public void setWorkflowRunInstanceName(java.lang.String workflowRunInstanceName) {
        this.workflowRunInstanceName = workflowRunInstanceName;
    }


    /**
     * Gets the performanceCounter value for this SessionPerformanceData.
     * 
     * @return performanceCounter
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.PerformanceCounter[] getPerformanceCounter() {
        return performanceCounter;
    }


    /**
     * Sets the performanceCounter value for this SessionPerformanceData.
     * 
     * @param performanceCounter
     */
    public void setPerformanceCounter(com.xbreeze.xtest.process.informaticapowercenter.wsdl.PerformanceCounter[] performanceCounter) {
        this.performanceCounter = performanceCounter;
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.PerformanceCounter getPerformanceCounter(int i) {
        return this.performanceCounter[i];
    }

    public void setPerformanceCounter(int i, com.xbreeze.xtest.process.informaticapowercenter.wsdl.PerformanceCounter _value) {
        this.performanceCounter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SessionPerformanceData)) return false;
        SessionPerformanceData other = (SessionPerformanceData) obj;
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
            ((this.instanceName==null && other.getInstanceName()==null) || 
             (this.instanceName!=null &&
              this.instanceName.equals(other.getInstanceName()))) &&
            ((this.taskRunStatus==null && other.getTaskRunStatus()==null) || 
             (this.taskRunStatus!=null &&
              this.taskRunStatus.equals(other.getTaskRunStatus()))) &&
            this.workflowRunId == other.getWorkflowRunId() &&
            this.workletRunId == other.getWorkletRunId() &&
            ((this.workflowRunInstanceName==null && other.getWorkflowRunInstanceName()==null) || 
             (this.workflowRunInstanceName!=null &&
              this.workflowRunInstanceName.equals(other.getWorkflowRunInstanceName()))) &&
            ((this.performanceCounter==null && other.getPerformanceCounter()==null) || 
             (this.performanceCounter!=null &&
              java.util.Arrays.equals(this.performanceCounter, other.getPerformanceCounter())));
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
        if (getInstanceName() != null) {
            _hashCode += getInstanceName().hashCode();
        }
        if (getTaskRunStatus() != null) {
            _hashCode += getTaskRunStatus().hashCode();
        }
        _hashCode += getWorkflowRunId();
        _hashCode += getWorkletRunId();
        if (getWorkflowRunInstanceName() != null) {
            _hashCode += getWorkflowRunInstanceName().hashCode();
        }
        if (getPerformanceCounter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPerformanceCounter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPerformanceCounter(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SessionPerformanceData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "SessionPerformanceData"));
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
        elemField.setFieldName("instanceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InstanceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskRunStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaskRunStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "ETaskRunStatus"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowRunInstanceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorkflowRunInstanceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("performanceCounter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PerformanceCounter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "PerformanceCounter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
