/*
 *  2014 (C) Implugd
 */
package com.implugd.soapdocs.types;

/**
 *
 * @author Rene
 */
public class WSDLOperation {

    private String name;
    private WSDLComplexType input;
    private WSDLComplexType output;
    private WSDLComplexType fault;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WSDLComplexType getInput() {
        return input;
    }

    public void setInput(WSDLComplexType input) {
        this.input = input;
    }

    public WSDLComplexType getOutput() {
        return output;
    }

    public void setOutput(WSDLComplexType output) {
        this.output = output;
    }

    public WSDLComplexType getFault() {
        return fault;
    }

    public void setFault(WSDLComplexType fault) {
        this.fault = fault;
    }

}
