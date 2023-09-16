package com.interview.utils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Programmer {
    private String name;
    private List<String> skills;

    public Programmer(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", skills=" + skills +
                '}';
    }

    public static void main(String[] args) {
        List<Programmer> listOfProgrammers = List.of(
                new Programmer("Programmer1", List.of("Java", "Python", "Angular")),
                new Programmer("Programmer2", List.of("Ruby", "Angular", "Java")),
                new Programmer("Programmer3", List.of("React", "Spring", "Angular"))
        );

        //using map
        listOfProgrammers.stream().map(Programmer::getName).toList().forEach(System.out::println);

        //using flatMap
        listOfProgrammers.stream().flatMap(p -> p.getSkills().stream()).collect(Collectors.toSet()).forEach(System.out::println);

        triplesDivisibleBy2Sum(5, 10);
    }

    public static void triplesDivisibleBy2Sum(int start, int end) {
        IntStream.rangeClosed(start, end)
                .peek(n -> System.out.println("original element : " + n))         //prints value before multiplying by 3
                .map(n -> n * 3)
                .peek(n -> System.out.println("Tripled element : " + n))          //prints value before filtering
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println("Divisible By 2 element : " + n))   //prints value after filtering but before summing
                .sum();
    }
}