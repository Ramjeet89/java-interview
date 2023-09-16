package com.interview.utils.code;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {

   /*     Map<String,String> map = new HashMap<>();
        map.put("name","Ramjeet");
        map.put("name","Mahto");
        System.out.println(map.get("name"));
        System.out.println(map.size());
        System.out.println(map);*/
        int[] arr = {1, 34, 5, 32, 2};
      /*  int secondLargest = Arrays.stream(arr)
                .boxed() // Convert int[] to Stream<Integer>
                .sorted((a, b) -> b.compareTo(a)) // Sort in descending order
                .distinct() // Remove duplicates (optional)
                .skip(1) // Skip the first element (largest)
                .findFirst() // Find the second largest
                .orElse(-1); // Default value if array is empty
        System.out.println("Second largest number: " + secondLargest);*/

       /* List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(Boolean.parseBoolean("abcd"));
        list.add(Boolean.TRUE);
        System.out.println(list.size());
        System.out.print(list.get(1) instanceof Boolean);
*/
       /* String s = "Ramjeet";
        s = s.toLowerCase();
        System.out.println("Vowels in the string::");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(ch + " ");
            }
        }

        //or
        System.out.println("Vowels in the string::");
        s.chars().mapToObj(ch -> (char) ch).filter(
                ch -> "aeiou".contains(String.valueOf(ch))).forEach(System.out::println);
*/

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        nums.stream().filter(n -> n % 2 == 0).sorted(Comparator.reverseOrder()).forEach(System.out::println);


    }
}
