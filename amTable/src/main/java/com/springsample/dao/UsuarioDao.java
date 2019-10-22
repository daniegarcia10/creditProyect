package com.springsample.dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.springsample.dto.UsuarioDto;

/**
 * @author tlopez
 */
public class UsuarioDao {
    /** Campo id. */
	private static final String ID = "id";

    /** Campo login. */
    private static final String LOGIN = "login";

    /** Campo password. */
    private static final String PASSWORD = "password";

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






