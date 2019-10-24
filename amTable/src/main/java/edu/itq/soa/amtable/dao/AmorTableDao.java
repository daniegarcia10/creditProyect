/**
 * 
 */
package edu.itq.soa.amtable.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import edu.itq.soa.amtable.dto.AmorTableDto;

/**
 * @author eduar
 *
 */
public class AmorTableDao {
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
    
    /**
     * agrega el registro de una tabla en la tabla AmorTable
     */
    public void addNewTable(AmorTableDto amorTableDto) {
        jdbcTemplate.execute("INSERT INTO amortization_table(idrfc, rfc) VALUES('"
                + amorTableDto.getId() + "', '" + amorTableDto.getRfc()
                + "')");
    }
    
    public int countCoincidencias(AmorTableDto amorTableDto) {
        return jdbcTemplate.queryForInt("select count(*) from amortization_table where rfc = '" + amorTableDto.getRfc() + "';");
    }
}
