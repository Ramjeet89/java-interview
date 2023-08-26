package com.coding.interview.utils;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeExample {
    private int id;
    private String name;
    private long salary;
    private List<String> citiesWorkedIn;

    public EmployeeExample() {

    }

    public EmployeeExample(int id, String name, long salary, List<String> citiesWorkedIn) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.citiesWorkedIn = citiesWorkedIn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCitiesWorkedIn() {
        return citiesWorkedIn;
    }

    public void setCitiesWorkedIn(List<String> citiesWorkedIn) {
        this.citiesWorkedIn = citiesWorkedIn;
    }

    @Override
    public String toString() {
        return "EmployeeExample{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", citiesWorkedIn=" + citiesWorkedIn +
                '}';
    }

    public static void main(String[] args) {
        List<EmployeeExample> employeeExampleList = new ArrayList<>();
        employeeExampleList.add(new EmployeeExample(78, "John", 1000, List.of("US")));
        employeeExampleList.add(new EmployeeExample(18, "Amit", 5000, List.of("Bangalore")));
        employeeExampleList.add(new EmployeeExample(58, "Shiva", 6000, List.of("Hyderabad")));
        employeeExampleList.add(new EmployeeExample(38, "Mohan", 3000, List.of("Chennai")));
        employeeExampleList.add(new EmployeeExample(28, "Dinesh", 2000, List.of("Pune")));
        employeeExampleList.add(new EmployeeExample(88, "Ronu", 9000, List.of("Delhi")));

   /*     //sort by decending order using java 8
        List<EmployeeExample> sortEmp = employeeExampleList.stream()
                .sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
//                .skip(3)
                .limit(2)
                .toList();
        System.out.println(sortEmp);

        //map and flatmap example

        List<String> citiesWorkeId1 = new ArrayList<>();
        citiesWorkeId1.add("Pune");
        citiesWorkeId1.add("Mumbai");
        citiesWorkeId1.add("Noida");
        citiesWorkeId1.add("Bangalore");
        EmployeeExample e1 = new EmployeeExample(101, "Ramesh", 30000, citiesWorkeId1);

        List<String> citiesWorkeId2 = new ArrayList<>();
        citiesWorkeId2.add("Pune");
        citiesWorkeId2.add("Nagpur");
        citiesWorkeId2.add("Noida");
        citiesWorkeId2.add("Bangalore");
        EmployeeExample e2 = new EmployeeExample(103, "Somesh", 34000, citiesWorkeId2);


        List<String> citiesWorkeId3 = new ArrayList<>();
        citiesWorkeId3.add("Pune");
        citiesWorkeId3.add("Hyderabad");
        citiesWorkeId3.add("Chennai");
        citiesWorkeId3.add("Bangalore");
        EmployeeExample e3 = new EmployeeExample(104, "Kiran", 35000, citiesWorkeId3);

        List<EmployeeExample> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);

        // System.out.println(empList);

        //old ways
//        List<Integer> ids = new ArrayList<>();
//        for (EmployeeExample emp : empList) {
//            ids.add(emp.getId());
//        }
//        System.out.println(ids);

        //new ways
        List<Integer> AllIds = empList.stream().map(EmployeeExample::getId).toList();
        System.out.println(AllIds);
        System.out.println(empList);

        Set<List<String>> citiesWorksIn = empList.stream().map(EmployeeExample::getCitiesWorkedIn).collect(Collectors.toSet());
        System.out.println(citiesWorksIn);
        Set<String> citiesWorkedIn2 = empList.stream().flatMap(e -> e.getCitiesWorkedIn().stream()).collect(Collectors.toSet());
        System.out.println(citiesWorkedIn2);
*/

        //find Highest salary from employee Object
        Optional<Long> secondHighestSalary = employeeExampleList.stream()
                .map(EmployeeExample::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(secondHighestSalary.get());

        //find employee name  who has 2nd second-Highest salary in List
        Optional<String> secondHighestEmployeeName = employeeExampleList.stream()
                .sorted(Comparator.comparingDouble(EmployeeExample::getSalary)
                        .reversed())
                .skip(1)
                .map(EmployeeExample::getName)
                .findFirst();
        if (secondHighestEmployeeName.isPresent()) {
            System.out.println("Employee with the 2nd highest salary: " + secondHighestEmployeeName.get());
        } else {
            System.out.println("No employee found.");
        }
    }
}
