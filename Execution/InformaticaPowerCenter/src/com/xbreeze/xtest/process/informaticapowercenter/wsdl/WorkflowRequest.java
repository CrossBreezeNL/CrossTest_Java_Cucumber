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
 * WorkflowRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xbreeze.xtest.process.informaticapowercenter.wsdl;

public class WorkflowRequest  implements java.io.Serializable {
    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServiceInfo DIServiceInfo;

    private java.lang.String folderName;

    private java.lang.String workflowName;

    private java.lang.Integer workflowRunId;

    private java.lang.String workflowRunInstanceName;

    private java.lang.String reason;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.Attribute[] attribute;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.Key[] key;

    private java.lang.String parameterFileName;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.Parameter[] parameters;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.ETaskRunMode requestMode;

    private java.lang.String taskInstancePath;

    private boolean isAbort;

    private java.lang.String OSUser;

    public WorkflowRequest() {
    }

    public WorkflowRequest(
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServiceInfo DIServiceInfo,
           java.lang.String folderName,
           java.lang.String workflowName,
           java.lang.Integer workflowRunId,
           java.lang.String workflowRunInstanceName,
           java.lang.String reason,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.Attribute[] attribute,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.Key[] key,
           java.lang.String parameterFileName,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.Parameter[] parameters,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.ETaskRunMode requestMode,
           java.lang.String taskInstancePath,
           boolean isAbort,
           java.lang.String OSUser) {
           this.DIServiceInfo = DIServiceInfo;
           this.folderName = folderName;
           this.workflowName = workflowName;
           this.workflowRunId = workflowRunId;
           this.workflowRunInstanceName = workflowRunInstanceName;
           this.reason = reason;
           this.attribute = attribute;
           this.key = key;
           this.parameterFileName = parameterFileName;
           this.parameters = parameters;
           this.requestMode = requestMode;
           this.taskInstancePath = taskInstancePath;
           this.isAbort = isAbort;
           this.OSUser = OSUser;
    }


    /**
     * Gets the DIServiceInfo value for this WorkflowRequest.
     * 
     * @return DIServiceInfo
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServiceInfo getDIServiceInfo() {
        return DIServiceInfo;
    }


    /**
     * Sets the DIServiceInfo value for this WorkflowRequest.
     * 
     * @param DIServiceInfo
     */
    public void setDIServiceInfo(com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServiceInfo DIServiceInfo) {
        this.DIServiceInfo = DIServiceInfo;
    }


    /**
     * Gets the folderName value for this WorkflowRequest.
     * 
     * @return folderName
     */
    public java.lang.String getFolderName() {
        return folderName;
    }


    /**
     * Sets the folderName value for this WorkflowRequest.
     * 
     * @param folderName
     */
    public void setFolderName(java.lang.String folderName) {
        this.folderName = folderName;
    }


    /**
     * Gets the workflowName value for this WorkflowRequest.
     * 
     * @return workflowName
     */
    public java.lang.String getWorkflowName() {
        return workflowName;
    }


    /**
     * Sets the workflowName value for this WorkflowRequest.
     * 
     * @param workflowName
     */
    public void setWorkflowName(java.lang.String workflowName) {
        this.workflowName = workflowName;
    }


    /**
     * Gets the workflowRunId value for this WorkflowRequest.
     * 
     * @return workflowRunId
     */
    public java.lang.Integer getWorkflowRunId() {
        return workflowRunId;
    }


    /**
     * Sets the workflowRunId value for this WorkflowRequest.
     * 
     * @param workflowRunId
     */
    public void setWorkflowRunId(java.lang.Integer workflowRunId) {
        this.workflowRunId = workflowRunId;
    }


    /**
     * Gets the workflowRunInstanceName value for this WorkflowRequest.
     * 
     * @return workflowRunInstanceName
     */
    public java.lang.String getWorkflowRunInstanceName() {
        return workflowRunInstanceName;
    }


    /**
     * Sets the workflowRunInstanceName value for this WorkflowRequest.
     * 
     * @param workflowRunInstanceName
     */
    public void setWorkflowRunInstanceName(java.lang.String workflowRunInstanceName) {
        this.workflowRunInstanceName = workflowRunInstanceName;
    }


    /**
     * Gets the reason value for this WorkflowRequest.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this WorkflowRequest.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the attribute value for this WorkflowRequest.
     * 
     * @return attribute
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.Attribute[] getAttribute() {
        return attribute;
    }


    /**
     * Sets the attribute value for this WorkflowRequest.
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
     * Gets the key value for this WorkflowRequest.
     * 
     * @return key
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.Key[] getKey() {
        return key;
    }


    /**
     * Sets the key value for this WorkflowRequest.
     * 
     * @param key
     */
    public void setKey(com.xbreeze.xtest.process.informaticapowercenter.wsdl.Key[] key) {
        this.key = key;
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.Key getKey(int i) {
        return this.key[i];
    }

    public void setKey(int i, com.xbreeze.xtest.process.informaticapowercenter.wsdl.Key _value) {
        this.key[i] = _value;
    }


    /**
     * Gets the parameterFileName value for this WorkflowRequest.
     * 
     * @return parameterFileName
     */
    public java.lang.String getParameterFileName() {
        return parameterFileName;
    }


    /**
     * Sets the parameterFileName value for this WorkflowRequest.
     * 
     * @param parameterFileName
     */
    public void setParameterFileName(java.lang.String parameterFileName) {
        this.parameterFileName = parameterFileName;
    }


    /**
     * Gets the parameters value for this WorkflowRequest.
     * 
     * @return parameters
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.Parameter[] getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this WorkflowRequest.
     * 
     * @param parameters
     */
    public void setParameters(com.xbreeze.xtest.process.informaticapowercenter.wsdl.Parameter[] parameters) {
        this.parameters = parameters;
    }


    /**
     * Gets the requestMode value for this WorkflowRequest.
     * 
     * @return requestMode
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.ETaskRunMode getRequestMode() {
        return requestMode;
    }


    /**
     * Sets the requestMode value for this WorkflowRequest.
     * 
     * @param requestMode
     */
    public void setRequestMode(com.xbreeze.xtest.process.informaticapowercenter.wsdl.ETaskRunMode requestMode) {
        this.requestMode = requestMode;
    }


    /**
     * Gets the taskInstancePath value for this WorkflowRequest.
     * 
     * @return taskInstancePath
     */
    public java.lang.String getTaskInstancePath() {
        return taskInstancePath;
    }


    /**
     * Sets the taskInstancePath value for this WorkflowRequest.
     * 
     * @param taskInstancePath
     */
    public void setTaskInstancePath(java.lang.String taskInstancePath) {
        this.taskInstancePath = taskInstancePath;
    }


    /**
     * Gets the isAbort value for this WorkflowRequest.
     * 
     * @return isAbort
     */
    public boolean isIsAbort() {
        return isAbort;
    }


    /**
     * Sets the isAbort value for this WorkflowRequest.
     * 
     * @param isAbort
     */
    public void setIsAbort(boolean isAbort) {
        this.isAbort = isAbort;
    }


    /**
     * Gets the OSUser value for this WorkflowRequest.
     * 
     * @return OSUser
     */
    public java.lang.String getOSUser() {
        return OSUser;
    }


    /**
     * Sets the OSUser value for this WorkflowRequest.
     * 
     * @param OSUser
     */
    public void setOSUser(java.lang.String OSUser) {
        this.OSUser = OSUser;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowRequest)) return false;
        WorkflowRequest other = (WorkflowRequest) obj;
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
            ((this.workflowRunId==null && other.getWorkflowRunId()==null) || 
             (this.workflowRunId!=null &&
              this.workflowRunId.equals(other.getWorkflowRunId()))) &&
            ((this.workflowRunInstanceName==null && other.getWorkflowRunInstanceName()==null) || 
             (this.workflowRunInstanceName!=null &&
              this.workflowRunInstanceName.equals(other.getWorkflowRunInstanceName()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.attribute==null && other.getAttribute()==null) || 
             (this.attribute!=null &&
              java.util.Arrays.equals(this.attribute, other.getAttribute()))) &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              java.util.Arrays.equals(this.key, other.getKey()))) &&
            ((this.parameterFileName==null && other.getParameterFileName()==null) || 
             (this.parameterFileName!=null &&
              this.parameterFileName.equals(other.getParameterFileName()))) &&
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              java.util.Arrays.equals(this.parameters, other.getParameters()))) &&
            ((this.requestMode==null && other.getRequestMode()==null) || 
             (this.requestMode!=null &&
              this.requestMode.equals(other.getRequestMode()))) &&
            ((this.taskInstancePath==null && other.getTaskInstancePath()==null) || 
             (this.taskInstancePath!=null &&
              this.taskInstancePath.equals(other.getTaskInstancePath()))) &&
            this.isAbort == other.isIsAbort() &&
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
        if (getDIServiceInfo() != null) {
            _hashCode += getDIServiceInfo().hashCode();
        }
        if (getFolderName() != null) {
            _hashCode += getFolderName().hashCode();
        }
        if (getWorkflowName() != null) {
            _hashCode += getWorkflowName().hashCode();
        }
        if (getWorkflowRunId() != null) {
            _hashCode += getWorkflowRunId().hashCode();
        }
        if (getWorkflowRunInstanceName() != null) {
            _hashCode += getWorkflowRunInstanceName().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
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
        if (getKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKey(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParameterFileName() != null) {
            _hashCode += getParameterFileName().hashCode();
        }
        if (getParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequestMode() != null) {
            _hashCode += getRequestMode().hashCode();
        }
        if (getTaskInstancePath() != null) {
            _hashCode += getTaskInstancePath().hashCode();
        }
        _hashCode += (isIsAbort() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getOSUser() != null) {
            _hashCode += getOSUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkflowRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WorkflowRequest"));
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
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowRunInstanceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorkflowRunInstanceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Reason"));
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
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "Key"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ParameterFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "Parameter"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Parameters"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "ETaskRunMode"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskInstancePath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaskInstancePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAbort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsAbort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
