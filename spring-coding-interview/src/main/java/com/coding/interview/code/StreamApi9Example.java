package com.coding.interview.code;

import java.util.List;

public class StreamApi9Example {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 1, 5, 6, 8);
        List<Integer> evenNumber = numbers.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(evenNumber);

        List<Integer> takeWhile = numbers.stream().takeWhile(i -> i % 2 == 0).toList();
        System.out.println(takeWhile);
    }
}
