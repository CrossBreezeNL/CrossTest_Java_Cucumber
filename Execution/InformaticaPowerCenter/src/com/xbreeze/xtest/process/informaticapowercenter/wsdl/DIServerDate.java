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
 * DIServerDate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xbreeze.xtest.process.informaticapowercenter.wsdl;

public class DIServerDate  implements java.io.Serializable {
    private int date;

    private int nanoSeconds;

    private int seconds;

    private int minutes;

    private int hours;

    private int month;

    private int year;

    private int UTCTime;

    public DIServerDate() {
    }

    public DIServerDate(
           int date,
           int nanoSeconds,
           int seconds,
           int minutes,
           int hours,
           int month,
           int year,
           int UTCTime) {
           this.date = date;
           this.nanoSeconds = nanoSeconds;
           this.seconds = seconds;
           this.minutes = minutes;
           this.hours = hours;
           this.month = month;
           this.year = year;
           this.UTCTime = UTCTime;
    }


    /**
     * Gets the date value for this DIServerDate.
     * 
     * @return date
     */
    public int getDate() {
        return date;
    }


    /**
     * Sets the date value for this DIServerDate.
     * 
     * @param date
     */
    public void setDate(int date) {
        this.date = date;
    }


    /**
     * Gets the nanoSeconds value for this DIServerDate.
     * 
     * @return nanoSeconds
     */
    public int getNanoSeconds() {
        return nanoSeconds;
    }


    /**
     * Sets the nanoSeconds value for this DIServerDate.
     * 
     * @param nanoSeconds
     */
    public void setNanoSeconds(int nanoSeconds) {
        this.nanoSeconds = nanoSeconds;
    }


    /**
     * Gets the seconds value for this DIServerDate.
     * 
     * @return seconds
     */
    public int getSeconds() {
        return seconds;
    }


    /**
     * Sets the seconds value for this DIServerDate.
     * 
     * @param seconds
     */
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }


    /**
     * Gets the minutes value for this DIServerDate.
     * 
     * @return minutes
     */
    public int getMinutes() {
        return minutes;
    }


    /**
     * Sets the minutes value for this DIServerDate.
     * 
     * @param minutes
     */
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }


    /**
     * Gets the hours value for this DIServerDate.
     * 
     * @return hours
     */
    public int getHours() {
        return hours;
    }


    /**
     * Sets the hours value for this DIServerDate.
     * 
     * @param hours
     */
    public void setHours(int hours) {
        this.hours = hours;
    }


    /**
     * Gets the month value for this DIServerDate.
     * 
     * @return month
     */
    public int getMonth() {
        return month;
    }


    /**
     * Sets the month value for this DIServerDate.
     * 
     * @param month
     */
    public void setMonth(int month) {
        this.month = month;
    }


    /**
     * Gets the year value for this DIServerDate.
     * 
     * @return year
     */
    public int getYear() {
        return year;
    }


    /**
     * Sets the year value for this DIServerDate.
     * 
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }


    /**
     * Gets the UTCTime value for this DIServerDate.
     * 
     * @return UTCTime
     */
    public int getUTCTime() {
        return UTCTime;
    }


    /**
     * Sets the UTCTime value for this DIServerDate.
     * 
     * @param UTCTime
     */
    public void setUTCTime(int UTCTime) {
        this.UTCTime = UTCTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DIServerDate)) return false;
        DIServerDate other = (DIServerDate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.date == other.getDate() &&
            this.nanoSeconds == other.getNanoSeconds() &&
            this.seconds == other.getSeconds() &&
            this.minutes == other.getMinutes() &&
            this.hours == other.getHours() &&
            this.month == other.getMonth() &&
            this.year == other.getYear() &&
            this.UTCTime == other.getUTCTime();
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
        _hashCode += getDate();
        _hashCode += getNanoSeconds();
        _hashCode += getSeconds();
        _hashCode += getMinutes();
        _hashCode += getHours();
        _hashCode += getMonth();
        _hashCode += getYear();
        _hashCode += getUTCTime();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DIServerDate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "DIServerDate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nanoSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NanoSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seconds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Seconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minutes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Minutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Hours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("month");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Month"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UTCTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UTCTime"));
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
