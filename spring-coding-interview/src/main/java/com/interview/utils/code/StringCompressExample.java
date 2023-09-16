package com.interview.utils.code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringCompressExample {
    public static void main(String[] args) {
        String input = "wwwwaaadexxxxxxwww";
        String compressed = compressString(input);
        System.out.println(compressed);
    }
        public static String compressString (String str){
            List<String> compressedList = new ArrayList<>();
            int count = 1;
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(i - 1)) {
                    count++;
                } else {
                    compressedList.add(str.charAt(i - 1) + "" + count);
                    count = 1;
                }
            }
            compressedList.add(str.charAt(str.length() - 1) + "" + count);
            return compressedList.stream().collect(Collectors.joining());
        }
    }



