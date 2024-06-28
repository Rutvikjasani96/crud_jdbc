package com.crud_jdbc;

import com.crud_jdbc.dao.EmpDao;
import com.crud_jdbc.dao.EmpDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.crud_jdbc.dao"})
public class JavaConfig {

    @Bean("dataSource")
    public DataSource getDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        dataSource.setUsername("root");
        dataSource.setPassword("Rutvik@123");
        return dataSource;
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate getJdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }

//    @Bean("empDao")
//    public EmpDaoImpl getEmpDao(){
//        EmpDaoImpl empDao = new EmpDaoImpl();
//        empDao.setJdbcTemplate(getJdbcTemplate());
//        return empDao;
//    }
}
