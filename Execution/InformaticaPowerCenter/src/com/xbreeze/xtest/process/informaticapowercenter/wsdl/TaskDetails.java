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
 * TaskDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xbreeze.xtest.process.informaticapowercenter.wsdl;

public class TaskDetails  implements java.io.Serializable {
    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServiceInfo DIServiceInfo;

    private java.lang.String folderName;

    private java.lang.String workflowName;

    private int workflowRunId;

    private java.lang.String workflowRunInstanceName;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.ETaskRunStatus taskRunStatus;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.ETaskType taskType;

    private int runErrorCode;

    private java.lang.String runErrorMessage;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate startTime;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate endTime;

    private java.lang.String workletInstanceName;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.Attribute[] attribute;

    private int childRunId;

    private java.lang.String instanceName;

    private boolean isSessionTask;

    private int workletRunId;

    public TaskDetails() {
    }

    public TaskDetails(
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServiceInfo DIServiceInfo,
           java.lang.String folderName,
           java.lang.String workflowName,
           int workflowRunId,
           java.lang.String workflowRunInstanceName,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.ETaskRunStatus taskRunStatus,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.ETaskType taskType,
           int runErrorCode,
           java.lang.String runErrorMessage,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate startTime,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate endTime,
           java.lang.String workletInstanceName,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.Attribute[] attribute,
           int childRunId,
           java.lang.String instanceName,
           boolean isSessionTask,
           int workletRunId) {
           this.DIServiceInfo = DIServiceInfo;
           this.folderName = folderName;
           this.workflowName = workflowName;
           this.workflowRunId = workflowRunId;
           this.workflowRunInstanceName = workflowRunInstanceName;
           this.taskRunStatus = taskRunStatus;
           this.taskType = taskType;
           this.runErrorCode = runErrorCode;
           this.runErrorMessage = runErrorMessage;
           this.startTime = startTime;
           this.endTime = endTime;
           this.workletInstanceName = workletInstanceName;
           this.attribute = attribute;
           this.childRunId = childRunId;
           this.instanceName = instanceName;
           this.isSessionTask = isSessionTask;
           this.workletRunId = workletRunId;
    }


    /**
     * Gets the DIServiceInfo value for this TaskDetails.
     * 
     * @return DIServiceInfo
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServiceInfo getDIServiceInfo() {
        return DIServiceInfo;
    }


    /**
     * Sets the DIServiceInfo value for this TaskDetails.
     * 
     * @param DIServiceInfo
     */
    public void setDIServiceInfo(com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServiceInfo DIServiceInfo) {
        this.DIServiceInfo = DIServiceInfo;
    }


    /**
     * Gets the folderName value for this TaskDetails.
     * 
     * @return folderName
     */
    public java.lang.String getFolderName() {
        return folderName;
    }


    /**
     * Sets the folderName value for this TaskDetails.
     * 
     * @param folderName
     */
    public void setFolderName(java.lang.String folderName) {
        this.folderName = folderName;
    }


    /**
     * Gets the workflowName value for this TaskDetails.
     * 
     * @return workflowName
     */
    public java.lang.String getWorkflowName() {
        return workflowName;
    }


    /**
     * Sets the workflowName value for this TaskDetails.
     * 
     * @param workflowName
     */
    public void setWorkflowName(java.lang.String workflowName) {
        this.workflowName = workflowName;
    }


    /**
     * Gets the workflowRunId value for this TaskDetails.
     * 
     * @return workflowRunId
     */
    public int getWorkflowRunId() {
        return workflowRunId;
    }


    /**
     * Sets the workflowRunId value for this TaskDetails.
     * 
     * @param workflowRunId
     */
    public void setWorkflowRunId(int workflowRunId) {
        this.workflowRunId = workflowRunId;
    }


    /**
     * Gets the workflowRunInstanceName value for this TaskDetails.
     * 
     * @return workflowRunInstanceName
     */
    public java.lang.String getWorkflowRunInstanceName() {
        return workflowRunInstanceName;
    }


    /**
     * Sets the workflowRunInstanceName value for this TaskDetails.
     * 
     * @param workflowRunInstanceName
     */
    public void setWorkflowRunInstanceName(java.lang.String workflowRunInstanceName) {
        this.workflowRunInstanceName = workflowRunInstanceName;
    }


    /**
     * Gets the taskRunStatus value for this TaskDetails.
     * 
     * @return taskRunStatus
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.ETaskRunStatus getTaskRunStatus() {
        return taskRunStatus;
    }


    /**
     * Sets the taskRunStatus value for this TaskDetails.
     * 
     * @param taskRunStatus
     */
    public void setTaskRunStatus(com.xbreeze.xtest.process.informaticapowercenter.wsdl.ETaskRunStatus taskRunStatus) {
        this.taskRunStatus = taskRunStatus;
    }


    /**
     * Gets the taskType value for this TaskDetails.
     * 
     * @return taskType
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.ETaskType getTaskType() {
        return taskType;
    }


    /**
     * Sets the taskType value for this TaskDetails.
     * 
     * @param taskType
     */
    public void setTaskType(com.xbreeze.xtest.process.informaticapowercenter.wsdl.ETaskType taskType) {
        this.taskType = taskType;
    }


    /**
     * Gets the runErrorCode value for this TaskDetails.
     * 
     * @return runErrorCode
     */
    public int getRunErrorCode() {
        return runErrorCode;
    }


    /**
     * Sets the runErrorCode value for this TaskDetails.
     * 
     * @param runErrorCode
     */
    public void setRunErrorCode(int runErrorCode) {
        this.runErrorCode = runErrorCode;
    }


    /**
     * Gets the runErrorMessage value for this TaskDetails.
     * 
     * @return runErrorMessage
     */
    public java.lang.String getRunErrorMessage() {
        return runErrorMessage;
    }


    /**
     * Sets the runErrorMessage value for this TaskDetails.
     * 
     * @param runErrorMessage
     */
    public void setRunErrorMessage(java.lang.String runErrorMessage) {
        this.runErrorMessage = runErrorMessage;
    }


    /**
     * Gets the startTime value for this TaskDetails.
     * 
     * @return startTime
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this TaskDetails.
     * 
     * @param startTime
     */
    public void setStartTime(com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this TaskDetails.
     * 
     * @return endTime
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this TaskDetails.
     * 
     * @param endTime
     */
    public void setEndTime(com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the workletInstanceName value for this TaskDetails.
     * 
     * @return workletInstanceName
     */
    public java.lang.String getWorkletInstanceName() {
        return workletInstanceName;
    }


    /**
     * Sets the workletInstanceName value for this TaskDetails.
     * 
     * @param workletInstanceName
     */
    public void setWorkletInstanceName(java.lang.String workletInstanceName) {
        this.workletInstanceName = workletInstanceName;
    }


    /**
     * Gets the attribute value for this TaskDetails.
     * 
     * @return attribute
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.Attribute[] getAttribute() {
        return attribute;
    }


    /**
     * Sets the attribute value for this TaskDetails.
     * 
     * @param attribute
     */
    public void setAttribute(com.xbreeze.xtest.process.informaticapowercenter.wsdl.Attribute[] attribute) {
        this.attribute = attribute;
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.Attribute getAttribute(int i) {
        return this.attribute[i];
    }

    public void setAttribute(int i, com.xbreeze.xtest.process.informaticapowercenter.wsdl.Attribute _value) {
        this.attribute[i] = _value;
    }


    /**
     * Gets the childRunId value for this TaskDetails.
     * 
     * @return childRunId
     */
    public int getChildRunId() {
        return childRunId;
    }


    /**
     * Sets the childRunId value for this TaskDetails.
     * 
     * @param childRunId
     */
    public void setChildRunId(int childRunId) {
        this.childRunId = childRunId;
    }


    /**
     * Gets the instanceName value for this TaskDetails.
     * 
     * @return instanceName
     */
    public java.lang.String getInstanceName() {
        return instanceName;
    }


    /**
     * Sets the instanceName value for this TaskDetails.
     * 
     * @param instanceName
     */
    public void setInstanceName(java.lang.String instanceName) {
        this.instanceName = instanceName;
    }


    /**
     * Gets the isSessionTask value for this TaskDetails.
     * 
     * @return isSessionTask
     */
    public boolean isIsSessionTask() {
        return isSessionTask;
    }


    /**
     * Sets the isSessionTask value for this TaskDetails.
     * 
     * @param isSessionTask
     */
    public void setIsSessionTask(boolean isSessionTask) {
        this.isSessionTask = isSessionTask;
    }


    /**
     * Gets the workletRunId value for this TaskDetails.
     * 
     * @return workletRunId
     */
    public int getWorkletRunId() {
        return workletRunId;
    }


    /**
     * Sets the workletRunId value for this TaskDetails.
     * 
     * @param workletRunId
     */
    public void setWorkletRunId(int workletRunId) {
        this.workletRunId = workletRunId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaskDetails)) return false;
        TaskDetails other = (TaskDetails) obj;
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
            this.workflowRunId == other.getWorkflowRunId() &&
            ((this.workflowRunInstanceName==null && other.getWorkflowRunInstanceName()==null) || 
             (this.workflowRunInstanceName!=null &&
              this.workflowRunInstanceName.equals(other.getWorkflowRunInstanceName()))) &&
            ((this.taskRunStatus==null && other.getTaskRunStatus()==null) || 
             (this.taskRunStatus!=null &&
              this.taskRunStatus.equals(other.getTaskRunStatus()))) &&
            ((this.taskType==null && other.getTaskType()==null) || 
             (this.taskType!=null &&
              this.taskType.equals(other.getTaskType()))) &&
            this.runErrorCode == other.getRunErrorCode() &&
            ((this.runErrorMessage==null && other.getRunErrorMessage()==null) || 
             (this.runErrorMessage!=null &&
              this.runErrorMessage.equals(other.getRunErrorMessage()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.workletInstanceName==null && other.getWorkletInstanceName()==null) || 
             (this.workletInstanceName!=null &&
              this.workletInstanceName.equals(other.getWorkletInstanceName()))) &&
            ((this.attribute==null && other.getAttribute()==null) || 
             (this.attribute!=null &&
              java.util.Arrays.equals(this.attribute, other.getAttribute()))) &&
            this.childRunId == other.getChildRunId() &&
            ((this.instanceName==null && other.getInstanceName()==null) || 
             (this.instanceName!=null &&
              this.instanceName.equals(other.getInstanceName()))) &&
            this.isSessionTask == other.isIsSessionTask() &&
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
        if (getDIServiceInfo() != null) {
            _hashCode += getDIServiceInfo().hashCode();
        }
        if (getFolderName() != null) {
            _hashCode += getFolderName().hashCode();
        }
        if (getWorkflowName() != null) {
            _hashCode += getWorkflowName().hashCode();
        }
        _hashCode += getWorkflowRunId();
        if (getWorkflowRunInstanceName() != null) {
            _hashCode += getWorkflowRunInstanceName().hashCode();
        }
        if (getTaskRunStatus() != null) {
            _hashCode += getTaskRunStatus().hashCode();
        }
        if (getTaskType() != null) {
            _hashCode += getTaskType().hashCode();
        }
        _hashCode += getRunErrorCode();
        if (getRunErrorMessage() != null) {
            _hashCode += getRunErrorMessage().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getWorkletInstanceName() != null) {
            _hashCode += getWorkletInstanceName().hashCode();
        }
        if (getAttribute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttribute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttribute(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getChildRunId();
        if (getInstanceName() != null) {
            _hashCode += getInstanceName().hashCode();
        }
        _hashCode += (isIsSessionTask() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getWorkletRunId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaskDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "TaskDetails"));
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
        elemField.setFieldName("workflowRunId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorkflowRunId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowRunInstanceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorkflowRunInstanceName"));
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
        elemField.setFieldName("taskType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaskType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "ETaskType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RunErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runErrorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RunErrorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "DIServerDate"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "DIServerDate"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workletInstanceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorkletInstanceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Attribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "Attribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childRunId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChildRunId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instanceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InstanceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSessionTask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsSessionTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
