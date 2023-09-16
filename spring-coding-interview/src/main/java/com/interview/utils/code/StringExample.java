package com.interview.utils.code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringExample {
    public static void main(String[] args) {
        String str = "Fear leads to anger; anger leads to hatred; hatred leads to conflict; conflict leads to suffering.";
       /* String arr[] = str.split(" ");
        int count = 1;
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
*/
        //or
        System.out.println("Different methods ");
        Map<String, Long> countOccurance = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        countOccurance.forEach((words, c) -> System.out.println(words + ":" + c));

        //Write a program to find the sum of the entire array result using java 8 streams.
        List<Integer> ls = Arrays.asList(1, 2, -3, 4, 5, 6, -7, 8, 9, 10);
        System.out.println(
                (Integer) ls.stream().map(x -> {
                    if (x < 0 || x % 2 == 0) {
                        return x;
                    } else {
                        return x * 2;
                    }
                }).mapToInt(Integer::intValue).sum());

        //Write a program to find even numbers from a list of integers and multiply with 2 using stream java 8
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> ans = list.stream().filter(n -> n % 2 == 0).map(n -> n * 2).toList();
        ans.forEach(System.out::println);
    }
}
