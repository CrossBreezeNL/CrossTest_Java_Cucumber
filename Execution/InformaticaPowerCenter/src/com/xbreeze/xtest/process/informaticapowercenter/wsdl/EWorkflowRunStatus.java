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
 * EWorkflowRunStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xbreeze.xtest.process.informaticapowercenter.wsdl;

public class EWorkflowRunStatus implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EWorkflowRunStatus(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _SUCCEEDED = new org.apache.axis.types.Token("SUCCEEDED");
    public static final org.apache.axis.types.Token _FAILED = new org.apache.axis.types.Token("FAILED");
    public static final org.apache.axis.types.Token _STOPPED = new org.apache.axis.types.Token("STOPPED");
    public static final org.apache.axis.types.Token _ABORTED = new org.apache.axis.types.Token("ABORTED");
    public static final org.apache.axis.types.Token _RUNNING = new org.apache.axis.types.Token("RUNNING");
    public static final org.apache.axis.types.Token _SUSPENDING = new org.apache.axis.types.Token("SUSPENDING");
    public static final org.apache.axis.types.Token _SUSPENDED = new org.apache.axis.types.Token("SUSPENDED");
    public static final org.apache.axis.types.Token _STOPPING = new org.apache.axis.types.Token("STOPPING");
    public static final org.apache.axis.types.Token _ABORTING = new org.apache.axis.types.Token("ABORTING");
    public static final org.apache.axis.types.Token _WAITING = new org.apache.axis.types.Token("WAITING");
    public static final org.apache.axis.types.Token _SCHEDULED = new org.apache.axis.types.Token("SCHEDULED");
    public static final org.apache.axis.types.Token _UNSCHEDULED = new org.apache.axis.types.Token("UNSCHEDULED");
    public static final org.apache.axis.types.Token _UNKNOWN = new org.apache.axis.types.Token("UNKNOWN");
    public static final org.apache.axis.types.Token _TERMINATED = new org.apache.axis.types.Token("TERMINATED");
    public static final EWorkflowRunStatus SUCCEEDED = new EWorkflowRunStatus(_SUCCEEDED);
    public static final EWorkflowRunStatus FAILED = new EWorkflowRunStatus(_FAILED);
    public static final EWorkflowRunStatus STOPPED = new EWorkflowRunStatus(_STOPPED);
    public static final EWorkflowRunStatus ABORTED = new EWorkflowRunStatus(_ABORTED);
    public static final EWorkflowRunStatus RUNNING = new EWorkflowRunStatus(_RUNNING);
    public static final EWorkflowRunStatus SUSPENDING = new EWorkflowRunStatus(_SUSPENDING);
    public static final EWorkflowRunStatus SUSPENDED = new EWorkflowRunStatus(_SUSPENDED);
    public static final EWorkflowRunStatus STOPPING = new EWorkflowRunStatus(_STOPPING);
    public static final EWorkflowRunStatus ABORTING = new EWorkflowRunStatus(_ABORTING);
    public static final EWorkflowRunStatus WAITING = new EWorkflowRunStatus(_WAITING);
    public static final EWorkflowRunStatus SCHEDULED = new EWorkflowRunStatus(_SCHEDULED);
    public static final EWorkflowRunStatus UNSCHEDULED = new EWorkflowRunStatus(_UNSCHEDULED);
    public static final EWorkflowRunStatus UNKNOWN = new EWorkflowRunStatus(_UNKNOWN);
    public static final EWorkflowRunStatus TERMINATED = new EWorkflowRunStatus(_TERMINATED);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static EWorkflowRunStatus fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        EWorkflowRunStatus enumeration = (EWorkflowRunStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EWorkflowRunStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EWorkflowRunStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "EWorkflowRunStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
