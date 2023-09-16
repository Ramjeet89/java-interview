package com.interview.utils.javacodes;

import java.util.*;
public class EmployeeClass {

    private String firstName;
    private String lastName;
    private String city;

    public EmployeeClass(String firstName, String lastName, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeClass that = (EmployeeClass) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, city);
    }

    @Override
    public String toString() {
        return "EmployeeClass{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<EmployeeClass> employees = new ArrayList<>();
        employees.add(new EmployeeClass("John", "Doe", "New York"));
        employees.add(new EmployeeClass("Jane", "Smith", "London"));
        employees.add(new EmployeeClass("John", "Doe", "New York")); // Duplicate
        employees.add(new EmployeeClass("Alice", "Johnson", "San Francisco"));

        List<EmployeeClass> uniqueElement = employees.stream().distinct().toList();
        uniqueElement.forEach(System.out::println);
    }
}
