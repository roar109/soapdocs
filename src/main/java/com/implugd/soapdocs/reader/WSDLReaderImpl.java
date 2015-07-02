/*
 * 2014 (C) Implugd
 */
package com.implugd.soapdocs.reader;


import com.implugd.soapdocs.wsdl.jaxb.Definitions;

import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Rene
 */
public class WSDLReaderImpl implements WSDLReader
{

   /**
    * Overrides parseWSDL
    *
    * @param url
    * @return
    * @since Jul 2, 2015
    * @see com.implugd.soapdocs.reader.WSDLReader#parseWSDL(java.lang.String)
    */
   @Override
   public Definitions parseWSDL (final String url)
   {
      Definitions result = null;
      try
      {
         final RestTemplate restTemplate = new RestTemplate ();
         result = restTemplate.getForObject (new URI (url), Definitions.class);
      }
      catch (final URISyntaxException ex)
      {
         Logger.getLogger (WSDLReaderImpl.class.getName ()).log (Level.SEVERE, null, ex);
      }
      return result;
   }

}
