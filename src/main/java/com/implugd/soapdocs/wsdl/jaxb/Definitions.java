/*
 *  2014 (C) Implugd
 */
package com.implugd.soapdocs.wsdl.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rene
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "definitions")
public class Definitions {

    @XmlAttribute(name = "targetNamespace")
    private String targetNamespace;

    @XmlElement(name = "types")
    private List<Types> types;

    @XmlElement(name = "message")
    private List<Message> message;

    @XmlElement(name = "portType")
    private List<PortType> portType;

    @XmlElement(name = "binding")
    private List<Binding> binding;

    @XmlElement(name = "service")
    private Service service;

    public String getTargetNamespace() {
        return targetNamespace;
    }

    public List<Types> getTypes() {
        if (types == null) {
            types = new ArrayList<>();
        }
        return types;
    }

    public List<Message> getMessage() {
        if (message == null) {
            message = new ArrayList<>();
        }
        return message;
    }

    public List<PortType> getPortType() {
        if (portType == null) {
            portType = new ArrayList<>();
        }
        return portType;
    }

    public List<Binding> getBinding() {
        if (binding == null) {
            binding = new ArrayList<>();
        }
        return binding;
    }

    public Service getService() {
        return service;
    }

    public void setTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
    }

    public void setTypes(List<Types> types) {
        this.types = types;
    }

    public void setMessage(List<Message> message) {
        this.message = message;
    }

    public void setPortType(List<PortType> portType) {
        this.portType = portType;
    }

    public void setBinding(List<Binding> binding) {
        this.binding = binding;
    }

    public void setService(Service service) {
        this.service = service;
    }

}
