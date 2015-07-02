/*
 * 2014 (C) Implugd
 */
package com.implugd.soapdocs.types;


import com.implugd.soapdocs.wsdl.jaxb.Definitions;
import com.implugd.soapdocs.wsdl.jaxb.Operation;
import com.implugd.soapdocs.wsdl.jaxb.PortType;
import com.implugd.soapdocs.wsdl.jaxb.Types;
import com.implugd.soapdocs.xml.jaxb.ComplexType;
import com.implugd.soapdocs.xml.jaxb.Element;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *
 * @author Rene
 */
public class WSDLObjectFactory
{
   public WSDLModel createWSDLModel (final Definitions definitions)
   {
      final WSDLModel model = new WSDLModel ();
      model.setName (definitions.getService ().getName ().getLocalPart ());
      model.setLocation (definitions.getService ().getPort ().getAddress ().getLocation ());
      model.setTargetNamespace (definitions.getTargetNamespace ());

      final List <ComplexType> complexType = new ArrayList <> ();
      if (definitions.getTypes () != null)
      {
         for (final Types types : definitions.getTypes ())
         {
            complexType.addAll (types.getSchema ().getComplexType ());
         }
      }
      model.setTypes (createComplexTypes (complexType));

      final List <Operation> operation = new ArrayList <> ();
      if (definitions.getPortType () != null)
      {
         for (final PortType types : definitions.getPortType ())
         {
            operation.addAll (types.getOperation ());
         }
      }

      model.setOperations (createWSDLOperations (operation, model.getTypes ()));

      return model;
   }


   private List <WSDLOperation> createWSDLOperations (final List <Operation> operations,
         final Map <String, WSDLComplexType> map)
   {
      List <WSDLOperation> result = null;
      if (operations != null)
      {
         result = new ArrayList <> ();
         for (final Operation operation : operations)
         {
            result.add (createWSDLOperation (operation, map));
         }
      }
      return result;
   }


   private WSDLOperation createWSDLOperation (final Operation operation, final Map <String, WSDLComplexType> map)
   {
      WSDLOperation result = null;
      if ( (operation != null) && (map != null))
      {
         result = new WSDLOperation ();
         result.setName (operation.getName ().getLocalPart ());
         if (operation.getFault () != null)
         {
            result.setFault (map.get (operation.getFault ().getMessage ().getLocalPart ()));
         }
         result.setOutput (map.get (operation.getOutput ().getMessage ().getLocalPart ()));
         result.setInput (map.get (operation.getInput ().getMessage ().getLocalPart ()));
      }
      return result;
   }


   private Map <String, WSDLComplexType> createComplexTypes (final List <ComplexType> complexTypes)
   {
      Map <String, WSDLComplexType> result = null;
      if (complexTypes != null)
      {
         result = new HashMap <> ();
         for (final ComplexType complexType : complexTypes)
         {
            result.put (complexType.getName ().getLocalPart (), createComplexType (complexType));
         }
      }
      return result;
   }


   private WSDLComplexType createComplexType (final ComplexType complexType)
   {
      WSDLComplexType result = null;
      if (complexType != null)
      {
         result = new WSDLComplexType ();
         result.setName (complexType.getName ().getLocalPart ());
         result.setElements (createElements (complexType.getSequence ().getElement ()));
      }
      return result;
   }


   private List <WSDLElement> createElements (final List <Element> elements)
   {
      List <WSDLElement> result = null;
      if (elements != null)
      {
         result = new ArrayList <> ();
         for (final Element element : elements)
         {
            result.add (createElement (element));
         }
      }
      return result;
   }


   private WSDLElement createElement (final Element element)
   {
      WSDLElement result = null;
      if (element != null)
      {
         result = new WSDLElement ();
         if (element.getName () != null)
         {
            result.setName (element.getName ().getLocalPart ());
         }
         if (element.getType () != null)
         {
            result.setType (element.getType ().getPrefix () + ":" + element.getType ().getLocalPart ());
         }

         result.setMinOccurs (element.getMinOccurs ());
         result.setMaxOccurs (element.getMaxOccurs ());
      }
      return result;
   }

}
