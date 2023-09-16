package com.interview.utils.alight;

public class SeparateCharactersAndDigits {
    public static void main(String[] args) {
        String str = "ram123jeet";
        // Separate characters and digits
        StringBuilder characters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.append(c);
            } else {
                characters.append(c);
            }
        }

        String characterPart = characters.toString();
        String digitPart = digits.toString();
        System.out.println("Characters: " + characterPart);
        System.out.println("Digits: " + digitPart);

       /* String s = "100";
        int num = Integer.parseInt(s);
        System.out.println(num);*/
    }
}
