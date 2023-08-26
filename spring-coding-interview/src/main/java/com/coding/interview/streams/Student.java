package com.coding.interview.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private String location;
    private int marks;


    public Student() {

    }

    public Student(String name, String location, int marks) {
        this.name = name;
        this.location = location;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return marks == student.marks && Objects.equals(name, student.name) && Objects.equals(location, student.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", location='" + location + '\'' +
                '}';
    }

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("John", "Texas", 85),
                new Student("Jane", "California", 90),
                new Student("Michael", "Texas", 78),
                new Student("Emily", "Texas", 92),
                new Student("David", "New York", 88)
        );

        IntSummaryStatistics total = students.stream()
                .filter(s -> s.getLocation().equals("Texas"))
                .mapToInt(Student::getMarks)
                .summaryStatistics();

        System.out.println("Total: " + total.getSum());
        System.out.println("Count:" + total.getCount());
        System.out.println("Max:" + total.getMax());
        System.out.println("Min:" + total.getMin());
        System.out.println("Avg:" + total.getAverage());
//or

        int totalMarksFromTexas = students.stream()
                .filter(student -> student.getLocation().equals("Texas"))
                .mapToInt(Student::getMarks)
                .sum();
        System.out.println("Total marks of students from Texas: " + totalMarksFromTexas);


    }
}
