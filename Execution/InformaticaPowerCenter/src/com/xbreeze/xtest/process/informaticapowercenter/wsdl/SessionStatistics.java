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
 * SessionStatistics.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xbreeze.xtest.process.informaticapowercenter.wsdl;

public class SessionStatistics  implements java.io.Serializable {
    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServiceInfo DIServiceInfo;

    private java.lang.String folderName;

    private java.lang.String workflowName;

    private int workflowRunId;

    private java.lang.String workflowRunInstanceName;

    private java.lang.String instanceName;

    private java.lang.String mappingName;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.ETaskRunStatus taskRunStatus;

    private int workletRunId;

    private int logFileCodePage;

    private int numSrcSuccessRows;

    private int numTgtSuccessRows;

    private int numSrcFailedRows;

    private int numTgtFailedRows;

    private int numTransErrors;

    private int numTables;

    private java.lang.String logFileName;

    private int firstErrorCode;

    private java.lang.String firstErrorMessage;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.TableStatistics[] tableStatistics;

    public SessionStatistics() {
    }

    public SessionStatistics(
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServiceInfo DIServiceInfo,
           java.lang.String folderName,
           java.lang.String workflowName,
           int workflowRunId,
           java.lang.String workflowRunInstanceName,
           java.lang.String instanceName,
           java.lang.String mappingName,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.ETaskRunStatus taskRunStatus,
           int workletRunId,
           int logFileCodePage,
           int numSrcSuccessRows,
           int numTgtSuccessRows,
           int numSrcFailedRows,
           int numTgtFailedRows,
           int numTransErrors,
           int numTables,
           java.lang.String logFileName,
           int firstErrorCode,
           java.lang.String firstErrorMessage,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.TableStatistics[] tableStatistics) {
           this.DIServiceInfo = DIServiceInfo;
           this.folderName = folderName;
           this.workflowName = workflowName;
           this.workflowRunId = workflowRunId;
           this.workflowRunInstanceName = workflowRunInstanceName;
           this.instanceName = instanceName;
           this.mappingName = mappingName;
           this.taskRunStatus = taskRunStatus;
           this.workletRunId = workletRunId;
           this.logFileCodePage = logFileCodePage;
           this.numSrcSuccessRows = numSrcSuccessRows;
           this.numTgtSuccessRows = numTgtSuccessRows;
           this.numSrcFailedRows = numSrcFailedRows;
           this.numTgtFailedRows = numTgtFailedRows;
           this.numTransErrors = numTransErrors;
           this.numTables = numTables;
           this.logFileName = logFileName;
           this.firstErrorCode = firstErrorCode;
           this.firstErrorMessage = firstErrorMessage;
           this.tableStatistics = tableStatistics;
    }


    /**
     * Gets the DIServiceInfo value for this SessionStatistics.
     * 
     * @return DIServiceInfo
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServiceInfo getDIServiceInfo() {
        return DIServiceInfo;
    }


    /**
     * Sets the DIServiceInfo value for this SessionStatistics.
     * 
     * @param DIServiceInfo
     */
    public void setDIServiceInfo(com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServiceInfo DIServiceInfo) {
        this.DIServiceInfo = DIServiceInfo;
    }


    /**
     * Gets the folderName value for this SessionStatistics.
     * 
     * @return folderName
     */
    public java.lang.String getFolderName() {
        return folderName;
    }


    /**
     * Sets the folderName value for this SessionStatistics.
     * 
     * @param folderName
     */
    public void setFolderName(java.lang.String folderName) {
        this.folderName = folderName;
    }


    /**
     * Gets the workflowName value for this SessionStatistics.
     * 
     * @return workflowName
     */
    public java.lang.String getWorkflowName() {
        return workflowName;
    }


    /**
     * Sets the workflowName value for this SessionStatistics.
     * 
     * @param workflowName
     */
    public void setWorkflowName(java.lang.String workflowName) {
        this.workflowName = workflowName;
    }


    /**
     * Gets the workflowRunId value for this SessionStatistics.
     * 
     * @return workflowRunId
     */
    public int getWorkflowRunId() {
        return workflowRunId;
    }


    /**
     * Sets the workflowRunId value for this SessionStatistics.
     * 
     * @param workflowRunId
     */
    public void setWorkflowRunId(int workflowRunId) {
        this.workflowRunId = workflowRunId;
    }


    /**
     * Gets the workflowRunInstanceName value for this SessionStatistics.
     * 
     * @return workflowRunInstanceName
     */
    public java.lang.String getWorkflowRunInstanceName() {
        return workflowRunInstanceName;
    }


    /**
     * Sets the workflowRunInstanceName value for this SessionStatistics.
     * 
     * @param workflowRunInstanceName
     */
    public void setWorkflowRunInstanceName(java.lang.String workflowRunInstanceName) {
        this.workflowRunInstanceName = workflowRunInstanceName;
    }


    /**
     * Gets the instanceName value for this SessionStatistics.
     * 
     * @return instanceName
     */
    public java.lang.String getInstanceName() {
        return instanceName;
    }


    /**
     * Sets the instanceName value for this SessionStatistics.
     * 
     * @param instanceName
     */
    public void setInstanceName(java.lang.String instanceName) {
        this.instanceName = instanceName;
    }


    /**
     * Gets the mappingName value for this SessionStatistics.
     * 
     * @return mappingName
     */
    public java.lang.String getMappingName() {
        return mappingName;
    }


    /**
     * Sets the mappingName value for this SessionStatistics.
     * 
     * @param mappingName
     */
    public void setMappingName(java.lang.String mappingName) {
        this.mappingName = mappingName;
    }


    /**
     * Gets the taskRunStatus value for this SessionStatistics.
     * 
     * @return taskRunStatus
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.ETaskRunStatus getTaskRunStatus() {
        return taskRunStatus;
    }


    /**
     * Sets the taskRunStatus value for this SessionStatistics.
     * 
     * @param taskRunStatus
     */
    public void setTaskRunStatus(com.xbreeze.xtest.process.informaticapowercenter.wsdl.ETaskRunStatus taskRunStatus) {
        this.taskRunStatus = taskRunStatus;
    }


    /**
     * Gets the workletRunId value for this SessionStatistics.
     * 
     * @return workletRunId
     */
    public int getWorkletRunId() {
        return workletRunId;
    }


    /**
     * Sets the workletRunId value for this SessionStatistics.
     * 
     * @param workletRunId
     */
    public void setWorkletRunId(int workletRunId) {
        this.workletRunId = workletRunId;
    }


    /**
     * Gets the logFileCodePage value for this SessionStatistics.
     * 
     * @return logFileCodePage
     */
    public int getLogFileCodePage() {
        return logFileCodePage;
    }


    /**
     * Sets the logFileCodePage value for this SessionStatistics.
     * 
     * @param logFileCodePage
     */
    public void setLogFileCodePage(int logFileCodePage) {
        this.logFileCodePage = logFileCodePage;
    }


    /**
     * Gets the numSrcSuccessRows value for this SessionStatistics.
     * 
     * @return numSrcSuccessRows
     */
    public int getNumSrcSuccessRows() {
        return numSrcSuccessRows;
    }


    /**
     * Sets the numSrcSuccessRows value for this SessionStatistics.
     * 
     * @param numSrcSuccessRows
     */
    public void setNumSrcSuccessRows(int numSrcSuccessRows) {
        this.numSrcSuccessRows = numSrcSuccessRows;
    }


    /**
     * Gets the numTgtSuccessRows value for this SessionStatistics.
     * 
     * @return numTgtSuccessRows
     */
    public int getNumTgtSuccessRows() {
        return numTgtSuccessRows;
    }


    /**
     * Sets the numTgtSuccessRows value for this SessionStatistics.
     * 
     * @param numTgtSuccessRows
     */
    public void setNumTgtSuccessRows(int numTgtSuccessRows) {
        this.numTgtSuccessRows = numTgtSuccessRows;
    }


    /**
     * Gets the numSrcFailedRows value for this SessionStatistics.
     * 
     * @return numSrcFailedRows
     */
    public int getNumSrcFailedRows() {
        return numSrcFailedRows;
    }


    /**
     * Sets the numSrcFailedRows value for this SessionStatistics.
     * 
     * @param numSrcFailedRows
     */
    public void setNumSrcFailedRows(int numSrcFailedRows) {
        this.numSrcFailedRows = numSrcFailedRows;
    }


    /**
     * Gets the numTgtFailedRows value for this SessionStatistics.
     * 
     * @return numTgtFailedRows
     */
    public int getNumTgtFailedRows() {
        return numTgtFailedRows;
    }


    /**
     * Sets the numTgtFailedRows value for this SessionStatistics.
     * 
     * @param numTgtFailedRows
     */
    public void setNumTgtFailedRows(int numTgtFailedRows) {
        this.numTgtFailedRows = numTgtFailedRows;
    }


    /**
     * Gets the numTransErrors value for this SessionStatistics.
     * 
     * @return numTransErrors
     */
    public int getNumTransErrors() {
        return numTransErrors;
    }


    /**
     * Sets the numTransErrors value for this SessionStatistics.
     * 
     * @param numTransErrors
     */
    public void setNumTransErrors(int numTransErrors) {
        this.numTransErrors = numTransErrors;
    }


    /**
     * Gets the numTables value for this SessionStatistics.
     * 
     * @return numTables
     */
    public int getNumTables() {
        return numTables;
    }


    /**
     * Sets the numTables value for this SessionStatistics.
     * 
     * @param numTables
     */
    public void setNumTables(int numTables) {
        this.numTables = numTables;
    }


    /**
     * Gets the logFileName value for this SessionStatistics.
     * 
     * @return logFileName
     */
    public java.lang.String getLogFileName() {
        return logFileName;
    }


    /**
     * Sets the logFileName value for this SessionStatistics.
     * 
     * @param logFileName
     */
    public void setLogFileName(java.lang.String logFileName) {
        this.logFileName = logFileName;
    }


    /**
     * Gets the firstErrorCode value for this SessionStatistics.
     * 
     * @return firstErrorCode
     */
    public int getFirstErrorCode() {
        return firstErrorCode;
    }


    /**
     * Sets the firstErrorCode value for this SessionStatistics.
     * 
     * @param firstErrorCode
     */
    public void setFirstErrorCode(int firstErrorCode) {
        this.firstErrorCode = firstErrorCode;
    }


    /**
     * Gets the firstErrorMessage value for this SessionStatistics.
     * 
     * @return firstErrorMessage
     */
    public java.lang.String getFirstErrorMessage() {
        return firstErrorMessage;
    }


    /**
     * Sets the firstErrorMessage value for this SessionStatistics.
     * 
     * @param firstErrorMessage
     */
    public void setFirstErrorMessage(java.lang.String firstErrorMessage) {
        this.firstErrorMessage = firstErrorMessage;
    }


    /**
     * Gets the tableStatistics value for this SessionStatistics.
     * 
     * @return tableStatistics
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.TableStatistics[] getTableStatistics() {
        return tableStatistics;
    }


    /**
     * Sets the tableStatistics value for this SessionStatistics.
     * 
     * @param tableStatistics
     */
    public void setTableStatistics(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TableStatistics[] tableStatistics) {
        this.tableStatistics = tableStatistics;
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.TableStatistics getTableStatistics(int i) {
        return this.tableStatistics[i];
    }

    public void setTableStatistics(int i, com.xbreeze.xtest.process.informaticapowercenter.wsdl.TableStatistics _value) {
        this.tableStatistics[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SessionStatistics)) return false;
        SessionStatistics other = (SessionStatistics) obj;
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
            ((this.instanceName==null && other.getInstanceName()==null) || 
             (this.instanceName!=null &&
              this.instanceName.equals(other.getInstanceName()))) &&
            ((this.mappingName==null && other.getMappingName()==null) || 
             (this.mappingName!=null &&
              this.mappingName.equals(other.getMappingName()))) &&
            ((this.taskRunStatus==null && other.getTaskRunStatus()==null) || 
             (this.taskRunStatus!=null &&
              this.taskRunStatus.equals(other.getTaskRunStatus()))) &&
            this.workletRunId == other.getWorkletRunId() &&
            this.logFileCodePage == other.getLogFileCodePage() &&
            this.numSrcSuccessRows == other.getNumSrcSuccessRows() &&
            this.numTgtSuccessRows == other.getNumTgtSuccessRows() &&
            this.numSrcFailedRows == other.getNumSrcFailedRows() &&
            this.numTgtFailedRows == other.getNumTgtFailedRows() &&
            this.numTransErrors == other.getNumTransErrors() &&
            this.numTables == other.getNumTables() &&
            ((this.logFileName==null && other.getLogFileName()==null) || 
             (this.logFileName!=null &&
              this.logFileName.equals(other.getLogFileName()))) &&
            this.firstErrorCode == other.getFirstErrorCode() &&
            ((this.firstErrorMessage==null && other.getFirstErrorMessage()==null) || 
             (this.firstErrorMessage!=null &&
              this.firstErrorMessage.equals(other.getFirstErrorMessage()))) &&
            ((this.tableStatistics==null && other.getTableStatistics()==null) || 
             (this.tableStatistics!=null &&
              java.util.Arrays.equals(this.tableStatistics, other.getTableStatistics())));
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
        if (getInstanceName() != null) {
            _hashCode += getInstanceName().hashCode();
        }
        if (getMappingName() != null) {
            _hashCode += getMappingName().hashCode();
        }
        if (getTaskRunStatus() != null) {
            _hashCode += getTaskRunStatus().hashCode();
        }
        _hashCode += getWorkletRunId();
        _hashCode += getLogFileCodePage();
        _hashCode += getNumSrcSuccessRows();
        _hashCode += getNumTgtSuccessRows();
        _hashCode += getNumSrcFailedRows();
        _hashCode += getNumTgtFailedRows();
        _hashCode += getNumTransErrors();
        _hashCode += getNumTables();
        if (getLogFileName() != null) {
            _hashCode += getLogFileName().hashCode();
        }
        _hashCode += getFirstErrorCode();
        if (getFirstErrorMessage() != null) {
            _hashCode += getFirstErrorMessage().hashCode();
        }
        if (getTableStatistics() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTableStatistics());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTableStatistics(), i);
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
        new org.apache.axis.description.TypeDesc(SessionStatistics.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "SessionStatistics"));
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
        elemField.setFieldName("instanceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InstanceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mappingName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MappingName"));
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
        elemField.setFieldName("workletRunId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorkletRunId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logFileCodePage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LogFileCodePage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSrcSuccessRows");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumSrcSuccessRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numTgtSuccessRows");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumTgtSuccessRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSrcFailedRows");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumSrcFailedRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numTgtFailedRows");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumTgtFailedRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numTransErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumTransErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numTables");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumTables"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LogFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FirstErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstErrorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FirstErrorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableStatistics");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TableStatistics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "TableStatistics"));
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
