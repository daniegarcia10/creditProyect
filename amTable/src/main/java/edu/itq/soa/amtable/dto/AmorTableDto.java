/**
 * 
 */
package edu.itq.soa.amtable.dto;

/**
 * @author eduar
 *
 */
public class AmorTableDto {
    /**
     * id es una combinacion de rfc mas la cantidad de veces que aparezca es rfc en
     * la tabla
     */
    private String idrfc;
    private String rfc;
    /**
     * fecha en la que se solicito la creacion de la tabla
     */
    public String getId() {
        return idrfc;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.idrfc = id;
    }
    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }
    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
}
