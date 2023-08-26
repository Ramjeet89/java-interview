package com.coding.interview.service;

import com.coding.interview.model.Employee;
import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    List<Employee> getAllEmployee();
}
