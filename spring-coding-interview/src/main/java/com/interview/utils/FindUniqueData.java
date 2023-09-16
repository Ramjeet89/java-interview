package com.interview.utils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindUniqueData {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> combinedList = new ArrayList<>(list1);
        combinedList.addAll(list2);
        List<Integer> result = combinedList.stream()
                .filter(n -> !(list1.contains(n) && (list2.contains(n))))
                .distinct()
                .toList();
        System.out.println(result);

        String input = "iloveindiailovefood";
        Map<String,Long> mapcount = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mapcount);

    }
}
