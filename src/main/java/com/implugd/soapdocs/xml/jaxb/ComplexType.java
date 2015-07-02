/*
 *  2014 (C) Implugd
 */
package com.implugd.soapdocs.xml.jaxb;

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
@XmlRootElement(name = "complexType")
public class ComplexType {

    @XmlAttribute(name = "name")
    private QName name;

    @XmlElement(name = "sequence")
    private Sequence sequence;

    public QName getName() {
        return name;
    }

    public Sequence getSequence() {
        return sequence;
    }

    public void setName(QName name) {
        this.name = name;
    }

    public void setSequence(Sequence sequence) {
        this.sequence = sequence;
    }

}
