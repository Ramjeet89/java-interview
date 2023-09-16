package com.solidprinciple;

import java.util.ArrayList;
import java.util.List;

class InterviewDemo {
    public static void main(String[] args) {
        String str = "ram";
        str = str + "jeet";
        System.out.println(str);

        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 4, 5, 3));
        List<Integer> list2 = new ArrayList<>(List.of(1, 2, 5, 6));

        // Find common elements using Stream API
        List<Integer> commonElements = list1.stream()
                .filter(list2::contains)
                .toList(); // Requires Java 16+; use .collect(Collectors.toList()) for earlier versions

        // Print the common elements
        System.out.println("Common elements: " + commonElements);
    }
}
