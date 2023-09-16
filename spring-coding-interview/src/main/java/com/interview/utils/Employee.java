package com.interview.utils;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Employee {
    private int salary;
    private String name;
    private int age;

    public long getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(int salary, String name, int age) {
        this.salary = salary;
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        List<Employee> listOfEmployee = List.of(
                new Employee(22000, "Ram", 23),
                new Employee(23000, "Suraj", 14),
                new Employee(25000, "John", 54),
                new Employee(30000, "Daan", 25),
                new Employee(21000, "Sumit", 76),
                new Employee(29000, "Amit", 18)
        );



        Optional<Employee> thirdHighestSalaryWithHighestAge = listOfEmployee.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()
                        .thenComparingInt(Employee::getAge).reversed())
                .skip(2)
                .findFirst();
        if (thirdHighestSalaryWithHighestAge.isPresent()) {
            Employee employee = thirdHighestSalaryWithHighestAge.get();
            System.out.println("Name: " + employee.getName());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Salary: " + employee.getSalary());
        } else {
            System.out.println("No employee found.");
        }

        List<Employee> sortByName = listOfEmployee.stream()
                .sorted(Comparator.comparing(Employee::getName)).toList();
        sortByName.forEach(System.out::println);
        sortByName.forEach(employee -> System.out.println("Name: " + employee.getName()));
    }
}
