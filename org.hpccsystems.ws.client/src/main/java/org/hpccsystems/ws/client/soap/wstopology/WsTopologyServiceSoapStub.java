/**
 * WsTopologyServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.soap.wstopology;

public class WsTopologyServiceSoapStub extends org.apache.axis.client.Stub implements org.hpccsystems.ws.client.soap.wstopology.WsTopologyServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[16];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SystemLog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "SystemLogRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">SystemLogRequest"), org.hpccsystems.ws.client.soap.wstopology.SystemLogRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">SystemLogResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.wstopology.SystemLogResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "SystemLogResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TpClusterInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpClusterInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpClusterInfoRequest"), org.hpccsystems.ws.client.soap.wstopology.TpClusterInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpClusterInfoResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.wstopology.TpClusterInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpClusterInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TpClusterQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpClusterQueryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpClusterQueryRequest"), org.hpccsystems.ws.client.soap.wstopology.TpClusterQueryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpClusterQueryResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.wstopology.TpClusterQueryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpClusterQueryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TpGetComponentFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpGetComponentFileRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpGetComponentFileRequest"), org.hpccsystems.ws.client.soap.wstopology.TpGetComponentFileRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpGetComponentFileResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.wstopology.TpGetComponentFileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpGetComponentFileResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TpGroupQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpGroupQueryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpGroupQueryRequest"), org.hpccsystems.ws.client.soap.wstopology.TpGroupQueryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpGroupQueryResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.wstopology.TpGroupQueryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpGroupQueryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TpListTargetClusters");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpListTargetClustersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpListTargetClustersRequest"), org.hpccsystems.ws.client.soap.wstopology.TpListTargetClustersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpListTargetClustersResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.wstopology.TpListTargetClustersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpListTargetClustersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TpLogFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpLogFileRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpLogFileRequest"), org.hpccsystems.ws.client.soap.wstopology.TpLogFileRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpLogFileResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.wstopology.TpLogFileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpLogFileResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TpLogFileDisplay");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpLogFileRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpLogFileRequest"), org.hpccsystems.ws.client.soap.wstopology.TpLogFileRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpLogFileResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.wstopology.TpLogFileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpLogFileResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TpLogicalClusterQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpLogicalClusterQueryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpLogicalClusterQueryRequest"), org.hpccsystems.ws.client.soap.wstopology.TpLogicalClusterQueryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpLogicalClusterQueryResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.wstopology.TpLogicalClusterQueryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpLogicalClusterQueryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TpMachineQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpMachineQueryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpMachineQueryRequest"), org.hpccsystems.ws.client.soap.wstopology.TpMachineQueryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpMachineQueryResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.wstopology.TpMachineQueryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpMachineQueryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TpServiceQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpServiceQueryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpServiceQueryRequest"), org.hpccsystems.ws.client.soap.wstopology.TpServiceQueryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpServiceQueryResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.wstopology.TpServiceQueryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpServiceQueryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TpSetMachineStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpSetMachineStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpSetMachineStatusRequest"), org.hpccsystems.ws.client.soap.wstopology.TpSetMachineStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpSetMachineStatusResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.wstopology.TpSetMachineStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpSetMachineStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TpSwapNode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpSwapNodeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpSwapNodeRequest"), org.hpccsystems.ws.client.soap.wstopology.TpSwapNodeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpSwapNodeResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.wstopology.TpSwapNodeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpSwapNodeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TpTargetClusterQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpTargetClusterQueryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpTargetClusterQueryRequest"), org.hpccsystems.ws.client.soap.wstopology.TpTargetClusterQueryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpTargetClusterQueryResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.wstopology.TpTargetClusterQueryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpTargetClusterQueryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TpThorStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpThorStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpThorStatusRequest"), org.hpccsystems.ws.client.soap.wstopology.TpThorStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpThorStatusResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.wstopology.TpThorStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpThorStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TpXMLFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpXMLFileRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpXMLFileRequest"), org.hpccsystems.ws.client.soap.wstopology.TpXMLFileRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpXMLFileResponse"));
        oper.setReturnClass(org.hpccsystems.ws.client.soap.wstopology.TpXMLFileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpXMLFileResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
                      "org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"), 
                      true
                     ));
        _operations[15] = oper;

    }

    public WsTopologyServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WsTopologyServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WsTopologyServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">SystemLogRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.SystemLogRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">SystemLogResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.SystemLogResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpClusterInfoRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpClusterInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpClusterInfoResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpClusterInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpClusterQueryRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpClusterQueryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpClusterQueryResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpClusterQueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpGetComponentFileRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpGetComponentFileRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpGetComponentFileResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpGetComponentFileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpGroupQueryRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpGroupQueryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpGroupQueryResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpGroupQueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpListTargetClustersRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpListTargetClustersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpListTargetClustersResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpListTargetClustersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpLogFileRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpLogFileRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpLogFileResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpLogFileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpLogicalClusterQueryRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpLogicalClusterQueryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpLogicalClusterQueryResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpLogicalClusterQueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpMachineQueryRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpMachineQueryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpMachineQueryResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpMachineQueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpServiceQueryRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpServiceQueryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpServiceQueryResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpServiceQueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpSetMachineStatusRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpSetMachineStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpSetMachineStatusResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpSetMachineStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpSwapNodeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpSwapNodeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpSwapNodeResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpSwapNodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpTargetClusterQueryRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpTargetClusterQueryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpTargetClusterQueryResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpTargetClusterQueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpThorStatusRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpThorStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpThorStatusResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpThorStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpXMLFileRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpXMLFileRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpXMLFileResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpXMLFileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfTpBinding");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpBinding[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpBinding");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpBinding");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfTpCluster");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpCluster[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpCluster");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpCluster");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfTpClusterNameType");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpClusterNameType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpClusterNameType");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpClusterNameType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfTpDali");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpDali[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpDali");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpDali");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfTpDfuServer");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpDfuServer[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpDfuServer");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpDfuServer");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfTpDkcSlave");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpDkcSlave[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpDkcSlave");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpDkcSlave");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfTpDropZone");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpDropZone[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpDropZone");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpDropZone");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfTpEclAgent");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpEclAgent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclAgent");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclAgent");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfTpEclScheduler");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpEclScheduler[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclScheduler");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclScheduler");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfTpEclServer");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpEclServer[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclServer");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclServer");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfTpEspServer");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpEspServer[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEspServer");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEspServer");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfTpFTSlave");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpFTSlave[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpFTSlave");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpFTSlave");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfTpGenesisServer");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpGenesisServer[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpGenesisServer");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpGenesisServer");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfTpGroup");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpGroup[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpGroup");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfTpLdapServer");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpLdapServer[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpLdapServer");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpLdapServer");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfTpLogicalCluster");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpLogicalCluster[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpLogicalCluster");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpLogicalCluster");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfTpMachine");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpMachine[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpMachine");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpMachine");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfTpMySqlServer");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpMySqlServer[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpMySqlServer");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpMySqlServer");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfTpQueue");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpQueue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpQueue");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpQueue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfTpSashaServer");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpSashaServer[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpSashaServer");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpSashaServer");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfTpTargetCluster");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpTargetCluster[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpTargetCluster");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpTargetCluster");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "EspException");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.EspException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpBinding");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpBinding.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpCluster");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpCluster.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpClusterNameType");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpClusterNameType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpDali");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpDali.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpDfuServer");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpDfuServer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpDkcSlave");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpDkcSlave.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpDropZone");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpDropZone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclAgent");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpEclAgent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclScheduler");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpEclScheduler.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclServer");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpEclServer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEspServer");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpEspServer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpFTSlave");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpFTSlave.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpGenesisServer");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpGenesisServer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpGroup");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpLdapServer");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpLdapServer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpLogicalCluster");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpLogicalCluster.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpMachine");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpMachine.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpMySqlServer");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpMySqlServer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpQueue");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpQueue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpSashaServer");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpSashaServer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpServices");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpServices.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpTargetCluster");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.client.soap.wstopology.TpTargetCluster.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public org.hpccsystems.ws.client.soap.wstopology.SystemLogResponse systemLog(org.hpccsystems.ws.client.soap.wstopology.SystemLogRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsTopology/SystemLog?ver_=1.19");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SystemLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.wstopology.SystemLogResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.wstopology.SystemLogResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.wstopology.SystemLogResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.wstopology.TpClusterInfoResponse tpClusterInfo(org.hpccsystems.ws.client.soap.wstopology.TpClusterInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsTopology/TpClusterInfo?ver_=1.19");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TpClusterInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.wstopology.TpClusterInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.wstopology.TpClusterInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.wstopology.TpClusterInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.wstopology.TpClusterQueryResponse tpClusterQuery(org.hpccsystems.ws.client.soap.wstopology.TpClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsTopology/TpClusterQuery?ver_=1.19");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TpClusterQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.wstopology.TpClusterQueryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.wstopology.TpClusterQueryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.wstopology.TpClusterQueryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.wstopology.TpGetComponentFileResponse tpGetComponentFile(org.hpccsystems.ws.client.soap.wstopology.TpGetComponentFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsTopology/TpGetComponentFile?ver_=1.19");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TpGetComponentFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.wstopology.TpGetComponentFileResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.wstopology.TpGetComponentFileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.wstopology.TpGetComponentFileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.wstopology.TpGroupQueryResponse tpGroupQuery(org.hpccsystems.ws.client.soap.wstopology.TpGroupQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsTopology/TpGroupQuery?ver_=1.19");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TpGroupQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.wstopology.TpGroupQueryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.wstopology.TpGroupQueryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.wstopology.TpGroupQueryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.wstopology.TpListTargetClustersResponse tpListTargetClusters(org.hpccsystems.ws.client.soap.wstopology.TpListTargetClustersRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsTopology/TpListTargetClusters?ver_=1.19");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TpListTargetClusters"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.wstopology.TpListTargetClustersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.wstopology.TpListTargetClustersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.wstopology.TpListTargetClustersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.wstopology.TpLogFileResponse tpLogFile(org.hpccsystems.ws.client.soap.wstopology.TpLogFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsTopology/TpLogFile?ver_=1.19");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TpLogFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.wstopology.TpLogFileResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.wstopology.TpLogFileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.wstopology.TpLogFileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.wstopology.TpLogFileResponse tpLogFileDisplay(org.hpccsystems.ws.client.soap.wstopology.TpLogFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsTopology/TpLogFileDisplay?ver_=1.19");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TpLogFileDisplay"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.wstopology.TpLogFileResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.wstopology.TpLogFileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.wstopology.TpLogFileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.wstopology.TpLogicalClusterQueryResponse tpLogicalClusterQuery(org.hpccsystems.ws.client.soap.wstopology.TpLogicalClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsTopology/TpLogicalClusterQuery?ver_=1.19");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TpLogicalClusterQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.wstopology.TpLogicalClusterQueryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.wstopology.TpLogicalClusterQueryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.wstopology.TpLogicalClusterQueryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.wstopology.TpMachineQueryResponse tpMachineQuery(org.hpccsystems.ws.client.soap.wstopology.TpMachineQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsTopology/TpMachineQuery?ver_=1.19");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TpMachineQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.wstopology.TpMachineQueryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.wstopology.TpMachineQueryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.wstopology.TpMachineQueryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.wstopology.TpServiceQueryResponse tpServiceQuery(org.hpccsystems.ws.client.soap.wstopology.TpServiceQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsTopology/TpServiceQuery?ver_=1.19");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TpServiceQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.wstopology.TpServiceQueryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.wstopology.TpServiceQueryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.wstopology.TpServiceQueryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.wstopology.TpSetMachineStatusResponse tpSetMachineStatus(org.hpccsystems.ws.client.soap.wstopology.TpSetMachineStatusRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsTopology/TpSetMachineStatus?ver_=1.19");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TpSetMachineStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.wstopology.TpSetMachineStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.wstopology.TpSetMachineStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.wstopology.TpSetMachineStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.wstopology.TpSwapNodeResponse tpSwapNode(org.hpccsystems.ws.client.soap.wstopology.TpSwapNodeRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsTopology/TpSwapNode?ver_=1.19");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TpSwapNode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.wstopology.TpSwapNodeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.wstopology.TpSwapNodeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.wstopology.TpSwapNodeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.wstopology.TpTargetClusterQueryResponse tpTargetClusterQuery(org.hpccsystems.ws.client.soap.wstopology.TpTargetClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsTopology/TpTargetClusterQuery?ver_=1.19");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TpTargetClusterQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.wstopology.TpTargetClusterQueryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.wstopology.TpTargetClusterQueryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.wstopology.TpTargetClusterQueryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.wstopology.TpThorStatusResponse tpThorStatus(org.hpccsystems.ws.client.soap.wstopology.TpThorStatusRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsTopology/TpThorStatus?ver_=1.19");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TpThorStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.wstopology.TpThorStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.wstopology.TpThorStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.wstopology.TpThorStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.hpccsystems.ws.client.soap.wstopology.TpXMLFileResponse tpXMLFile(org.hpccsystems.ws.client.soap.wstopology.TpXMLFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsTopology/TpXMLFile?ver_=1.19");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TpXMLFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.client.soap.wstopology.TpXMLFileResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.client.soap.wstopology.TpXMLFileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.client.soap.wstopology.TpXMLFileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) {
              throw (org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
