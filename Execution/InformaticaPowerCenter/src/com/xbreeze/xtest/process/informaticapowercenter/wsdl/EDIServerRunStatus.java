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
 * EDIServerRunStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xbreeze.xtest.process.informaticapowercenter.wsdl;

public class EDIServerRunStatus implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EDIServerRunStatus(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _INITIALIZING = new org.apache.axis.types.Token("INITIALIZING");
    public static final org.apache.axis.types.Token _RUNNING = new org.apache.axis.types.Token("RUNNING");
    public static final org.apache.axis.types.Token _SHUTTING_DOWN = new org.apache.axis.types.Token("SHUTTING_DOWN");
    public static final org.apache.axis.types.Token _STOPPING = new org.apache.axis.types.Token("STOPPING");
    public static final org.apache.axis.types.Token _ABORTING = new org.apache.axis.types.Token("ABORTING");
    public static final EDIServerRunStatus INITIALIZING = new EDIServerRunStatus(_INITIALIZING);
    public static final EDIServerRunStatus RUNNING = new EDIServerRunStatus(_RUNNING);
    public static final EDIServerRunStatus SHUTTING_DOWN = new EDIServerRunStatus(_SHUTTING_DOWN);
    public static final EDIServerRunStatus STOPPING = new EDIServerRunStatus(_STOPPING);
    public static final EDIServerRunStatus ABORTING = new EDIServerRunStatus(_ABORTING);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static EDIServerRunStatus fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        EDIServerRunStatus enumeration = (EDIServerRunStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EDIServerRunStatus fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(new org.apache.axis.types.Token(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_.toString();}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EDIServerRunStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "EDIServerRunStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
