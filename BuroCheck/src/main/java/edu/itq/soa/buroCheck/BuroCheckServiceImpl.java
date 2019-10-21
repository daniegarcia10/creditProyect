
/**
 * BuroCheckServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package edu.itq.soa.buroCheck;

import edu.itq.soa.burocheck.Request;
import edu.itq.soa.burocheck.Response;

/**
 * BuroCheckServiceSkeleton java skeleton for the axisService
 */
public class BuroCheckServiceImpl extends BuroCheckServiceSkeleton {

    /**
     * Auto generated method signature
     * 
     * @param request
     * @return response
     */

    public Response buroCheckOperation(Request request) {
        // TODO : fill this with the necessary business logic
        Response response = new Response();
        request.getNoTarjeta();
        if(Math.random() > 0.3) {
            response.setValid(true);
        } else {
            response.setValid(false);
        }
        return response;
    }

}
