package com.interview.utils.inheritanceEx;


class Animal1 {}

class TerrestrialAnimal extends Animal{}
class AquaticAnimal extends Animal{}

class Lion1 extends TerrestrialAnimal {}
class Goat extends TerrestrialAnimal {}

class Fish extends AquaticAnimal {}
class Whale extends AquaticAnimal {}


/** JavaMadeSoEasy.com */
public class MyClass1{
    public static void main(String[] args) {
        Object a = new Animal();  //Animal IS-A Object


        Object aa1 = new AquaticAnimal(); //AquaticAnimal IS-A Object
        Animal aa2 = new AquaticAnimal(); //AquaticAnimal IS-A Animal


        Object f1 = new Fish(); //Fish IS-A Object
        Animal f2 = new Fish(); //Fish IS-A Animal
        AquaticAnimal f3 = new Fish(); //Fish IS-A AquaticAnimal

    }
}