package com.interview.utils.code;

import java.util.*;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return id == student.id & Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Student s) {
        if (id == s.id) {
            return 0;
        } else if (id > s.id) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student(101, "Basant");
        Student s2 = new Student(109, "Santosh");
        Student s3 = new Student(105, "Prakash");
        Student s4 = new Student(98, "Ashik");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        // Collections.sort(students);
        //Collections.sort(students,new IdComprator());
      // Collections.sort(students, new NameComprator());
       // System.out.println(students);

        //Using Java8 Sort by name
        List<Student> sortByName = students.stream().sorted(Comparator.comparing(Student::getName)).toList();
        System.out.println("SortBy Student Name: "+sortByName);

        List<Student> sortById = students.stream().sorted(Comparator.comparing(Student::getId)).toList();
        System.out.println("SortBy Student Id: "+sortById);

        List<Student> sortByNameAndId = students.stream().sorted(Comparator.comparing(Student::getName).thenComparing(Student::getId)).toList();
        System.out.println("Sort by both Id and Name: "+sortByNameAndId);
    }
}
