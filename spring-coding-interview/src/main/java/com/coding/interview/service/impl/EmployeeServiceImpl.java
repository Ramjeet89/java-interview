package com.coding.interview.service.impl;

import com.coding.interview.model.Employee;
import com.coding.interview.repository.EmployeeRepository;
import com.coding.interview.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
}
