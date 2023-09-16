package com.interview.utils.javacodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertListOfString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> data = names.stream().map(String::toUpperCase).toList();
        System.out.println("Uppercase names:: " + data);

        //Find the highest number in a list
        List<Integer> numbers = Arrays.asList(12, 45, 3, 67, 89, 34);
        int high = numbers.stream().max(Integer::compareTo).get();
        System.out.println("Highest number: " + high);

        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "grape");
        List<String> uppercaseWords = words.stream().map(String::toUpperCase).toList();
        System.out.println("Original words: " + words);
        System.out.println("Uppercase words:: " + uppercaseWords);

        int sum = IntStream.rangeClosed(1, 10).filter(n -> n % 2 == 0).sum();
        System.out.println("Sum of even numbers: " + sum);

        List<Integer> evens = Arrays.asList(2, 4, 6);
        List<Integer> odds = Arrays.asList(3, 5, 7);
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);
        List<Integer> flatMapNum = Stream.of(evens, odds, primes).flatMap(l -> l.stream()).toList();
        System.out.println("FlatMap list: " + flatMapNum);

        String joined = words.stream().map(String::toUpperCase).collect(Collectors.joining(":"));
        System.out.println("Joined: " + joined);

        String someString = "123123";
        boolean isNumeric = someString.chars().allMatch(Character::isDigit);
        System.out.println("Check given String is a number or not:: "+isNumeric);
    }
}
