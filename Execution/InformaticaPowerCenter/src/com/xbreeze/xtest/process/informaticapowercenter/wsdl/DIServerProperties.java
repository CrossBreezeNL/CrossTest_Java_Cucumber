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
 * DIServerProperties.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xbreeze.xtest.process.informaticapowercenter.wsdl;

public class DIServerProperties  implements java.io.Serializable {
    private java.lang.String DIServerName;

    private java.lang.String repositoryname;

    private boolean canInfaServerDebugMapping;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.EDIServerMode DIServerMode;

    private java.lang.String DIServerVersion;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate currentTime;

    private com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate startupTime;

    private java.lang.String productName;

    public DIServerProperties() {
    }

    public DIServerProperties(
           java.lang.String DIServerName,
           java.lang.String repositoryname,
           boolean canInfaServerDebugMapping,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.EDIServerMode DIServerMode,
           java.lang.String DIServerVersion,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate currentTime,
           com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate startupTime,
           java.lang.String productName) {
           this.DIServerName = DIServerName;
           this.repositoryname = repositoryname;
           this.canInfaServerDebugMapping = canInfaServerDebugMapping;
           this.DIServerMode = DIServerMode;
           this.DIServerVersion = DIServerVersion;
           this.currentTime = currentTime;
           this.startupTime = startupTime;
           this.productName = productName;
    }


    /**
     * Gets the DIServerName value for this DIServerProperties.
     * 
     * @return DIServerName
     */
    public java.lang.String getDIServerName() {
        return DIServerName;
    }


    /**
     * Sets the DIServerName value for this DIServerProperties.
     * 
     * @param DIServerName
     */
    public void setDIServerName(java.lang.String DIServerName) {
        this.DIServerName = DIServerName;
    }


    /**
     * Gets the repositoryname value for this DIServerProperties.
     * 
     * @return repositoryname
     */
    public java.lang.String getRepositoryname() {
        return repositoryname;
    }


    /**
     * Sets the repositoryname value for this DIServerProperties.
     * 
     * @param repositoryname
     */
    public void setRepositoryname(java.lang.String repositoryname) {
        this.repositoryname = repositoryname;
    }


    /**
     * Gets the canInfaServerDebugMapping value for this DIServerProperties.
     * 
     * @return canInfaServerDebugMapping
     */
    public boolean isCanInfaServerDebugMapping() {
        return canInfaServerDebugMapping;
    }


    /**
     * Sets the canInfaServerDebugMapping value for this DIServerProperties.
     * 
     * @param canInfaServerDebugMapping
     */
    public void setCanInfaServerDebugMapping(boolean canInfaServerDebugMapping) {
        this.canInfaServerDebugMapping = canInfaServerDebugMapping;
    }


    /**
     * Gets the DIServerMode value for this DIServerProperties.
     * 
     * @return DIServerMode
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.EDIServerMode getDIServerMode() {
        return DIServerMode;
    }


    /**
     * Sets the DIServerMode value for this DIServerProperties.
     * 
     * @param DIServerMode
     */
    public void setDIServerMode(com.xbreeze.xtest.process.informaticapowercenter.wsdl.EDIServerMode DIServerMode) {
        this.DIServerMode = DIServerMode;
    }


    /**
     * Gets the DIServerVersion value for this DIServerProperties.
     * 
     * @return DIServerVersion
     */
    public java.lang.String getDIServerVersion() {
        return DIServerVersion;
    }


    /**
     * Sets the DIServerVersion value for this DIServerProperties.
     * 
     * @param DIServerVersion
     */
    public void setDIServerVersion(java.lang.String DIServerVersion) {
        this.DIServerVersion = DIServerVersion;
    }


    /**
     * Gets the currentTime value for this DIServerProperties.
     * 
     * @return currentTime
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate getCurrentTime() {
        return currentTime;
    }


    /**
     * Sets the currentTime value for this DIServerProperties.
     * 
     * @param currentTime
     */
    public void setCurrentTime(com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate currentTime) {
        this.currentTime = currentTime;
    }


    /**
     * Gets the startupTime value for this DIServerProperties.
     * 
     * @return startupTime
     */
    public com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate getStartupTime() {
        return startupTime;
    }


    /**
     * Sets the startupTime value for this DIServerProperties.
     * 
     * @param startupTime
     */
    public void setStartupTime(com.xbreeze.xtest.process.informaticapowercenter.wsdl.DIServerDate startupTime) {
        this.startupTime = startupTime;
    }


    /**
     * Gets the productName value for this DIServerProperties.
     * 
     * @return productName
     */
    public java.lang.String getProductName() {
        return productName;
    }


    /**
     * Sets the productName value for this DIServerProperties.
     * 
     * @param productName
     */
    public void setProductName(java.lang.String productName) {
        this.productName = productName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DIServerProperties)) return false;
        DIServerProperties other = (DIServerProperties) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DIServerName==null && other.getDIServerName()==null) || 
             (this.DIServerName!=null &&
              this.DIServerName.equals(other.getDIServerName()))) &&
            ((this.repositoryname==null && other.getRepositoryname()==null) || 
             (this.repositoryname!=null &&
              this.repositoryname.equals(other.getRepositoryname()))) &&
            this.canInfaServerDebugMapping == other.isCanInfaServerDebugMapping() &&
            ((this.DIServerMode==null && other.getDIServerMode()==null) || 
             (this.DIServerMode!=null &&
              this.DIServerMode.equals(other.getDIServerMode()))) &&
            ((this.DIServerVersion==null && other.getDIServerVersion()==null) || 
             (this.DIServerVersion!=null &&
              this.DIServerVersion.equals(other.getDIServerVersion()))) &&
            ((this.currentTime==null && other.getCurrentTime()==null) || 
             (this.currentTime!=null &&
              this.currentTime.equals(other.getCurrentTime()))) &&
            ((this.startupTime==null && other.getStartupTime()==null) || 
             (this.startupTime!=null &&
              this.startupTime.equals(other.getStartupTime()))) &&
            ((this.productName==null && other.getProductName()==null) || 
             (this.productName!=null &&
              this.productName.equals(other.getProductName())));
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
        if (getDIServerName() != null) {
            _hashCode += getDIServerName().hashCode();
        }
        if (getRepositoryname() != null) {
            _hashCode += getRepositoryname().hashCode();
        }
        _hashCode += (isCanInfaServerDebugMapping() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDIServerMode() != null) {
            _hashCode += getDIServerMode().hashCode();
        }
        if (getDIServerVersion() != null) {
            _hashCode += getDIServerVersion().hashCode();
        }
        if (getCurrentTime() != null) {
            _hashCode += getCurrentTime().hashCode();
        }
        if (getStartupTime() != null) {
            _hashCode += getStartupTime().hashCode();
        }
        if (getProductName() != null) {
            _hashCode += getProductName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DIServerProperties.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "DIServerProperties"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DIServerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DIServerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repositoryname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Repositoryname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canInfaServerDebugMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CanInfaServerDebugMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DIServerMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DIServerMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.informatica.com/wsh", "EDIServerMode"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DIServerVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DIServerVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("productName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProductName"));
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
