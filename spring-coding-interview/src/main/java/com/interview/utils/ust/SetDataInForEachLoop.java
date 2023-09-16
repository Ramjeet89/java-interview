package com.interview.utils.ust;

import java.util.ArrayList;
import java.util.List;

public class SetDataInForEachLoop {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Using a lambda expression to set data on each element
        names.forEach(name -> setNameToUpperCase("Ramjeet"));
        // Printing the updated list
        System.out.println(names);
    }

    public static void setNameToUpperCase(String name) {
        // Modify the data (e.g., set it to uppercase) on each element
        name = name.toUpperCase();
    }
}

