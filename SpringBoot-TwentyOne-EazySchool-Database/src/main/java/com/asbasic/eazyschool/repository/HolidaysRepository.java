package com.asbasic.eazyschool.repository;

import com.asbasic.eazyschool.model.Holiday;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HolidaysRepository {
    private final JdbcTemplate jdbcTemplate;

    public HolidaysRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Holiday> findAllHolidays(){
        String sql = "SELECT * FROM HOLIDAYS";
        // BeanPropertyRowMapper is used when the table structure is exactly same as model class
        // otherwise custom RowMapper is required
        var rowMapper = BeanPropertyRowMapper.newInstance(Holiday.class);
        return jdbcTemplate.query(sql, rowMapper);
    }

}
