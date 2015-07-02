/*
 * 2014 (C) Implugd
 */
package com.implugd.soapdocs.reader;


import com.implugd.soapdocs.wsdl.jaxb.Definitions;



/**
 *
 * @author Rene
 */
public interface WSDLReader
{

   /**
    * Represents parseWSDL
    *
    * @param url
    * @return
    * @since Jul 2, 2015
    *
    * @todo complete description
    */
   Definitions parseWSDL (String url);
}
