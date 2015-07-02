/*
 *  2014 (C) Implugd
 */
package com.implugd.soapdocs.types;

import java.util.List;

/**
 *
 * @author Rene
 */
public class WSDLComplexType {
    private String name;
    private List<WSDLElement> elements;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WSDLElement> getElements() {
        return elements;
    }

    public void setElements(List<WSDLElement> elements) {
        this.elements = elements;
    }
    
    
}
