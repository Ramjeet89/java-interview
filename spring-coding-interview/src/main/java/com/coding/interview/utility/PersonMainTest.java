package com.coding.interview.utility;

import java.util.List;
import java.util.function.Predicate;

public class PersonMainTest {

    @FunctionalInterface
    interface CheckPerson {
        boolean test(Person p);
    }

    static class CheckPersonEligibleForSelectiveSearch implements CheckPerson {
        @Override
        public boolean test(Person p) {
            return p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
        }
    }

    public static void printPersonOlderThen(List<Person> people, int age) {
        for (Person p : people) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    public static void printPersonWithinAgeRange(List<Person> people, int lower, int higher) {
        for (Person p : people) {
            if (lower <= p.getAge() && p.getAge() < higher) {
                p.printPerson();
            }
        }
    }

    public static void printPeople(List<Person> people, CheckPerson tester) {
        for (Person p : people) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    public static void printPeopleWithPredicate(List<Person> people, Predicate<Person> tester) {
        for (Person p : people) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    public static void main(String[] args) {
        List<Person> people = Person.generateDefaultList();
       // printPersonOlderThen(people, 20);
       // printPersonWithinAgeRange(people, 20, 22);
        //printPeople(people, new CheckPersonEligibleForSelectiveSearch());

        /*printPeople(people, new CheckPerson() {
            @Override
            public boolean test(Person p) {
                return p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
            }
        });*/

        //or using lambda expression
        printPeople(people, p  -> p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25);
        //withPredicate
        printPeopleWithPredicate(people, p  -> p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25);
    }
}
