/**
 * WUResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.soap.wsworkunits;

public class WUResult  implements java.io.Serializable {
    private java.lang.String wuid;

    private java.lang.Integer sequence;

    private java.lang.String resultName;

    private java.lang.String logicalName;

    private java.lang.String cluster;

    private java.lang.Boolean suppressXmlSchema;

    private java.lang.Long start;

    private java.lang.Integer count;

    public WUResult() {
    }

    public WUResult(
           java.lang.String wuid,
           java.lang.Integer sequence,
           java.lang.String resultName,
           java.lang.String logicalName,
           java.lang.String cluster,
           java.lang.Boolean suppressXmlSchema,
           java.lang.Long start,
           java.lang.Integer count) {
           this.wuid = wuid;
           this.sequence = sequence;
           this.resultName = resultName;
           this.logicalName = logicalName;
           this.cluster = cluster;
           this.suppressXmlSchema = suppressXmlSchema;
           this.start = start;
           this.count = count;
    }


    /**
     * Gets the wuid value for this WUResult.
     * 
     * @return wuid
     */
    public java.lang.String getWuid() {
        return wuid;
    }


    /**
     * Sets the wuid value for this WUResult.
     * 
     * @param wuid
     */
    public void setWuid(java.lang.String wuid) {
        this.wuid = wuid;
    }


    /**
     * Gets the sequence value for this WUResult.
     * 
     * @return sequence
     */
    public java.lang.Integer getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this WUResult.
     * 
     * @param sequence
     */
    public void setSequence(java.lang.Integer sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the resultName value for this WUResult.
     * 
     * @return resultName
     */
    public java.lang.String getResultName() {
        return resultName;
    }


    /**
     * Sets the resultName value for this WUResult.
     * 
     * @param resultName
     */
    public void setResultName(java.lang.String resultName) {
        this.resultName = resultName;
    }


    /**
     * Gets the logicalName value for this WUResult.
     * 
     * @return logicalName
     */
    public java.lang.String getLogicalName() {
        return logicalName;
    }


    /**
     * Sets the logicalName value for this WUResult.
     * 
     * @param logicalName
     */
    public void setLogicalName(java.lang.String logicalName) {
        this.logicalName = logicalName;
    }


    /**
     * Gets the cluster value for this WUResult.
     * 
     * @return cluster
     */
    public java.lang.String getCluster() {
        return cluster;
    }


    /**
     * Sets the cluster value for this WUResult.
     * 
     * @param cluster
     */
    public void setCluster(java.lang.String cluster) {
        this.cluster = cluster;
    }


    /**
     * Gets the suppressXmlSchema value for this WUResult.
     * 
     * @return suppressXmlSchema
     */
    public java.lang.Boolean getSuppressXmlSchema() {
        return suppressXmlSchema;
    }


    /**
     * Sets the suppressXmlSchema value for this WUResult.
     * 
     * @param suppressXmlSchema
     */
    public void setSuppressXmlSchema(java.lang.Boolean suppressXmlSchema) {
        this.suppressXmlSchema = suppressXmlSchema;
    }


    /**
     * Gets the start value for this WUResult.
     * 
     * @return start
     */
    public java.lang.Long getStart() {
        return start;
    }


    /**
     * Sets the start value for this WUResult.
     * 
     * @param start
     */
    public void setStart(java.lang.Long start) {
        this.start = start;
    }


    /**
     * Gets the count value for this WUResult.
     * 
     * @return count
     */
    public java.lang.Integer getCount() {
        return count;
    }


    /**
     * Sets the count value for this WUResult.
     * 
     * @param count
     */
    public void setCount(java.lang.Integer count) {
        this.count = count;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUResult)) return false;
        WUResult other = (WUResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wuid==null && other.getWuid()==null) || 
             (this.wuid!=null &&
              this.wuid.equals(other.getWuid()))) &&
            ((this.sequence==null && other.getSequence()==null) || 
             (this.sequence!=null &&
              this.sequence.equals(other.getSequence()))) &&
            ((this.resultName==null && other.getResultName()==null) || 
             (this.resultName!=null &&
              this.resultName.equals(other.getResultName()))) &&
            ((this.logicalName==null && other.getLogicalName()==null) || 
             (this.logicalName!=null &&
              this.logicalName.equals(other.getLogicalName()))) &&
            ((this.cluster==null && other.getCluster()==null) || 
             (this.cluster!=null &&
              this.cluster.equals(other.getCluster()))) &&
            ((this.suppressXmlSchema==null && other.getSuppressXmlSchema()==null) || 
             (this.suppressXmlSchema!=null &&
              this.suppressXmlSchema.equals(other.getSuppressXmlSchema()))) &&
            ((this.start==null && other.getStart()==null) || 
             (this.start!=null &&
              this.start.equals(other.getStart()))) &&
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount())));
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
        if (getWuid() != null) {
            _hashCode += getWuid().hashCode();
        }
        if (getSequence() != null) {
            _hashCode += getSequence().hashCode();
        }
        if (getResultName() != null) {
            _hashCode += getResultName().hashCode();
        }
        if (getLogicalName() != null) {
            _hashCode += getLogicalName().hashCode();
        }
        if (getCluster() != null) {
            _hashCode += getCluster().hashCode();
        }
        if (getSuppressXmlSchema() != null) {
            _hashCode += getSuppressXmlSchema().hashCode();
        }
        if (getStart() != null) {
            _hashCode += getStart().hashCode();
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ResultName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logicalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogicalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Cluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suppressXmlSchema");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SuppressXmlSchema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
