
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package edu.itq.soa.amtable;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://itq.edu/soa/amTable".equals(namespaceURI) &&
                  "ack_type0".equals(typeName)){
                   
                            return  edu.itq.soa.amtable.Ack_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://itq.edu/soa/amTable".equals(namespaceURI) &&
                  "amortizationTable_type0".equals(typeName)){
                   
                            return  edu.itq.soa.amtable.AmortizationTable_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://itq.edu/soa/amTable".equals(namespaceURI) &&
                  "amortization_type0".equals(typeName)){
                   
                            return  edu.itq.soa.amtable.Amortization_type0.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    