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
    private String id;
    private String rfc;
    /**
     * fecha en la que se solicito la creacion de la tabla
     */
    private String fecha;
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }
    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
