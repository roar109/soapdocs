/*
 *  2014 (C) Implugd
 */
package com.implugd.soapdocs.wsdl.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

/**
 *
 * @author Rene
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "input")
public class Input {

    @XmlAttribute(name = "name")
    private QName name;

    @XmlAttribute(name = "message")
    private QName message;

    public QName getName() {
        return name;
    }

    public QName getMessage() {
        return message;
    }

    public void setName(QName name) {
        this.name = name;
    }

    public void setMessage(QName message) {
        this.message = message;
    }

}
