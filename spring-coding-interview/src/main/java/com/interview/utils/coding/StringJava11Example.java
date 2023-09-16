package com.interview.utils.coding;

public class StringJava11Example {
    public static void main(String[] args) {
      /*  System.out.println("".isBlank());//true
        String s = "Ramjeet";
        System.out.println(s.isBlank());//false
        String s1 = "";
        System.out.println(s1.isBlank());//true

        String str = "JD\nJD\nJD\nJD";
        System.out.println(str);

        System.out.println(str.lines().collect(Collectors.toList()));
*/
        String str1 = " JD ";
        System.out.print("Start");
        System.out.print(str1.strip());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(str1.stripLeading());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(str1.stripTrailing());
        System.out.println("End");

        String str2 = "=".repeat(5);
        System.out.println(str2);


    }
}


/*
output

StartJDEnd
StartJD End
Start JDEnd

 */