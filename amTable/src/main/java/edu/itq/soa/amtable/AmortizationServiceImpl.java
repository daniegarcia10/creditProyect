/**
 * 
 */
package edu.itq.soa.amtable;

import com.springsample.dao.UsuarioDao;
import com.springsample.dto.UsuarioDto;

/**
 * @author eduar
 *
 */
public class AmortizationServiceImpl extends AmortizationServiceSkeleton {
    /**
     * Objeto para acceso a datos
     */
    private UsuarioDao usuarioDao;

    public Response amortizationOperation(Request request) {
        Response response = new Response();
        Ack_type0 ack = new Ack_type0();
        AmortizationTable_type0 table = new AmortizationTable_type0();

        ack.setId("0");
        ack.setDescription("Transaction exitosa");

        response.setAck(ack);

        Amortization_type0[] amortization = new Amortization_type0[request.getTime() * 12];
        double interes = Math.pow(1 + request.getInterest(), 1 / 12) - 1;
        double totalPagos = request.getTime() * 12;
        double pagoMensual = request.getQuantiti() * (Math.pow(1 + interes, totalPagos) * interes)
                / (Math.pow(1 + interes, totalPagos) - 1);

        for (int i = 0; i <= amortization.length; i++) {
            double capitalRestante = pagoMensual * (Math.pow(1 - (1 / 1 + interes), totalPagos - i) / interes),
                    pagoAInteres = capitalRestante - 1 * interes, pagoACapital = 0;
            amortization[i] = new Amortization_type0();
            amortization[i].setMontoMensual(pagoMensual);
            amortization[i].setCapital(capitalRestante);
            amortization[i].setPagoInteres(pagoAInteres);
            amortization[i].setPagoCapital(pagoMensual - pagoAInteres);
            amortization[i].setPeriodo(i);
        }
        
        table.setAmortization(amortization);

        response.setAmortizationTable(table);
        return response;
    }

    public UsuarioDao getUsuarioDao() {
        return usuarioDao;
    }

    public void setUsuarioDao(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }
}
