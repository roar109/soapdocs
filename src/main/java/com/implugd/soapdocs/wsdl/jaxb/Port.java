/*
 *  2014 (C) Implugd
 */
package com.implugd.soapdocs.wsdl.jaxb;

import com.implugd.soapdocs.soap.jaxb.Address;
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
public class Port {

    @XmlAttribute(name = "name")
    private QName name;

    @XmlElement(name = "address", namespace = "http://schemas.xmlsoap.org/wsdl/soap/")
    private Address address;

    public QName getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(QName name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
