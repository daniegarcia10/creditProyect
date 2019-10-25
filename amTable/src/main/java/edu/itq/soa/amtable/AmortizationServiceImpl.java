/**
 * 
 */
package edu.itq.soa.amtable;

import edu.itq.soa.amtable.dao.AmorTableDao;
import edu.itq.soa.amtable.dao.AmortizationDao;
import edu.itq.soa.amtable.dto.AmorTableDto;
import edu.itq.soa.amtable.dto.AmortizationDto;

/**
 * @author eduar
 *
 */
public class AmortizationServiceImpl extends AmortizationServiceSkeleton {
    /**
     * Objeto para acceso a datos
     */
    private AmorTableDao amorTableDao;
    private AmortizationDao amortizationDao;

    public Response amortizationOperation(Request request) {
        Response response = new Response();
        Ack_type0 ack = new Ack_type0();

        ack.setId("0");
        ack.setDescription("Transaction exitosa");

        response.setAck(ack);

        AmortizationTable_type0 table = new AmortizationTable_type0();
        
        AmortizationDto amortizationDto = new AmortizationDto();
        AmorTableDto amorTableDto = new AmorTableDto();
        
        double interes = request.getInterest() / 12 / 100;
        int totalPagos = request.getTime() * 12;
        double pagoMensual = request.getQuantiti() * ((interes * Math.pow(1 + interes, totalPagos)) / ( Math.pow(1+interes, totalPagos) - 1));
        pagoMensual = Math.floor(pagoMensual * 100) / 100;
        Amortization_type0[] amortization = new Amortization_type0[totalPagos];
        double restante = request.getQuantiti();
        
        amorTableDto.setRfc(request.getRfc());
        int coincidencias = amorTableDao.countCoincidencias(amorTableDto);
        amorTableDto.setId(request.getRfc() + coincidencias);
        amorTableDao.addNewTable(amorTableDto);
        
        for (int i = 0; i < totalPagos; i++) {
            amortization[i] = new Amortization_type0();

            amortization[i].setMontoMensual(pagoMensual);
            double pagoInteres = restante * interes;
            pagoInteres = Math.floor(pagoInteres * 100) / 100;
            amortization[i].setPagoInteres(pagoInteres);
            amortization[i].setPagoCapital(pagoMensual - pagoInteres);
            amortization[i].setPeriodo(i + 1);
            restante -= (pagoMensual - pagoInteres);
            restante = Math.floor(restante * 100) / 100;
            if(Math.abs(restante) < 2)
                restante = 0;
            amortization[i].setCapital(restante);
            
            amortizationDto.setIdrfc(amorTableDto.getRfc() + coincidencias );
            amortizationDto.setCapitalRestante(amortization[i].getCapital());
            amortizationDto.setPeriodo(i + 1);
            amortizationDto.setAbonoCapital(amortization[i].getPagoCapital());
            amortizationDto.setAbonoInteres(amortization[i].getPagoInteres());
            amortizationDto.setPagoMensual(amortization[i].getMontoMensual());
            
            amortizationDao.addNewDetail(amortizationDto);
        }
        
        table.setAmortization(amortization);
        response.setAmortizationTable(table);
        
        return response;
    }

    /**
     * @return the amorTableDao
     */
    public AmorTableDao getAmorTableDao() {
        return amorTableDao;
    }

    /**
     * @param amorTableDao the amorTableDao to set
     */
    public void setAmorTableDao(AmorTableDao amorTableDao) {
        this.amorTableDao = amorTableDao;
    }

    /**
     * @return the amortizationDao
     */
    public AmortizationDao getAmortizationDao() {
        return amortizationDao;
    }

    /**
     * @param amortizationDao the amortizationDao to set
     */
    public void setAmortizationDao(AmortizationDao amortizationDao) {
        this.amortizationDao = amortizationDao;
    }
}
