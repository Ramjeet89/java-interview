package com.interview.utils.ust;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class Employee {

    private List<String> name;

    public Employee(List<String> name) {
        this.name = Collections.unmodifiableList(name);
    }

    public List<String> getName() {
        return name;
    }


    public static void main(String[] args) {
        String s = "abac";

        Map<Character, Long> occurance = s.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        occurance.forEach((ch, count) -> System.out.println(ch + "-" + count));
    }
}
