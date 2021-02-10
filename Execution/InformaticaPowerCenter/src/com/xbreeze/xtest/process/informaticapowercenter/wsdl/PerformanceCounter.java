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
 * PerformanceCounter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xbreeze.xtest.process.informaticapowercenter.wsdl;

public class PerformanceCounter  implements java.io.Serializable {
    private java.lang.String counterName;

    private int counterValue;

    private java.lang.String widgetName;

    private java.lang.String counterStringValue;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.EPerformanceCounterType counterType;

    public PerformanceCounter() {
    }

    public PerformanceCounter(
           java.lang.String counterName,
           int counterValue,
           java.lang.String widgetName,
           java.lang.String counterStringValue,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.EPerformanceCounterType counterType) {
           this.counterName = counterName;
           this.counterValue = counterValue;
           this.widgetName = widgetName;
           this.counterStringValue = counterStringValue;
           this.counterType = counterType;
    }


    /**
     * Gets the counterName value for this PerformanceCounter.
     * 
     * @return counterName
     */
    public java.lang.String getCounterName() {
        return counterName;
    }


    /**
     * Sets the counterName value for this PerformanceCounter.
     * 
     * @param counterName
     */
    public void setCounterName(java.lang.String counterName) {
        this.counterName = counterName;
    }


    /**
     * Gets the counterValue value for this PerformanceCounter.
     * 
     * @return counterValue
     */
    public int getCounterValue() {
        return counterValue;
    }


    /**
     * Sets the counterValue value for this PerformanceCounter.
     * 
     * @param counterValue
     */
    public void setCounterValue(int counterValue) {
        this.counterValue = counterValue;
    }


    /**
     * Gets the widgetName value for this PerformanceCounter.
     * 
     * @return widgetName
     */
    public java.lang.String getWidgetName() {
        return widgetName;
    }


    /**
     * Sets the widgetName value for this PerformanceCounter.
     * 
     * @param widgetName
     */
    public void setWidgetName(java.lang.String widgetName) {
        this.widgetName = widgetName;
    }


    /**
     * Gets the counterStringValue value for this PerformanceCounter.
     * 
     * @return counterStringValue
     */
    public java.lang.String getCounterStringValue() {
        return counterStringValue;
    }


    /**
     * Sets the counterStringValue value for this PerformanceCounter.
     * 
     * @param counterStringValue
     */
    public void setCounterStringValue(java.lang.String counterStringValue) {
        this.counterStringValue = counterStringValue;
    }


    /**
     * Gets the counterType value for this PerformanceCounter.
     * 
     * @return counterType
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.EPerformanceCounterType getCounterType() {
        return counterType;
    }


    /**
     * Sets the counterType value for this PerformanceCounter.
     * 
     * @param counterType
     */
    public void setCounterType(com.xbreeze.xtest.process.informaticapowercenter.wsdl.EPerformanceCounterType counterType) {
        this.counterType = counterType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformanceCounter)) return false;
        PerformanceCounter other = (PerformanceCounter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.counterName==null && other.getCounterName()==null) || 
             (this.counterName!=null &&
              this.counterName.equals(other.getCounterName()))) &&
            this.counterValue == other.getCounterValue() &&
            ((this.widgetName==null && other.getWidgetName()==null) || 
             (this.widgetName!=null &&
              this.widgetName.equals(other.getWidgetName()))) &&
            ((this.counterStringValue==null && other.getCounterStringValue()==null) || 
             (this.counterStringValue!=null &&
              this.counterStringValue.equals(other.getCounterStringValue()))) &&
            ((this.counterType==null && other.getCounterType()==null) || 
             (this.counterType!=null &&
              this.counterType.equals(other.getCounterType())));
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
        if (getCounterName() != null) {
            _hashCode += getCounterName().hashCode();
        }
        _hashCode += getCounterValue();
        if (getWidgetName() != null) {
            _hashCode += getWidgetName().hashCode();
        }
        if (getCounterStringValue() != null) {
            _hashCode += getCounterStringValue().hashCode();
        }
        if (getCounterType() != null) {
            _hashCode += getCounterType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerformanceCounter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "PerformanceCounter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("counterName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CounterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("counterValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CounterValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("widgetName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WidgetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("counterStringValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CounterStringValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("counterType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CounterType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "EPerformanceCounterType"));
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
