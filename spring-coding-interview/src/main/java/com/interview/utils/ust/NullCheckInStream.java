package com.interview.utils.ust;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class NullCheckInStream {
    public static void main(String[] args) {
        List<String> values = Arrays.asList("A", "B", null, "C", null, "D");
        List<String> nonNullValues = values.stream().filter(Objects::nonNull).toList();
       // nonNullValues.stream().map(String::toLowerCase).forEach(System.out::println);
        System.out.println(nonNullValues);
    }
}
