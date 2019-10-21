
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package edu.itq.soa.credit;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://itq.edu/soa/credit".equals(namespaceURI) &&
                  "domicilio_type0".equals(typeName)){
                   
                            return  edu.itq.soa.credit.Domicilio_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://itq.edu/soa/credit".equals(namespaceURI) &&
                  "codigo".equals(typeName)){
                   
                            return  edu.itq.soa.credit.Codigo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://itq.edu/soa/credit".equals(namespaceURI) &&
                  "tarjeta".equals(typeName)){
                   
                            return  edu.itq.soa.credit.Tarjeta.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    