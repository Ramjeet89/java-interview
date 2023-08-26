package com.coding.interview.alight;

import java.util.*;

class Employees implements Comparable<Employees> {
    private String name;
    private int age;

    public Employees(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Employees other) {
        return Integer.compare(this.age, other.age);
    }
}

 class OldestEmployeeExample {
    public static void main(String[] args) {
        List<Employees> employees = new ArrayList<>();
        employees.add(new Employees("Alice", 30));
        employees.add(new Employees("Bob", 25));
        employees.add(new Employees("Charlie", 35));

        // Using Comparator to sort employees based on age
        employees.sort(Comparator.comparing(Employees::getAge));

        // Fetch the oldest employee
        Employees oldestEmployee = employees.get(0);
        System.out.println("Oldest employee: " + oldestEmployee.getName() + " (" + oldestEmployee.getAge() + " years old)");


        //or
        // Using Stream API to find the oldest employee
        Optional<Employees> oldestEmployees = employees.stream()
                .min(Comparator.comparingInt(Employees::getAge));

        // Check if the oldest employee is present and print their details
        oldestEmployees.ifPresent(employee ->
                System.out.println("Oldest employee: " + employee.getName() + " (" + employee.getAge() + " years old)"));
    }
}
