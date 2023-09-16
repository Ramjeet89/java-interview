package com.interview.utils.inheritanceEx;

interface Animal11 {
}

class TerrestrialAnimal1 implements Animal11 {
}

class AquaticAnimal1 implements Animal11 {
}

class Lion11 extends TerrestrialAnimal1 {
}

class Goat1 extends TerrestrialAnimal1 {
}

class Fish1 extends AquaticAnimal1 {
}

class Whale1 extends AquaticAnimal1 {
}


/**
 * JavaMadeSoEasy.com
 */
public class MyClass2 {
    public static void main(String[] args) {

        Object aa1 = new AquaticAnimal1(); //AquaticAnimal IS-A Object
        Animal11 aa2 = new AquaticAnimal1(); //AquaticAnimal IS-A Animal


        Object f1 = new Fish1(); //Fish IS-A Object
        Animal11 f2 = new Fish1(); //Fish IS-A Animal
        AquaticAnimal1 f3 = new Fish1(); //Fish IS-A AquaticAnimal

    }
}