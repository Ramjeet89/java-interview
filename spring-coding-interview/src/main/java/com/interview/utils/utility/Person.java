package com.interview.utils.utility;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public enum Sex {
        MALE, FEMALE
    }

    private String name;
    private int age;
    private String email;
    Sex gender;

    public Person() {

    }

    public Person(String name, int age, String email, Sex gender) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public void printPerson() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }

    public static List<Person> generateDefaultList() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Shaabir", 19, "shaabir@g.com", Sex.MALE));
        persons.add(new Person("Trigger", 26, "trigger@g.com", Sex.MALE));
        persons.add(new Person("Fukkra", 18, "fukkra@g.com", Sex.MALE));
        persons.add(new Person("Gita", 40, "gita@g.com", Sex.FEMALE));
        persons.add(new Person("Seema", 31, "seema@g.com", Sex.FEMALE));
        return persons;
    }
}
