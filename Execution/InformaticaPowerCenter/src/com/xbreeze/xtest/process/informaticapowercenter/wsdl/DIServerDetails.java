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
 * DIServerDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xbreeze.xtest.process.informaticapowercenter.wsdl;

public class DIServerDetails  implements java.io.Serializable {
    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.EDIServerRunStatus DIServerStatus;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate currentTime;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate startupTime;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate referenceTime;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowDetails[] workflowDetails;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.LinkDetails[] linkDetails;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskDetails[] taskDetails;

    public DIServerDetails() {
    }

    public DIServerDetails(
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.EDIServerRunStatus DIServerStatus,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate currentTime,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate startupTime,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate referenceTime,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowDetails[] workflowDetails,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.LinkDetails[] linkDetails,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskDetails[] taskDetails) {
           this.DIServerStatus = DIServerStatus;
           this.currentTime = currentTime;
           this.startupTime = startupTime;
           this.referenceTime = referenceTime;
           this.workflowDetails = workflowDetails;
           this.linkDetails = linkDetails;
           this.taskDetails = taskDetails;
    }


    /**
     * Gets the DIServerStatus value for this DIServerDetails.
     * 
     * @return DIServerStatus
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.EDIServerRunStatus getDIServerStatus() {
        return DIServerStatus;
    }


    /**
     * Sets the DIServerStatus value for this DIServerDetails.
     * 
     * @param DIServerStatus
     */
    public void setDIServerStatus(com.xbreeze.xtest.process.informaticapowercenter.wsdl.EDIServerRunStatus DIServerStatus) {
        this.DIServerStatus = DIServerStatus;
    }


    /**
     * Gets the currentTime value for this DIServerDetails.
     * 
     * @return currentTime
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate getCurrentTime() {
        return currentTime;
    }


    /**
     * Sets the currentTime value for this DIServerDetails.
     * 
     * @param currentTime
     */
    public void setCurrentTime(com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate currentTime) {
        this.currentTime = currentTime;
    }


    /**
     * Gets the startupTime value for this DIServerDetails.
     * 
     * @return startupTime
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate getStartupTime() {
        return startupTime;
    }


    /**
     * Sets the startupTime value for this DIServerDetails.
     * 
     * @param startupTime
     */
    public void setStartupTime(com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate startupTime) {
        this.startupTime = startupTime;
    }


    /**
     * Gets the referenceTime value for this DIServerDetails.
     * 
     * @return referenceTime
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate getReferenceTime() {
        return referenceTime;
    }


    /**
     * Sets the referenceTime value for this DIServerDetails.
     * 
     * @param referenceTime
     */
    public void setReferenceTime(com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate referenceTime) {
        this.referenceTime = referenceTime;
    }


    /**
     * Gets the workflowDetails value for this DIServerDetails.
     * 
     * @return workflowDetails
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowDetails[] getWorkflowDetails() {
        return workflowDetails;
    }


    /**
     * Sets the workflowDetails value for this DIServerDetails.
     * 
     * @param workflowDetails
     */
    public void setWorkflowDetails(com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowDetails[] workflowDetails) {
        this.workflowDetails = workflowDetails;
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowDetails getWorkflowDetails(int i) {
        return this.workflowDetails[i];
    }

    public void setWorkflowDetails(int i, com.xbreeze.xtest.process.informaticapowercenter.wsdl.WorkflowDetails _value) {
        this.workflowDetails[i] = _value;
    }


    /**
     * Gets the linkDetails value for this DIServerDetails.
     * 
     * @return linkDetails
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.LinkDetails[] getLinkDetails() {
        return linkDetails;
    }


    /**
     * Sets the linkDetails value for this DIServerDetails.
     * 
     * @param linkDetails
     */
    public void setLinkDetails(com.xbreeze.xtest.process.informaticapowercenter.wsdl.LinkDetails[] linkDetails) {
        this.linkDetails = linkDetails;
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.LinkDetails getLinkDetails(int i) {
        return this.linkDetails[i];
    }

    public void setLinkDetails(int i, com.xbreeze.xtest.process.informaticapowercenter.wsdl.LinkDetails _value) {
        this.linkDetails[i] = _value;
    }


    /**
     * Gets the taskDetails value for this DIServerDetails.
     * 
     * @return taskDetails
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskDetails[] getTaskDetails() {
        return taskDetails;
    }


    /**
     * Sets the taskDetails value for this DIServerDetails.
     * 
     * @param taskDetails
     */
    public void setTaskDetails(com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskDetails[] taskDetails) {
        this.taskDetails = taskDetails;
    }

    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskDetails getTaskDetails(int i) {
        return this.taskDetails[i];
    }

    public void setTaskDetails(int i, com.xbreeze.xtest.process.informaticapowercenter.wsdl.TaskDetails _value) {
        this.taskDetails[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DIServerDetails)) return false;
        DIServerDetails other = (DIServerDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DIServerStatus==null && other.getDIServerStatus()==null) || 
             (this.DIServerStatus!=null &&
              this.DIServerStatus.equals(other.getDIServerStatus()))) &&
            ((this.currentTime==null && other.getCurrentTime()==null) || 
             (this.currentTime!=null &&
              this.currentTime.equals(other.getCurrentTime()))) &&
            ((this.startupTime==null && other.getStartupTime()==null) || 
             (this.startupTime!=null &&
              this.startupTime.equals(other.getStartupTime()))) &&
            ((this.referenceTime==null && other.getReferenceTime()==null) || 
             (this.referenceTime!=null &&
              this.referenceTime.equals(other.getReferenceTime()))) &&
            ((this.workflowDetails==null && other.getWorkflowDetails()==null) || 
             (this.workflowDetails!=null &&
              java.util.Arrays.equals(this.workflowDetails, other.getWorkflowDetails()))) &&
            ((this.linkDetails==null && other.getLinkDetails()==null) || 
             (this.linkDetails!=null &&
              java.util.Arrays.equals(this.linkDetails, other.getLinkDetails()))) &&
            ((this.taskDetails==null && other.getTaskDetails()==null) || 
             (this.taskDetails!=null &&
              java.util.Arrays.equals(this.taskDetails, other.getTaskDetails())));
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
        if (getDIServerStatus() != null) {
            _hashCode += getDIServerStatus().hashCode();
        }
        if (getCurrentTime() != null) {
            _hashCode += getCurrentTime().hashCode();
        }
        if (getStartupTime() != null) {
            _hashCode += getStartupTime().hashCode();
        }
        if (getReferenceTime() != null) {
            _hashCode += getReferenceTime().hashCode();
        }
        if (getWorkflowDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkflowDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkflowDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLinkDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLinkDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLinkDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaskDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaskDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaskDetails(), i);
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
        new org.apache.axis.description.TypeDesc(DIServerDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "DIServerDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DIServerStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DIServerStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "EDIServerRunStatus"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CurrentTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "DIServerDate"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startupTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartupTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "DIServerDate"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReferenceTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "DIServerDate"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorkflowDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "WorkflowDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LinkDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "LinkDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaskDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "TaskDetails"));
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
