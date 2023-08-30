package com.coding.interview.javacodes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test {
  /*  public void display(int a,double b){
        System.out.println(a+b);
    }

    public  double display(int r,double s){
        return (r+s);
    }*/

    public static void main(String[] args) throws IOException {
       /* int result = 0;
        Test t = new Test();
        Object o = t;

        if (o == t)
            result = 1;
        if (o != t)
            result = result + 10;
        if (o.equals(o))
            result = result + 100;
        System.out.println("Result: " + result);
        //Output: 101 b
        */


        String s = "Welcome";
        System.out.println("Character at 3rd position "+s.charAt(3));

        String values = "Word1 Word2 Word3 Word4";
        String val[] = values.split(" ");
        Arrays.sort(val);
        for (String i:val)
            System.out.print(i);

        //Test t = new Test(5);

      /*  String str1;
        BufferedReader obj1 = new BufferedReader(new InputStreamReader(System.in));
        do{
            str1 = (char)obj1.readLine();
            System.out.println(str1);
        }
        while (!str1.equals("strong"));*/
    }


}
