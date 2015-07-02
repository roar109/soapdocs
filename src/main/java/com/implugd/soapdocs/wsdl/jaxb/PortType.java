/*
 *  2014 (C) Implugd
 */
package com.implugd.soapdocs.wsdl.jaxb;

import java.util.List;
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
@XmlRootElement(name = "portType")
public class PortType {

    @XmlAttribute(name = "name")
    private QName name;

    @XmlElement(name = "operation")
    private List<Operation> operation;

    public QName getName() {
        return name;
    }

    public List<Operation> getOperation() {
        return operation;
    }

    public void setName(QName name) {
        this.name = name;
    }

    public void setOperation(List<Operation> operation) {
        this.operation = operation;
    }

}
