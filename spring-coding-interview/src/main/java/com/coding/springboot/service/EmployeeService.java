package com.coding.springboot.service;

import com.coding.springboot.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
//    Employee createEmployee(Employee employee);
//    List<Employee> getAllEmployee();

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Optional<Employee> getEmployeeById(long id);

    Employee updateEmployee(Employee updatedEmployee);

    void deleteEmployee(long id);
}
