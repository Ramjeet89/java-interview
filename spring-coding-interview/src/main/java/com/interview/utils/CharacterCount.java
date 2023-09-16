package com.interview.utils;

import java.util.Arrays;

public class CharacterCount {

   /* public static void main(String[] args) {
        String input = "AADBBCQQR";
        String output = compressString(input);
        System.out.println(output); // Output: 2AD2BC2QR
    }

    public static String compressString(String input) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 0; i < input.length(); i++) {
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                if (count > 1) {
                    compressed.append(count);
                }
                compressed.append(input.charAt(i));
                count = 1;
            }
        }
        return compressed.toString();
    }
}
*/

 // public class CharacterCountJava8 {
 public static void main(String[] args) {
        String input = "AADBBCQQR";
        String output = compressString(input);
        System.out.println(output); // Output: 2AD2BC2QR
    }

    public static String compressString(String input) {
        return Arrays.stream(input.split(""))
                .collect(StringBuilder::new,
                        (sb, c) -> {
                            int lastIndex = sb.length() - 1;
                            if (lastIndex >= 0 && sb.charAt(lastIndex) == c.charAt(0)) {
                                sb.setCharAt(lastIndex - 1, (char) (sb.charAt(lastIndex - 1) + 1));
                            } else {
                                if (lastIndex >= 0) {
                                    sb.append(sb.charAt(lastIndex));
                                }
                                sb.append("1").append(c);
                            }
                        },
                        StringBuilder::append)
                .toString();
    }
}

