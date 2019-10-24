/**
 * 
 */
package edu.itq.soa.amtable.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import edu.itq.soa.amtable.dto.AmortizationDto;

/**
 * @author eduar
 *
 */
public class AmortizationDao {
    /**
     * Template para manejo de BD de Spring.
     */
    protected JdbcTemplate jdbcTemplate;

    /**
     * Establece el template.
     * 
     * @param jdbcTemplate
     */
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addNewDetail(AmortizationDto amortizationDto) {
        jdbcTemplate.execute("INSERT INTO amortization_detail(rfc, periodo, capital_restante, abono_capital,"
                + "abono_interes, pago_mensual) VALUES('" + amortizationDto.getIdrfc() + "', " + amortizationDto.getPeriodo()
                + ", " + amortizationDto.getCapitalRestante() + ", " + amortizationDto.getAbonoCapital() + ", "
                + amortizationDto.getAbonoInteres() +", "+ amortizationDto.getPagoMensual() + ")");
    }
}
