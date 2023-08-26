package com.coding.interview.utility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SequentialParallelComparisonExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sumOfStream = numbers.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sumOfStream);

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);

        int sumOfParallelStream = numbers1.parallelStream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sumOfParallelStream);
        System.out.println(sumOfParallelStream);

    }
}
