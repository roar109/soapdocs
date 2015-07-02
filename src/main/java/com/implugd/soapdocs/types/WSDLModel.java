/*
 *  2014 (C) Implugd
 */
package com.implugd.soapdocs.types;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Rene
 */
public class WSDLModel {
    
    private String name;
    
    private String location;
    
    private String targetNamespace;
    
    private List<WSDLOperation> operations;
    
    private Map<String,WSDLComplexType> types;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTargetNamespace() {
        return targetNamespace;
    }

    public void setTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
    }

    public List<WSDLOperation> getOperations() {
        return operations;
    }

    public void setOperations(List<WSDLOperation> operation) {
        this.operations = operation;
    }

    public Map<String, WSDLComplexType> getTypes() {
        return types;
    }

    public void setTypes(Map<String,WSDLComplexType> types) {
        this.types = types;
    }
    
    
}
