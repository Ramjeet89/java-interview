package com.interview.utils.alight;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StatisticsExample {
    public static void main(String[] args) {
        double[] data = {10.5, 20.3, 15.7, 7.2, 30.1};
        DoubleStream doubleStream = DoubleStream.of(data);
        DoubleSummaryStatistics summaryStatistics = doubleStream.summaryStatistics();
        System.out.println("Result: " + summaryStatistics);

        int[] numbers = {10, 20, 15, 7, 30};
        IntStream intStream = IntStream.of(numbers);
        IntSummaryStatistics summaryStatistics1 = intStream.summaryStatistics();
        System.out.println("Int Summary Result: " + summaryStatistics1);

        long[] num = {10L, 20L, 15L, 7L, 30L};
        LongStream longStream = LongStream.of(num);
        LongSummaryStatistics summaryStatistics2 = longStream.summaryStatistics();
        System.out.println("Long Result: " + summaryStatistics2);

        List<Integer> numbers1 = Arrays.asList(10, 20, 15, 7, 30);
        IntSummaryStatistics summary = numbers1.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("All Statistics Result: " + summary);
    }
}
