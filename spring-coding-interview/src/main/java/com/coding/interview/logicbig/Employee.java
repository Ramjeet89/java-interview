package com.coding.interview.logicbig;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String role;
    private double salary;

    public Employee(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class FilterEmployeesByRole {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "Manager", 50000));
        employees.add(new Employee("Bob", "Developer", 40000));
        employees.add(new Employee("Charlie", "Manager", 34000));
        employees.add(new Employee("Charlie", "Team Lead", 30000));
        employees.add(new Employee("Charlie", "Team Lead", 34000));

        // Using Stream API to filter employees by role
        List<Employee> managers = employees.stream()
                .filter(employee -> "Manager".equals(employee.getRole()))
                .toList();

        // Print details of filtered employees
        System.out.println("Employees with role 'Manager'");
        managers.forEach(manager ->
                System.out.println("Name: " + manager.getName() + ", Role: " + manager.getRole()));


        List<Employee> increaseSalary5000 = employees.stream().map(
                employee -> new Employee(
                        employee.getName(),
                        employee.getRole(),
                        employee.getSalary() + 5000
                )).toList();

        System.out.println("Increased 5000 salary for Each Emp: " + increaseSalary5000);


        // Using Stream API to increase salary for Team Leads
        List<Employee> updatedEmployees = employees.stream()
                .peek(employee -> {
                    if ("Team Lead".equals(employee.getRole())) {
                        employee.setSalary(employee.getSalary() + 5000);
                    }
                }).toList();

        // Print details of updated employees
        System.out.println("Updated employee details:");
        updatedEmployees.forEach(updatedEmployee ->
                System.out.println("Name: " + updatedEmployee.getName() + ", Role: " + updatedEmployee.getRole() + ", Salary: " + updatedEmployee.getSalary()));
    }
}
