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
@XmlRootElement(name = "element")
public class Element {

    @XmlAttribute(name = "name")
    private QName name;

    @XmlAttribute(name = "maxOccurs")
    private String maxOccurs;

    @XmlAttribute(name = "minOccurs")
    private String minOccurs;

    @XmlAttribute(name = "nillable")
    private boolean nillable;

    @XmlAttribute(name = "type")
    private QName type;

    @XmlElement(name = "complexType")
    private ComplexType complexType;

    public QName getName() {
        return name;
    }

    public String getMaxOccurs() {
        return maxOccurs;
    }

    public String getMinOccurs() {
        return minOccurs;
    }

    public boolean isNillable() {
        return nillable;
    }

    public QName getType() {
        return type;
    }

    public ComplexType getComplexType() {
        return complexType;
    }

    public void setName(QName name) {
        this.name = name;
    }

    public void setMaxOccurs(String maxOccurs) {
        this.maxOccurs = maxOccurs;
    }

    public void setMinOccurs(String minOccurs) {
        this.minOccurs = minOccurs;
    }

    public void setNillable(boolean nillable) {
        this.nillable = nillable;
    }

    public void setComplexType(ComplexType complexType) {
        this.complexType = complexType;
    }

    public void setType(QName type) {
        this.type = type;
    }

}
