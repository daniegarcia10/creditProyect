/**
 * 
 */
package com.springsample.dto;

/**
 * @author tlopez
 *
 */
public class UsuarioDto {
    private Integer time;
    private Float interest;
    private Float quantiti;
    /**
     * @return the id
     */
    public Integer getTime() {
        return time;
    }
    /**
     * @param id the id to set
     */
    public void setTime(Integer time) {
        this.time = time;
    }
    /**
     * @return the Interest
     */
    public Float getInterest() {
        return interest;
    }
    /**
     * @param login the login to set
     */
    public void setInterest(Float interest) {
        this.interest = interest;
    }
    /**
     * @return the password
     */
    public Float getQuantiti() {
        return quantiti;
    }
    /**
     * @param password the password to set
     */
    public void setQuantiti(Float quantiti) {
        this.quantiti = quantiti;
    }
}
