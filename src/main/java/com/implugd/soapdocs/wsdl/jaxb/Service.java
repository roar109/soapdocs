/*
 *  2014 (C) Implugd
 */
package com.implugd.soapdocs.wsdl.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

/**
 *
 * @author Rene
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "service")
public class Service {

    @XmlAttribute(name = "name")
    private QName name;

    @XmlElement(name = "port")
    private Port port;

    public QName getName() {
        return name;
    }

    public Port getPort() {
        return port;
    }

    public void setName(QName name) {
        this.name = name;
    }

    public void setPort(Port port) {
        this.port = port;
    }

}
