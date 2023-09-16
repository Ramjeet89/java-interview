package com.interview.utils.inheritance;

/*
1. IS-A Relationship (Inheritance):

    The "IS-A" relationship is also known as inheritance. It represents a relationship between a superclass (parent class)
    and a subclass (child class). In an IS-A relationship, the subclass inherits the properties and behaviors (methods and fields)
    of the superclass. This relationship implies that an object of the subclass is also an object of the superclass.

    In this example, Dog is a subclass of Animal, and it inherits the eat method from the Animal class.
    The "IS-A" relationship implies that a Dog is an Animal.
 */
class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}

public class IS_AInheritanceMain {
    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.bark();
        myDog.eat();
//        Animal a = new Animal();
//        a.eat();
    }
}
