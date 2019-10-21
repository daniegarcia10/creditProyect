
/**
 * CreditServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package edu.itq.soa.credit;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import edu.itq.soa.buroCheck.BuroCheckServiceStub;

/**
 * CreditServiceSkeleton java skeleton for the axisService
 */
public class CreditServiceImpl extends CreditServiceSkeleton{

    /**
     * Auto generated method signature
     * 
     * @param request
     * @return response
     * @throws RemoteException 
     */

    public Response creditOperation(Request request) {
        // TODO : fill this with the necessary business logic
        Response response = new Response();
        try {
            BuroCheckServiceStub bStub = new BuroCheckServiceStub("http://localhost:8090/axis2/services/buroCheckService/");
            BuroCheckServiceStub.Request requestBuro = new BuroCheckServiceStub.Request();
            BuroCheckServiceStub.Tarjeta tarjeta = BuroCheckServiceStub.Tarjeta.Factory.fromString(request.getNoTarjeta().getTarjeta(),"");
            requestBuro.setNoTarjeta(tarjeta);
            BuroCheckServiceStub.Response responseBuro = bStub.buroCheckOperation(requestBuro);
            if(responseBuro.getValid()) {
                //TODO - AmTableResponse
                response.setMessage("valido");
            } else {
                response.setMessage("no valido");
                throw new Exception ("Credito no valido");
            }
        } catch (AxisFault e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return response;
    }

}
