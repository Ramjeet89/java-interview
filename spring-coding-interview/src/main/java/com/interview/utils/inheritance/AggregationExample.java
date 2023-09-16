package com.interview.utils.inheritance;


/*
Aggregation:

 Aggregation represents a "whole-part" or "container-contained" relationship between classes,
 where one class (the whole) contains or is composed of another class (the part),
 but the part can exist independently of the whole. Aggregation is typically represented
 by a weaker association between objects.
 */
class Department {
    private String name;
    // Other attributes and methods
}

class Employee {
    private String name;
    private Department department; // Aggregation: Employee has a Department
    // Other attributes and methods
}


public class AggregationExample {

}
