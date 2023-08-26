package com.coding.interview.alight;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee_AddressMain {
    public static List<Employee> listOfEmployee = List.of(
            new Employee(101, 34, "Ramjeet", "HR", 40000.0, new Address("String1", 560037)),
            new Employee(101, 18, "Fukra", "ADMIN", 650000, new Address("String4", 560038)),
            new Employee(101, 24, "Trigger", "Account", 50000, new Address("String3", 560034)),
            new Employee(101, 21, "Carry", "DevOps", 300000, new Address("String0", 560032)),
            new Employee(101, 20, "Hudda", "HR", 400000, new Address("String8", 560031))
    );

    public static void main(String[] args) {

        Map<String, Optional<Employee>> maxSalariesByDepartment = listOfEmployee.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

        maxSalariesByDepartment.forEach((department, employee) -> {
            System.out.println("Department: " + department + ", Max Salary: " +
                    (employee.isPresent() ? employee.get().getSalary() : "N/A"));
        });

        Optional<Double> overallMaxSalary = maxSalariesByDepartment.values().stream()
                .flatMap(Optional::stream)
                .map(Employee::getSalary)
                .max(Double::compare);

        System.out.println("Overall Highest Salary: " +
                (overallMaxSalary.isPresent() ? overallMaxSalary.get() : "N/A"));

        //or
        double highestSalary = listOfEmployee.stream()
                .mapToDouble(Employee::getSalary)
                .max()
                .orElse(0); // Default value if there are no employees
        System.out.println("The highest salary across all departments: " + highestSalary);

    }
}
