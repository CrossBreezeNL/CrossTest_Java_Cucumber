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
 * TableStatistics.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xbreeze.xtest.process.informaticapowercenter.wsdl;

public class TableStatistics  implements java.io.Serializable {
    private java.lang.String widgetName;

    private java.lang.String widgetType;

    private java.lang.String widgetInstanceName;

    private int lastErrorCode;

    private java.lang.String lastErrorMessage;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate startTime;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate endTime;

    private int numAppliedRows;

    private int numAffectedRows;

    private int numRejectedRows;

    private int throughput;

    private java.lang.String partitionName;

    private java.lang.String groupName;

    public TableStatistics() {
    }

    public TableStatistics(
           java.lang.String widgetName,
           java.lang.String widgetType,
           java.lang.String widgetInstanceName,
           int lastErrorCode,
           java.lang.String lastErrorMessage,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate startTime,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate endTime,
           int numAppliedRows,
           int numAffectedRows,
           int numRejectedRows,
           int throughput,
           java.lang.String partitionName,
           java.lang.String groupName) {
           this.widgetName = widgetName;
           this.widgetType = widgetType;
           this.widgetInstanceName = widgetInstanceName;
           this.lastErrorCode = lastErrorCode;
           this.lastErrorMessage = lastErrorMessage;
           this.startTime = startTime;
           this.endTime = endTime;
           this.numAppliedRows = numAppliedRows;
           this.numAffectedRows = numAffectedRows;
           this.numRejectedRows = numRejectedRows;
           this.throughput = throughput;
           this.partitionName = partitionName;
           this.groupName = groupName;
    }


    /**
     * Gets the widgetName value for this TableStatistics.
     * 
     * @return widgetName
     */
    public java.lang.String getWidgetName() {
        return widgetName;
    }


    /**
     * Sets the widgetName value for this TableStatistics.
     * 
     * @param widgetName
     */
    public void setWidgetName(java.lang.String widgetName) {
        this.widgetName = widgetName;
    }


    /**
     * Gets the widgetType value for this TableStatistics.
     * 
     * @return widgetType
     */
    public java.lang.String getWidgetType() {
        return widgetType;
    }


    /**
     * Sets the widgetType value for this TableStatistics.
     * 
     * @param widgetType
     */
    public void setWidgetType(java.lang.String widgetType) {
        this.widgetType = widgetType;
    }


    /**
     * Gets the widgetInstanceName value for this TableStatistics.
     * 
     * @return widgetInstanceName
     */
    public java.lang.String getWidgetInstanceName() {
        return widgetInstanceName;
    }


    /**
     * Sets the widgetInstanceName value for this TableStatistics.
     * 
     * @param widgetInstanceName
     */
    public void setWidgetInstanceName(java.lang.String widgetInstanceName) {
        this.widgetInstanceName = widgetInstanceName;
    }


    /**
     * Gets the lastErrorCode value for this TableStatistics.
     * 
     * @return lastErrorCode
     */
    public int getLastErrorCode() {
        return lastErrorCode;
    }


    /**
     * Sets the lastErrorCode value for this TableStatistics.
     * 
     * @param lastErrorCode
     */
    public void setLastErrorCode(int lastErrorCode) {
        this.lastErrorCode = lastErrorCode;
    }


    /**
     * Gets the lastErrorMessage value for this TableStatistics.
     * 
     * @return lastErrorMessage
     */
    public java.lang.String getLastErrorMessage() {
        return lastErrorMessage;
    }


    /**
     * Sets the lastErrorMessage value for this TableStatistics.
     * 
     * @param lastErrorMessage
     */
    public void setLastErrorMessage(java.lang.String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
    }


    /**
     * Gets the startTime value for this TableStatistics.
     * 
     * @return startTime
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this TableStatistics.
     * 
     * @param startTime
     */
    public void setStartTime(com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this TableStatistics.
     * 
     * @return endTime
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this TableStatistics.
     * 
     * @param endTime
     */
    public void setEndTime(com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the numAppliedRows value for this TableStatistics.
     * 
     * @return numAppliedRows
     */
    public int getNumAppliedRows() {
        return numAppliedRows;
    }


    /**
     * Sets the numAppliedRows value for this TableStatistics.
     * 
     * @param numAppliedRows
     */
    public void setNumAppliedRows(int numAppliedRows) {
        this.numAppliedRows = numAppliedRows;
    }


    /**
     * Gets the numAffectedRows value for this TableStatistics.
     * 
     * @return numAffectedRows
     */
    public int getNumAffectedRows() {
        return numAffectedRows;
    }


    /**
     * Sets the numAffectedRows value for this TableStatistics.
     * 
     * @param numAffectedRows
     */
    public void setNumAffectedRows(int numAffectedRows) {
        this.numAffectedRows = numAffectedRows;
    }


    /**
     * Gets the numRejectedRows value for this TableStatistics.
     * 
     * @return numRejectedRows
     */
    public int getNumRejectedRows() {
        return numRejectedRows;
    }


    /**
     * Sets the numRejectedRows value for this TableStatistics.
     * 
     * @param numRejectedRows
     */
    public void setNumRejectedRows(int numRejectedRows) {
        this.numRejectedRows = numRejectedRows;
    }


    /**
     * Gets the throughput value for this TableStatistics.
     * 
     * @return throughput
     */
    public int getThroughput() {
        return throughput;
    }


    /**
     * Sets the throughput value for this TableStatistics.
     * 
     * @param throughput
     */
    public void setThroughput(int throughput) {
        this.throughput = throughput;
    }


    /**
     * Gets the partitionName value for this TableStatistics.
     * 
     * @return partitionName
     */
    public java.lang.String getPartitionName() {
        return partitionName;
    }


    /**
     * Sets the partitionName value for this TableStatistics.
     * 
     * @param partitionName
     */
    public void setPartitionName(java.lang.String partitionName) {
        this.partitionName = partitionName;
    }


    /**
     * Gets the groupName value for this TableStatistics.
     * 
     * @return groupName
     */
    public java.lang.String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this TableStatistics.
     * 
     * @param groupName
     */
    public void setGroupName(java.lang.String groupName) {
        this.groupName = groupName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TableStatistics)) return false;
        TableStatistics other = (TableStatistics) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.widgetName==null && other.getWidgetName()==null) || 
             (this.widgetName!=null &&
              this.widgetName.equals(other.getWidgetName()))) &&
            ((this.widgetType==null && other.getWidgetType()==null) || 
             (this.widgetType!=null &&
              this.widgetType.equals(other.getWidgetType()))) &&
            ((this.widgetInstanceName==null && other.getWidgetInstanceName()==null) || 
             (this.widgetInstanceName!=null &&
              this.widgetInstanceName.equals(other.getWidgetInstanceName()))) &&
            this.lastErrorCode == other.getLastErrorCode() &&
            ((this.lastErrorMessage==null && other.getLastErrorMessage()==null) || 
             (this.lastErrorMessage!=null &&
              this.lastErrorMessage.equals(other.getLastErrorMessage()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            this.numAppliedRows == other.getNumAppliedRows() &&
            this.numAffectedRows == other.getNumAffectedRows() &&
            this.numRejectedRows == other.getNumRejectedRows() &&
            this.throughput == other.getThroughput() &&
            ((this.partitionName==null && other.getPartitionName()==null) || 
             (this.partitionName!=null &&
              this.partitionName.equals(other.getPartitionName()))) &&
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName())));
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
        if (getWidgetName() != null) {
            _hashCode += getWidgetName().hashCode();
        }
        if (getWidgetType() != null) {
            _hashCode += getWidgetType().hashCode();
        }
        if (getWidgetInstanceName() != null) {
            _hashCode += getWidgetInstanceName().hashCode();
        }
        _hashCode += getLastErrorCode();
        if (getLastErrorMessage() != null) {
            _hashCode += getLastErrorMessage().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        _hashCode += getNumAppliedRows();
        _hashCode += getNumAffectedRows();
        _hashCode += getNumRejectedRows();
        _hashCode += getThroughput();
        if (getPartitionName() != null) {
            _hashCode += getPartitionName().hashCode();
        }
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TableStatistics.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "TableStatistics"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("widgetName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WidgetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("widgetType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WidgetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("widgetInstanceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WidgetInstanceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastErrorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastErrorMessage"));
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
        elemField.setFieldName("numAppliedRows");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumAppliedRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numAffectedRows");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumAffectedRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numRejectedRows");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumRejectedRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("throughput");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Throughput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitionName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PartitionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GroupName"));
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
