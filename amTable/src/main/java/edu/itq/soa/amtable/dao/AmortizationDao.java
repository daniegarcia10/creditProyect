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
     * @param jdbcTemplate
     */
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
