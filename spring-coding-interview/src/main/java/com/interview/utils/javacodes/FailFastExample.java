package com.interview.utils.javacodes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FailFastExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apples");
        set.add("Banana");
        set.add("ORange");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String fruit = iterator.next();
            System.out.println(fruit);

            //Simulate concurrent modification
            if(fruit.equals("Banana")){
                set.remove(fruit); //This will cause a CuncurrentModificationException
            }
        }
    }
}
