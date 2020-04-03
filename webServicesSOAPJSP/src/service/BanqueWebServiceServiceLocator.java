/**
 * BanqueWebServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class BanqueWebServiceServiceLocator extends org.apache.axis.client.Service implements service.BanqueWebServiceService {

    public BanqueWebServiceServiceLocator() {
    }


    public BanqueWebServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BanqueWebServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BanqueWebServicePort
    private java.lang.String BanqueWebServicePort_address = "http://192.168.10.1:8585/BWS";

    public java.lang.String getBanqueWebServicePortAddress() {
        return BanqueWebServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BanqueWebServicePortWSDDServiceName = "BanqueWebServicePort";

    public java.lang.String getBanqueWebServicePortWSDDServiceName() {
        return BanqueWebServicePortWSDDServiceName;
    }

    public void setBanqueWebServicePortWSDDServiceName(java.lang.String name) {
        BanqueWebServicePortWSDDServiceName = name;
    }

    public service.BanqueWebService getBanqueWebServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BanqueWebServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBanqueWebServicePort(endpoint);
    }

    public service.BanqueWebService getBanqueWebServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            service.BanqueWebServicePortBindingStub _stub = new service.BanqueWebServicePortBindingStub(portAddress, this);
            _stub.setPortName(getBanqueWebServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBanqueWebServicePortEndpointAddress(java.lang.String address) {
        BanqueWebServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (service.BanqueWebService.class.isAssignableFrom(serviceEndpointInterface)) {
                service.BanqueWebServicePortBindingStub _stub = new service.BanqueWebServicePortBindingStub(new java.net.URL(BanqueWebServicePort_address), this);
                _stub.setPortName(getBanqueWebServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BanqueWebServicePort".equals(inputPortName)) {
            return getBanqueWebServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service/", "BanqueWebServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service/", "BanqueWebServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BanqueWebServicePort".equals(portName)) {
            setBanqueWebServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
