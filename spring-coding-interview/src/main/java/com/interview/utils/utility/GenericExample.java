package com.interview.utils.utility;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {

        /*IntegerCounter integerCounter = new IntegerCounter(1);
        integerCounter.print();

        DoubleCounter doubleCounter = new DoubleCounter(2.0);
        doubleCounter.print();*/

        Counter<Integer>  iCounter = new Counter<>(1);
        iCounter.print();

        Counter<Double> dCounter = new Counter<>(2.0);
        dCounter.print();
        //not allow
      //  Counter<String> sCounter = new Counter<>("Hello");

//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add("1");
//        arrayList.add(1);
//        Integer i =  arrayList.get(0);

        print(1,4);
        print("Ramjeet","Mahto");

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        print(intList);

    }

    private static <T, U> T print(T t, U u){
        System.out.println(t);
        System.out.println(u);
        return  t;
    }

    private static void print(List<? extends Number> list){
        System.out.println(list);
    }
}
