package com.interview.utils;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {
        Map<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        concurrentMap.put("One", 1);
        concurrentMap.put("Two", 2);
        concurrentMap.put("Three", 3);

        int value = concurrentMap.get("Two");
        System.out.println("Value for key 'Two': " + value);

        //int oldValue = concurrentMap.replace("Three", 3, 33);
        //System.out.println("Old value for key 'Three': " + oldValue);
        System.out.println("New value for key 'Three': " + concurrentMap.get("Three"));
    }
}
