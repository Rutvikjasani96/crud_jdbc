package com.crud_jdbc.dao;

import com.crud_jdbc.entites.Emp;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class EmpDaoImpl implements EmpDao{
    private JdbcTemplate jdbcTemplate;
    @Override
    public int insertData(Emp emp) {
        String query = "insert into emp(id,name,salary,city,status) values(?,?,?,?,?)";
            int result = jdbcTemplate.update(query,emp.getId(),emp.getName(),emp.getSalary(),emp.getCity(),emp.isStatus());
        return result;
    }

    @Override
    public int updateData(Emp emp) {
        String query = "update emp set name=?,salary=?,city=?,status=? where id=?";
        int result = jdbcTemplate.update(query,emp.getName(),emp.getSalary(),emp.getCity(),emp.isStatus(),emp.getId());
        return result;
    }

    @Override
    public int deleteData(int id) {
        String query = "delete from emp where id=?";
        int result = jdbcTemplate.update(query,id);
        return result;
    }

    @Override
    public Emp selectOneData(int id) {
        String query = "select * from emp where id=?";
        RowMapperImpl rowMapper = new RowMapperImpl();
        Emp emp = jdbcTemplate.queryForObject(query,rowMapper,id);
        return emp;
    }

    @Override
    public List<Emp> selectAllData() {
        String query = "select * from emp";
        RowMapperImpl rowMapper = new RowMapperImpl();
        List<Emp> emps = jdbcTemplate.query(query,rowMapper);
        return emps;
    }

//    Getters & Setters
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
