package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
