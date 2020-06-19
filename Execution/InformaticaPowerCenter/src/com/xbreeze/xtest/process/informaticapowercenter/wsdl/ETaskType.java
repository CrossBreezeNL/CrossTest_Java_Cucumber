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
 * ETaskType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xbreeze.xtest.process.informaticapowercenter.wsdl;

public class ETaskType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ETaskType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _COMMAND_TASK = new org.apache.axis.types.Token("COMMAND_TASK");
    public static final org.apache.axis.types.Token _DECISION_TASK = new org.apache.axis.types.Token("DECISION_TASK");
    public static final org.apache.axis.types.Token _EVENTWAIT_TASK = new org.apache.axis.types.Token("EVENTWAIT_TASK");
    public static final org.apache.axis.types.Token _EVENTRAISE_TASK = new org.apache.axis.types.Token("EVENTRAISE_TASK");
    public static final org.apache.axis.types.Token _STARTWORKFLOW_TASK = new org.apache.axis.types.Token("STARTWORKFLOW_TASK");
    public static final org.apache.axis.types.Token _ABORTWORKFLOW_TASK = new org.apache.axis.types.Token("ABORTWORKFLOW_TASK");
    public static final org.apache.axis.types.Token _STOPWORKFLOW_TASK = new org.apache.axis.types.Token("STOPWORKFLOW_TASK");
    public static final org.apache.axis.types.Token _EMAIL_TASK = new org.apache.axis.types.Token("EMAIL_TASK");
    public static final org.apache.axis.types.Token _TIMER_TASK = new org.apache.axis.types.Token("TIMER_TASK");
    public static final org.apache.axis.types.Token _ASSIGNMENT_TASK = new org.apache.axis.types.Token("ASSIGNMENT_TASK");
    public static final org.apache.axis.types.Token _SESSION_TASK = new org.apache.axis.types.Token("SESSION_TASK");
    public static final org.apache.axis.types.Token _WORKLET_TASK = new org.apache.axis.types.Token("WORKLET_TASK");
    public static final ETaskType COMMAND_TASK = new ETaskType(_COMMAND_TASK);
    public static final ETaskType DECISION_TASK = new ETaskType(_DECISION_TASK);
    public static final ETaskType EVENTWAIT_TASK = new ETaskType(_EVENTWAIT_TASK);
    public static final ETaskType EVENTRAISE_TASK = new ETaskType(_EVENTRAISE_TASK);
    public static final ETaskType STARTWORKFLOW_TASK = new ETaskType(_STARTWORKFLOW_TASK);
    public static final ETaskType ABORTWORKFLOW_TASK = new ETaskType(_ABORTWORKFLOW_TASK);
    public static final ETaskType STOPWORKFLOW_TASK = new ETaskType(_STOPWORKFLOW_TASK);
    public static final ETaskType EMAIL_TASK = new ETaskType(_EMAIL_TASK);
    public static final ETaskType TIMER_TASK = new ETaskType(_TIMER_TASK);
    public static final ETaskType ASSIGNMENT_TASK = new ETaskType(_ASSIGNMENT_TASK);
    public static final ETaskType SESSION_TASK = new ETaskType(_SESSION_TASK);
    public static final ETaskType WORKLET_TASK = new ETaskType(_WORKLET_TASK);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static ETaskType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        ETaskType enumeration = (ETaskType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ETaskType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ETaskType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "ETaskType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
