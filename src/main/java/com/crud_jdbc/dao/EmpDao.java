package com.crud_jdbc.dao;

import com.crud_jdbc.entites.Emp;

import java.util.List;

public interface EmpDao {
    public int insertData(Emp emp);
    public int updateData(Emp emp);
    public int deleteData(int id);
    public Emp selectOneData(int id);
    public List<Emp> selectAllData();
}
