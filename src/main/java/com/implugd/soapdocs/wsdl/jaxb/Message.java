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
@XmlRootElement(name = "message")
public class Message {

    @XmlAttribute(name = "name")
    private QName name;

    @XmlElement(name = "part")
    private Part part;

    public QName getName() {
        return name;
    }

    public Part getPart() {
        return part;
    }

    public void setName(QName name) {
        this.name = name;
    }

    public void setPart(Part part) {
        this.part = part;
    }

}
