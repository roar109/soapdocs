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
@XmlRootElement(name = "part")
public class Part {

    @XmlAttribute(name = "name")
    private QName name;

    @XmlAttribute(name = "element")
    private QName element;

    public QName getName() {
        return name;
    }

    public QName getElement() {
        return element;
    }

}
