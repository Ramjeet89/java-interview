package com.interview.utils.abstraction.abstracts;

abstract class TerrestrialAnimals {
    void habitat() {
        System.out.println("Habitat of Terrestrial animal is land");
    }

    abstract void food();
}

class Lion extends TerrestrialAnimals {
    @Override
    void food() {
        System.out.println("Lion eat - flesh");
    }
}

class Goat extends TerrestrialAnimals {
    @Override
    void food() {
        System.out.println("Goat eat - grass");
    }
}

public class MyClass {
    public static void main(String[] args) {
        TerrestrialAnimals lion = new Lion();

        lion.food();
        lion.habitat();

        TerrestrialAnimals goat = new Goat();
        goat.food();
        goat.habitat();

    }
}
