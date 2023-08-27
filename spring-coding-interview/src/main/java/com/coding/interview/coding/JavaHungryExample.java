package com.coding.interview.coding;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaHungryExample {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 25, 10);
        findEvenNumber(myList);
        findOutAllTheNumbersStartingWith1(myList);
        findDuplicateElements(myList);
        findTheFirstElement(myList);
        findTheTotalNumberOfElements(myList);
        findTheMaximumValueElement(myList);
        findTheFirstNoNRepeatedCharacter(myList);
        findTheFirstRepeatedCharacter(myList);
        sortAllTheValuesPresent(myList);
        sortDescendingAllTheValuesPresent(myList);

    }

    //Given a list of integers, sort all the values present in it in descending order using Stream functions?
    private static void sortDescendingAllTheValuesPresent(List<Integer> myList) {
        myList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    //Given a list of integers, sort all the values present in it using Stream functions?
    private static void sortAllTheValuesPresent(List<Integer> myList) {
        myList.stream().sorted().forEach(System.out::println);
    }

    //Given a String, find the first repeated character in it using Stream functions?
    private static void findTheFirstRepeatedCharacter(List<Integer> myList) {
        String input = "Java Hungry Blog Alive is Awesome";
        Character character = input.chars()
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1L)
                .map(Map.Entry::getKey).findFirst().get();
        System.out.println(character);

    }

    //Given a String, find the first non-repeated character in it using Stream functions?
    private static void findTheFirstNoNRepeatedCharacter(List<Integer> myList) {
        String input = "Java Hungry Blog Alive is Awesome";
        Character character = input.chars()
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst().get();
        System.out.println(character);
    }

    //Given a list of integers, find the maximum value element present in it using Stream functions?
    private static void findTheMaximumValueElement(List<Integer> myList) {
        int max = myList.stream().max(Integer::compareTo).get();
        System.out.println(max);
    }

    //Given a list of integers, find the total number of elements present in the list using Stream functions?
    private static void findTheTotalNumberOfElements(List<Integer> myList) {
        long count = myList.stream().count();
        System.out.println(count);
    }

    // Given the list of integers, find the first element of the list using Stream functions?
    private static void findTheFirstElement(List<Integer> myList) {
        myList.stream().findFirst().ifPresent(System.out::println);
    }

    // How to find duplicate elements in a given integers list in java using Stream functions?
    private static void findDuplicateElements(List<Integer> myList) {
        Set<Integer> set = new HashSet<>();
        myList.stream().filter(n -> !set.add(n)).forEach(System.out::println);
    }

    //Given a list of integers, find out all the numbers starting with 1 using Stream functions
    private static void findOutAllTheNumbersStartingWith1(List<Integer> myList) {
        myList.stream().map(s -> s + "") // Convert integer to String
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);
    }

    //Given a list of integers, find out all the even numbers exist in the list using Stream functions?
    private static void findEvenNumber(List<Integer> myList) {
        myList.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
