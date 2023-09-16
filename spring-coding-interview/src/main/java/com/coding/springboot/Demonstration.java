package com.coding.springboot;

import java.util.stream.IntStream;

public class Demonstration {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10).filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
