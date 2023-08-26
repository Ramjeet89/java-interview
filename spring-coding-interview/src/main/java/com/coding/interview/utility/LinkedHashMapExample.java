package com.coding.interview.utility;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        Map<Employee, String> employees = new HashMap<>();
        employees.put(new Employee(),"abc");
        employees.put(new Employee(),"xyz");
        //employees.size();
        System.out.println(employees.size());



    }
}
