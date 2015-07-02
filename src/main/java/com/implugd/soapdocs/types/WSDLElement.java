/*
 *  2014 (C) Implugd
 */
package com.implugd.soapdocs.types;

/**
 *
 * @author Rene
 */
public class WSDLElement {
    
    private String name;
    
    private String type;
    
    private String minOccurs;
    
    private String maxOccurs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMinOccurs() {
        return minOccurs;
    }

    public void setMinOccurs(String minOccurs) {
        this.minOccurs = minOccurs;
    }

    public String getMaxOccurs() {
        return maxOccurs;
    }

    public void setMaxOccurs(String maxOccurs) {
        this.maxOccurs = maxOccurs;
    }
    
    
}
