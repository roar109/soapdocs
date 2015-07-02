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
@XmlRootElement(name = "sequence")
public class Sequence {

    @XmlAttribute(name = "maxOccurs")
    private String maxOccurs;

    @XmlAttribute(name = "minOccurs")
    private String minOccurs;

    @XmlElement(name = "element")
    private List<Element> element;

    public String getMaxOccurs() {
        return maxOccurs;
    }

    public String getMinOccurs() {
        return minOccurs;
    }

    public List<Element> getElement() {
        if (element == null) {
            element = new ArrayList<>();
        }
        return element;
    }

    public void setMaxOccurs(String maxOccurs) {
        this.maxOccurs = maxOccurs;
    }

    public void setMinOccurs(String minOccurs) {
        this.minOccurs = minOccurs;
    }

    public void setElement(List<Element> element) {
        this.element = element;
    }

}
