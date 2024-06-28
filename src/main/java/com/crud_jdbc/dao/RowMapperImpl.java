package com.crud_jdbc.dao;

import com.crud_jdbc.entites.Emp;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper<Emp> {
    @Override
    public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
        Emp emp = new Emp();
        emp.setId(rs.getInt(1));
        emp.setName(rs.getString(2));
        emp.setSalary(rs.getInt(3));
        emp.setCity(rs.getString(4));
        emp.setStatus(rs.getBoolean(5));
        return emp;
    }
}
