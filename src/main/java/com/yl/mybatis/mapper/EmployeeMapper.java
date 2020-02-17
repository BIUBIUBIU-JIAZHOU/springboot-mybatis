package com.yl.mybatis.mapper;

import com.yl.mybatis.bean.Employee;

public interface EmployeeMapper  {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}