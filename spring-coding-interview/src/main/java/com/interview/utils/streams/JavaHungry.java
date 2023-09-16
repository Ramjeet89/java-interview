package com.interview.utils.streams;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaHungry {
    public static void main(String[] args) {

        //evenNumber
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        myList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        //flatMap
        List<Integer> evens = Arrays.asList(2, 4, 6);
        List<Integer> odds = Arrays.asList(3, 5, 7);
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);
        List<Integer> numbers = Stream.of(evens, odds, primes).flatMap(list -> list.stream()).toList();
        System.out.println("Filtered list:: " + numbers);

        //peek ()
        final List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        final List<Integer> ans = list.stream()
                .filter(value -> value % 2 == 0)
                .peek(value -> System.out.println("Filtered: " + value))
                .map(value -> value * 10).toList();
        System.out.println(Arrays.toString(ans.toArray()));

        // map()
        List<String> names = Arrays.asList("Saket", "Treover", "Franklin", "Michael");
        names.forEach(System.out::println);

        List<String> upperCase = names.stream().map(String::toUpperCase).toList();
        upperCase.forEach(System.out::println);

        //flatMap()
        List<List<String>> name = Arrays.asList(
                Arrays.asList("Saket", "Treover"),
                Arrays.asList("John", "Michael"),
                Arrays.asList("Swaan", "Franklin"),
                Arrays.asList("Jonty", "sean"));

        List<String> start = name.stream().flatMap(firstName -> firstName.stream()).filter(s -> s.startsWith("S")).toList();
        start.forEach(System.out::println);

        String[] languages = {"Java", "Python", "JavaScript"};
        Stream numbers1 = Stream.of(languages);
        numbers1.forEach(System.out::println);


        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7);
        stream.parallel().forEach(System.out::println);

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list1.parallelStream().forEach(System.out::println);

        //Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<Integer> myList1 = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        myList1.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);

        //How to find duplicate elements in a given integers list in java using Stream functions?
        List<Integer> myList2 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        Set<Integer> set = new HashSet<>();
        myList2.stream().filter(n -> !set.add(n)).forEach(System.out::println);


        //Given the list of integers, find the first element of the list using Stream functions?
        List<Integer> myList3 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        Optional<Integer> f = myList3.stream().findFirst();
        System.out.println("First: " + f);
        //myList3.stream().findFirst().ifPresent(System.out::println);

        //Given a list of integers, find the total number of elements present in the list using Stream functions?
        List<Integer> myList4 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        long count = myList4.stream().count();
        System.out.println("Total Element: " + count);

        // Given a list of integers, find the maximum value element present in it using Stream functions?
        List<Integer> myList5 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        int max = myList5.stream().max(Integer::compareTo).get();
        System.out.println("Max: " + max);

        //Given a String, find the first non-repeated character in it using Stream functions?
        String input = "Java articles are Awesome";
        Character result = input.chars()
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        System.out.println(result);

        //or
        Map<String, Long> findDuplicate = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));
        findDuplicate.forEach((ch, c) -> System.out.println(ch + ":" + count));

        //Given a String, find the first repeated character in it using Stream functions?
        String input1 = "Java articles are Awesome";
        Character result1 = input1.chars()
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1L)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        System.out.println(result1);

        //Given a list of integers, sort all the values present in it using Stream functions?
        List<Integer> myList6 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        myList6.stream().sorted().forEach(System.out::println);

        //Given a list of integers, sort all the values present in it in descending order using Stream functions?
        System.out.println("=================================================");
        List<Integer> myList7 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        myList7.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));

        //How will you get the current date and time using Java 8 Date and Time API?
        System.out.println("Current Data: " + LocalDate.now());
        System.out.println("Current Time: " + LocalTime.now());
        System.out.println("Current Data and Time: " + LocalDateTime.now());

        //Write a Java 8 program to concatenate two Streams?
        List<String> listA = Arrays.asList("Java", "8");
        List<String> listB = Arrays.asList("explained", "through", "programs");

        Stream<String> concatenate = Stream.concat(listA.stream(), listB.stream());
        concatenate.forEach(str -> System.out.print(str + " "));

        //Java 8 program to perform cube on list elements and filter numbers greater than 50
        List<Integer> integerList = Arrays.asList(4, 5, 6, 7, 1, 2, 3);
        integerList.stream().map(i -> i * i * i).filter(i -> i > 50).forEach(System.out::println);

        //Write a Java 8 program to sort an array and then convert the sorted array into Stream?
        int arr[] = {99, 55, 203, 99, 4, 91};
        Arrays.parallelSort(arr);
        Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
        System.out.println();
        //How to use map to convert object into Uppercase in Java 8?
        List<String> nameLst = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(nameLst);

        //. How to count each element/word from the String ArrayList in Java8?
        List<String> letters = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String, Long> countLetters = letters.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countLetters);

        //How to find only duplicate elements with its count from the String ArrayList in Java8?
        Map<String, Long> namesCount = letters.stream().filter(x -> Collections.frequency(letters, x) > 1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(namesCount);

        String s = "string data to count each character";
        Map<String, Long> map = Arrays.stream(s.split(""))
                .map(String::toLowerCase)
                .collect(Collectors
                        .groupingBy(str -> str,
                                LinkedHashMap::new, Collectors.counting()));
        map.forEach((ch, co) -> System.out.print(ch + " : " + count));


    }


    public static boolean containsDuplicate(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().toList();
        Set<Integer> set = new HashSet<>(list);
        if (set.size() == list.size()) {
            return false;
        }
        return true;
    }
}
