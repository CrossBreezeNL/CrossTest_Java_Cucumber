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
 * WorkflowDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xbreeze.xtest.process.informaticapowercenter.wsdl;

public class WorkflowDetails  implements java.io.Serializable {
    private java.lang.String folderName;

    private java.lang.String workflowName;

    private int workflowRunId;

    private java.lang.String workflowRunInstanceName;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.EWorkflowRunStatus workflowRunStatus;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.EWorkflowRunType workflowRunType;

    private int runErrorCode;

    private java.lang.String runErrorMessage;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate startTime;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate endTime;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.Attribute[] attribute;

    private java.lang.String userName;

    private java.lang.String logFileName;

    private int logFileCodePage;

    private java.lang.String OSUser;

    public WorkflowDetails() {
    }

    public WorkflowDetails(
           java.lang.String folderName,
           java.lang.String workflowName,
           int workflowRunId,
           java.lang.String workflowRunInstanceName,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.EWorkflowRunStatus workflowRunStatus,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.EWorkflowRunType workflowRunType,
           int runErrorCode,
           java.lang.String runErrorMessage,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate startTime,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate endTime,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.Attribute[] attribute,
           java.lang.String userName,
           java.lang.String logFileName,
           int logFileCodePage,
           java.lang.String OSUser) {
           this.folderName = folderName;
           this.workflowName = workflowName;
           this.workflowRunId = workflowRunId;
           this.workflowRunInstanceName = workflowRunInstanceName;
           this.workflowRunStatus = workflowRunStatus;
           this.workflowRunType = workflowRunType;
           this.runErrorCode = runErrorCode;
           this.runErrorMessage = runErrorMessage;
           this.startTime = startTime;
           this.endTime = endTime;
           this.attribute = attribute;
           this.userName = userName;
           this.logFileName = logFileName;
           this.logFileCodePage = logFileCodePage;
           this.OSUser = OSUser;
    }


    /**
     * Gets the folderName value for this WorkflowDetails.
     * 
     * @return folderName
     */
    public java.lang.String getFolderName() {
        return folderName;
    }


    /**
     * Sets the folderName value for this WorkflowDetails.
     * 
     * @param folderName
     */
    public void setFolderName(java.lang.String folderName) {
        this.folderName = folderName;
    }


    /**
     * Gets the workflowName value for this WorkflowDetails.
     * 
     * @return workflowName
     */
    public java.lang.String getWorkflowName() {
        return workflowName;
    }


    /**
     * Sets the workflowName value for this WorkflowDetails.
     * 
     * @param workflowName
     */
    public void setWorkflowName(java.lang.String workflowName) {
        this.workflowName = workflowName;
    }


    /**
     * Gets the workflowRunId value for this WorkflowDetails.
     * 
     * @return workflowRunId
     */
    public int getWorkflowRunId() {
        return workflowRunId;
    }


    /**
     * Sets the workflowRunId value for this WorkflowDetails.
     * 
     * @param workflowRunId
     */
    public void setWorkflowRunId(int workflowRunId) {
        this.workflowRunId = workflowRunId;
    }


    /**
     * Gets the workflowRunInstanceName value for this WorkflowDetails.
     * 
     * @return workflowRunInstanceName
     */
    public java.lang.String getWorkflowRunInstanceName() {
        return workflowRunInstanceName;
    }


    /**
     * Sets the workflowRunInstanceName value for this WorkflowDetails.
     * 
     * @param workflowRunInstanceName
     */
    public void setWorkflowRunInstanceName(java.lang.String workflowRunInstanceName) {
        this.workflowRunInstanceName = workflowRunInstanceName;
    }


    /**
     * Gets the workflowRunStatus value for this WorkflowDetails.
     * 
     * @return workflowRunStatus
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.EWorkflowRunStatus getWorkflowRunStatus() {
        return workflowRunStatus;
    }


    /**
     * Sets the workflowRunStatus value for this WorkflowDetails.
     * 
     * @param workflowRunStatus
     */
    public void setWorkflowRunStatus(com.xbreeze.xtest.process.informaticapowercenter.wsdl.EWorkflowRunStatus workflowRunStatus) {
        this.workflowRunStatus = workflowRunStatus;
    }


    /**
     * Gets the workflowRunType value for this WorkflowDetails.
     * 
     * @return workflowRunType
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.EWorkflowRunType getWorkflowRunType() {
        return workflowRunType;
    }


    /**
     * Sets the workflowRunType value for this WorkflowDetails.
     * 
     * @param workflowRunType
     */
    public void setWorkflowRunType(com.xbreeze.xtest.process.informaticapowercenter.wsdl.EWorkflowRunType workflowRunType) {
        this.workflowRunType = workflowRunType;
    }


    /**
     * Gets the runErrorCode value for this WorkflowDetails.
     * 
     * @return runErrorCode
     */
    public int getRunErrorCode() {
        return runErrorCode;
    }


    /**
     * Sets the runErrorCode value for this WorkflowDetails.
     * 
     * @param runErrorCode
     */
    public void setRunErrorCode(int runErrorCode) {
        this.runErrorCode = runErrorCode;
    }


    /**
     * Gets the runErrorMessage value for this WorkflowDetails.
     * 
     * @return runErrorMessage
     */
    public java.lang.String getRunErrorMessage() {
        return runErrorMessage;
    }


    /**
     * Sets the runErrorMessage value for this WorkflowDetails.
     * 
     * @param runErrorMessage
     */
    public void setRunErrorMessage(java.lang.String runErrorMessage) {
        this.runErrorMessage = runErrorMessage;
    }


    /**
     * Gets the startTime value for this WorkflowDetails.
     * 
     * @return startTime
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this WorkflowDetails.
     * 
     * @param startTime
     */
    public void setStartTime(com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this WorkflowDetails.
     * 
     * @return endTime
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this WorkflowDetails.
     * 
     * @param endTime
     */
    public void setEndTime(com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the attribute value for this WorkflowDetails.
     * 
     * @return attribute
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.Attribute[] getAttribute() {
        return attribute;
    }


    /**
     * Sets the attribute value for this WorkflowDetails.
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
     * Gets the userName value for this WorkflowDetails.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this WorkflowDetails.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the logFileName value for this WorkflowDetails.
     * 
     * @return logFileName
     */
    public java.lang.String getLogFileName() {
        return logFileName;
    }


    /**
     * Sets the logFileName value for this WorkflowDetails.
     * 
     * @param logFileName
     */
    public void setLogFileName(java.lang.String logFileName) {
        this.logFileName = logFileName;
    }


    /**
     * Gets the logFileCodePage value for this WorkflowDetails.
     * 
     * @return logFileCodePage
     */
    public int getLogFileCodePage() {
        return logFileCodePage;
    }


    /**
     * Sets the logFileCodePage value for this WorkflowDetails.
     * 
     * @param logFileCodePage
     */
    public void setLogFileCodePage(int logFileCodePage) {
        this.logFileCodePage = logFileCodePage;
    }


    /**
     * Gets the OSUser value for this WorkflowDetails.
     * 
     * @return OSUser
     */
    public java.lang.String getOSUser() {
        return OSUser;
    }


    /**
     * Sets the OSUser value for this WorkflowDetails.
     * 
     * @param OSUser
     */
    public void setOSUser(java.lang.String OSUser) {
        this.OSUser = OSUser;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowDetails)) return false;
        WorkflowDetails other = (WorkflowDetails) obj;
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
            this.workflowRunId == other.getWorkflowRunId() &&
            ((this.workflowRunInstanceName==null && other.getWorkflowRunInstanceName()==null) || 
             (this.workflowRunInstanceName!=null &&
              this.workflowRunInstanceName.equals(other.getWorkflowRunInstanceName()))) &&
            ((this.workflowRunStatus==null && other.getWorkflowRunStatus()==null) || 
             (this.workflowRunStatus!=null &&
              this.workflowRunStatus.equals(other.getWorkflowRunStatus()))) &&
            ((this.workflowRunType==null && other.getWorkflowRunType()==null) || 
             (this.workflowRunType!=null &&
              this.workflowRunType.equals(other.getWorkflowRunType()))) &&
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
            ((this.attribute==null && other.getAttribute()==null) || 
             (this.attribute!=null &&
              java.util.Arrays.equals(this.attribute, other.getAttribute()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.logFileName==null && other.getLogFileName()==null) || 
             (this.logFileName!=null &&
              this.logFileName.equals(other.getLogFileName()))) &&
            this.logFileCodePage == other.getLogFileCodePage() &&
            ((this.OSUser==null && other.getOSUser()==null) || 
             (this.OSUser!=null &&
              this.OSUser.equals(other.getOSUser())));
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
        _hashCode += getWorkflowRunId();
        if (getWorkflowRunInstanceName() != null) {
            _hashCode += getWorkflowRunInstanceName().hashCode();
        }
        if (getWorkflowRunStatus() != null) {
            _hashCode += getWorkflowRunStatus().hashCode();
        }
        if (getWorkflowRunType() != null) {
            _hashCode += getWorkflowRunType().hashCode();
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
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getLogFileName() != null) {
            _hashCode += getLogFileName().hashCode();
        }
        _hashCode += getLogFileCodePage();
        if (getOSUser() != null) {
            _hashCode += getOSUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkflowDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WorkflowDetails"));
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
        elemField.setFieldName("workflowRunStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorkflowRunStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "EWorkflowRunStatus"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowRunType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorkflowRunType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "EWorkflowRunType"));
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
        elemField.setFieldName("attribute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Attribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "Attribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LogFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logFileCodePage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LogFileCodePage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OSUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OSUser"));
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
