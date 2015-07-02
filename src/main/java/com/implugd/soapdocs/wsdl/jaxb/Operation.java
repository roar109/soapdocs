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
@XmlRootElement(name = "operation")
public class Operation {

    @XmlAttribute(name = "name")
    private QName name;

    @XmlElement(name = "input")
    private Input input;

    @XmlElement(name = "output")
    private Output output;

    @XmlElement(name = "fault")
    private Fault fault;

    public QName getName() {
        return name;
    }

    public Input getInput() {
        return input;
    }

    public Output getOutput() {
        return output;
    }

    public Fault getFault() {
        return fault;
    }

    public void setName(QName name) {
        this.name = name;
    }

    public void setInput(Input input) {
        this.input = input;
    }

    public void setOutput(Output output) {
        this.output = output;
    }

    public void setFault(Fault fault) {
        this.fault = fault;
    }

}
