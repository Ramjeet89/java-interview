package com.coding.interview.logicbig;

import java.util.*;
class Student {
    private int roll;
    private String name;
    private List<String> subjects;

    public Student(int roll, String name, List<String> subjects) {
        this.roll = roll;
        this.name = name;
        this.subjects = subjects;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public List<String> getSubjects() {
        return subjects;
    }
}

public class StudentsWithSubjects {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Alice", Arrays.asList("Math", "Science", "English")));
        students.add(new Student(102, "Bob", Arrays.asList("History", "Math")));
        students.add(new Student(103, "Charlie", Arrays.asList("Science", "Geography")));

        // Using Stream API to find students with subjects "Math" and "Science"
        List<Student> studentsWithSubjects = students.stream()
                .filter(student -> student.getSubjects().contains("Math") && student.getSubjects().contains("Science"))
                .toList();

        // Print details of students with required subjects
        System.out.println("Students with Math and Science subjects:");
        studentsWithSubjects.forEach(student -> System.out.println("Name: " + student.getName() + ", Subjects: " + student.getSubjects()));
    }
}
