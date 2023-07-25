package com.luv2code.cruddemo.service;


import com.luv2code.cruddemo.dao.EmployeeRepository;
import com.luv2code.cruddemo.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        return employeeRepository.findById(id).orElseGet(()->null);
    }

    // @Transactional - no longer needed
    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    // @Transactional - no longer needed
    @Override
    public void deleteById(int id) {
         employeeRepository.deleteById(id);
    }
}
