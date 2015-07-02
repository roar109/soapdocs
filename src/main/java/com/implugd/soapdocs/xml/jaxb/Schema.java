/*
 *  2014 (C) Implugd
 */
package com.implugd.soapdocs.xml.jaxb;

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
@XmlRootElement(name = "schema")
public class Schema {

    @XmlAttribute(name = "targetNamespace")
    private String targetNamespace;

    @XmlElement(name = "element")
    private List<Element> element;

    @XmlElement(name = "complexType")
    private List<ComplexType> complexType;

    public String getTargetNamespace() {
        return targetNamespace;
    }

    public List<Element> getElement() {
        if (element == null) {
            element = new ArrayList<>();
        }
        return element;
    }

    public List<ComplexType> getComplexType() {
        if (complexType == null) {
            complexType = new ArrayList<>();
        }
        return complexType;
    }

    public void setTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
    }

    public void setElement(List<Element> element) {
        this.element = element;
    }

    public void setComplexType(List<ComplexType> complexType) {
        this.complexType = complexType;
    }

}
