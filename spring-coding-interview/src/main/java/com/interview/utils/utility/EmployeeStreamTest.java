package com.interview.utils.utility;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeStreamTest {

    static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee("Ramjeet", "Mahto", 40000.0, List.of("project1", "project2")));
        employees.add(new Employee("Pankaj", "Kumar", 30000.0, List.of("project3", "project2")));
        employees.add(new Employee("Rajan", "Gupta", 25000.0, List.of("project1", "project4")));
        employees.add(new Employee("Shilpy", "Kumari", 20000.0, List.of("project6", "project2")));
        employees.add(new Employee("Dinesh", "yadaw", 10000.0, List.of("project5", "project2")));
    }

    public static void main(String[] args) {
        Stream.of(employees);
        employees.stream().forEach(System.out::println);

        //map
        //collect
        List<Employee> employeeList = employees.stream().map(employee -> new Employee(
                employee.getFirstName(),
                employee.getLastName(),
                employee.getSalary() * 1.10,
                employee.getProjects()
        )).toList();
        System.out.println(employeeList);

        Set<Employee> employeeSet = employeeList.stream().map(employee -> new Employee(
                employee.getFirstName(),
                employee.getLastName(),
                employee.getSalary() * 1.10,
                employee.getProjects())).collect(Collectors.toSet());
        System.out.println(employeeSet);

        //filter
        List<Employee> greaterThen10000 = employees.stream()
                .filter(employee -> employee.getSalary() > 10000)
                .map(employee -> new Employee(
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getSalary() * 1.10,
                        employee.getProjects()
                )).toList();
        System.out.println(greaterThen10000);

        //find firstEmployee
        Employee findFirstEmployee = employees.stream()
                .filter(employee -> employee.getSalary() > 10000)
                .map(employee -> new Employee(
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getSalary() * 1.10,
                        employee.getProjects()
                )).findFirst().orElse(null);
        System.out.println(findFirstEmployee);

        //flatMap
        String projects = employees.stream().map(Employee::getProjects).
                flatMap(strings -> strings.stream()).collect(Collectors.joining(","));
        System.out.println(projects);

        //sort circuit operations
        List<Employee> sortCircuiteData = employees.stream().skip(1).limit(1).collect(Collectors.toList());
        System.out.println(sortCircuiteData);

        //finite data
        Stream.generate(Math::random).limit(5).forEach(System.out::println);

        //sorting
        List<Employee> sortingEmployee = employees.stream()
                .sorted((o1, o2) -> o1.getFirstName()
                        .compareToIgnoreCase(o2.getFirstName()))
                .toList();
        System.out.println(sortingEmployee);

        //max salary of employee
        Employee maxSalary = employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow(NoSuchElementException::new);
        System.out.println(maxSalary);

        //min salary of employee
        Employee minSalary = employees.stream()
                .min(Comparator.comparing(Employee::getSalary))
                .orElseThrow(NoSuchElementException::new);
        System.out.println(minSalary);

        //count
        long countAllEmployee = employees.size();
        System.out.println(countAllEmployee);

        //reduce
        Double totalSalary = employees.stream().map(Employee::getSalary).reduce(0.0, Double::sum);
        System.out.println(totalSalary);

        //Sort by FirstName and LastName of given Employee Object
        List<Employee> sortByFirstNameAndLastName = employees.stream()
                .sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName)).toList();
        System.out.println("Sorted By FirstName and LastName:: " + sortByFirstNameAndLastName);

    }

}
