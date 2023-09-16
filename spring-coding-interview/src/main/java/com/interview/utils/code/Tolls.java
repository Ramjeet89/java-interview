package com.interview.utils.code;

public class  Tolls{
  /*  public static void main(String... warmth) {
        String teams = new String("a");
        String s1 = teams.concat("b");
        String s2 = teams.concat("c");
        String s3 = teams.concat("d");
        System.out.println(teams + "-" + s1 + "-" + s2 + "-" + s3);
    }*/
    //output: a-ab-ac-ad

    private static int yesterday = 1;
    int tomorrow = 10;
    public static void main(String[] args) {
        Tolls tolls = new Tolls();
        int today=20, tomorrow = 40;
        System.out.print(today + tolls.tomorrow + tolls.yesterday);
    }
    //Output: 31
}

