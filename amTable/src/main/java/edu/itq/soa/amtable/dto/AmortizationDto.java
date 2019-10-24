/**
 * 
 */
package edu.itq.soa.amtable.dto;

/**
 * @author eduar
 *
 */
public class AmortizationDto {
    private String idrfc;
    private int periodo;
    private double capitalRestante;
    private double abonoInteres;
    private double abonoCapital;
    private double pagoMensual;
    /**
     * @return the idrfc
     */
    public String getIdrfc() {
        return idrfc;
    }
    /**
     * @param idrfc the idrfc to set
     */
    public void setIdrfc(String idrfc) {
        this.idrfc = idrfc;
    }
    /**
     * @return the periodo
     */
    public int getPeriodo() {
        return periodo;
    }
    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    /**
     * @return the capitalRestante
     */
    public double getCapitalRestante() {
        return capitalRestante;
    }
    /**
     * @param capitalRestante the capitalRestante to set
     */
    public void setCapitalRestante(double capitalRestante) {
        this.capitalRestante = capitalRestante;
    }
    /**
     * @return the abonoInteres
     */
    public double getAbonoInteres() {
        return abonoInteres;
    }
    /**
     * @param abonoInteres the abonoInteres to set
     */
    public void setAbonoInteres(double abonoInteres) {
        this.abonoInteres = abonoInteres;
    }
    /**
     * @return the abonoCapital
     */
    public double getAbonoCapital() {
        return abonoCapital;
    }
    /**
     * @param abonoCapital the abonoCapital to set
     */
    public void setAbonoCapital(double abonoCapital) {
        this.abonoCapital = abonoCapital;
    }
    /**
     * @return the pagoMensual
     */
    public double getPagoMensual() {
        return pagoMensual;
    }
    /**
     * @param pagoMensual the pagoMensual to set
     */
    public void setPagoMensual(double pagoMensual) {
        this.pagoMensual = pagoMensual;
    }
}
