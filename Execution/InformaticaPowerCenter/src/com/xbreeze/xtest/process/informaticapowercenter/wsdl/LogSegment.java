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
 * LogSegment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xbreeze.xtest.process.informaticapowercenter.wsdl;

public class LogSegment  implements java.io.Serializable {
    private int fileSize;

    private java.lang.String buffer;

    private boolean endOfLog;

    private int codePage;

    private int bufferSize;

    public LogSegment() {
    }

    public LogSegment(
           int fileSize,
           java.lang.String buffer,
           boolean endOfLog,
           int codePage,
           int bufferSize) {
           this.fileSize = fileSize;
           this.buffer = buffer;
           this.endOfLog = endOfLog;
           this.codePage = codePage;
           this.bufferSize = bufferSize;
    }


    /**
     * Gets the fileSize value for this LogSegment.
     * 
     * @return fileSize
     */
    public int getFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this LogSegment.
     * 
     * @param fileSize
     */
    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * Gets the buffer value for this LogSegment.
     * 
     * @return buffer
     */
    public java.lang.String getBuffer() {
        return buffer;
    }


    /**
     * Sets the buffer value for this LogSegment.
     * 
     * @param buffer
     */
    public void setBuffer(java.lang.String buffer) {
        this.buffer = buffer;
    }


    /**
     * Gets the endOfLog value for this LogSegment.
     * 
     * @return endOfLog
     */
    public boolean isEndOfLog() {
        return endOfLog;
    }


    /**
     * Sets the endOfLog value for this LogSegment.
     * 
     * @param endOfLog
     */
    public void setEndOfLog(boolean endOfLog) {
        this.endOfLog = endOfLog;
    }


    /**
     * Gets the codePage value for this LogSegment.
     * 
     * @return codePage
     */
    public int getCodePage() {
        return codePage;
    }


    /**
     * Sets the codePage value for this LogSegment.
     * 
     * @param codePage
     */
    public void setCodePage(int codePage) {
        this.codePage = codePage;
    }


    /**
     * Gets the bufferSize value for this LogSegment.
     * 
     * @return bufferSize
     */
    public int getBufferSize() {
        return bufferSize;
    }


    /**
     * Sets the bufferSize value for this LogSegment.
     * 
     * @param bufferSize
     */
    public void setBufferSize(int bufferSize) {
        this.bufferSize = bufferSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LogSegment)) return false;
        LogSegment other = (LogSegment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.fileSize == other.getFileSize() &&
            ((this.buffer==null && other.getBuffer()==null) || 
             (this.buffer!=null &&
              this.buffer.equals(other.getBuffer()))) &&
            this.endOfLog == other.isEndOfLog() &&
            this.codePage == other.getCodePage() &&
            this.bufferSize == other.getBufferSize();
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
        _hashCode += getFileSize();
        if (getBuffer() != null) {
            _hashCode += getBuffer().hashCode();
        }
        _hashCode += (isEndOfLog() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getCodePage();
        _hashCode += getBufferSize();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LogSegment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "LogSegment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buffer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Buffer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endOfLog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EndOfLog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codePage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CodePage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bufferSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BufferSize"));
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
