package com.coding.interview.streams;

public final class Person {
    private final int id;
    private final String name;

    public Person(Integer id, String name) {
        this.id = id;
        //  this.id = 9;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class Hello {
    public static void main(String[] args) {
        Person p1 = new Person(null, "Avishak");
        Person p2 = new Person(null, "Avishak");

        if (p1.equals(p2)) {

        }

        if (p1 == p2) {

        }
    }
}
