package com.coding.interview.utils;

import java.util.*;
import java.util.stream.Collectors;

public class FindOccuranceOgGivenString {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 28, 87, 10, 20, 76, 28, 80, 80, 80);
        Set<Integer> set = new HashSet<>();
        list.stream().filter(x -> !set.add(x)).collect(Collectors.toSet()).forEach(System.out::println);

        IntSummaryStatistics summary = list.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("Max:: " + summary.getMax());
        System.out.println("Min:: " + summary.getMin());
        System.out.println("Avg:: " + summary.getAverage());
        System.out.println("Sum:: " + summary.getSum());
        System.out.println("Count:: " + summary.getCount());


        List<Integer> list1 = Arrays.asList(3, 2, 12, 15, 5, 6, 11, 13);
        long count = list1.stream().filter(i -> i % 2 == 0).count();
        System.out.println(count);

        IntSummaryStatistics statistics = list1.stream().filter(i -> i % 2 == 0).mapToInt(i -> i).summaryStatistics();
        System.out.println(statistics.getCount());

       // IntSummaryStatistics stats = people.stream().collect(Collectors.summarizingInt(Person::getDependents));


    }
}
