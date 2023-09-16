package com.interview.utils.inheritance;

/*
Composition:

    Composition is a stronger form of association between classes, where one class (the whole)
    contains or is composed of another class (the part), and the part cannot exist independently
    of the whole. In other words, the lifetime of the part is dependent on the lifetime of the whole.
    If the whole is destroyed, the parts are also destroyed.
 */

class Engines{

}

class Cars{
    private Engines engines;
}

public class CompositionExample {

}
