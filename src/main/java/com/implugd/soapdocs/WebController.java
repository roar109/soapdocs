/*
 * 2014 (C) Implugd
 */
package com.implugd.soapdocs;


import com.implugd.soapdocs.reader.WSDLReader;
import com.implugd.soapdocs.types.WSDLModel;
import com.implugd.soapdocs.types.WSDLObjectFactory;
import com.implugd.soapdocs.wsdl.jaxb.Definitions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author Rene
 */
@Controller
public class WebController
{
   WSDLReader   reader;
   final String url = "http://esbeap-dev.24hourfit.com:8180/ProductSalesFacade/WebService/ProductSales-1.0.0?wsdl";


   /**
    * Represents index
    *
    * @return
    * @since Jul 2, 2015
    *
    */
   @RequestMapping (value = "/index", method = RequestMethod.GET)
   public ModelAndView index ()
   {
      final Definitions definition = reader.parseWSDL (url);

      final WSDLObjectFactory factory = new WSDLObjectFactory ();

      final WSDLModel model = factory.createWSDLModel (definition);

      final ModelAndView modelAndView = new ModelAndView ();
      modelAndView.setViewName ("SOAP");
      modelAndView.addObject ("model", model);
      return modelAndView;
   }


   /**
    * Represents setReader
    *
    * @param readerValue
    * @since Jul 2, 2015
    *
    */
   public void setReader (final WSDLReader readerValue)
   {
      this.reader = readerValue;
   }

}
