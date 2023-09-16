package com.interview.utils.component;

interface CommonCar {

    void accelerate();
    void brake();
}

interface LuxuryCar {
    void powerWindows();
}

interface PartialLuxuryCar {
    void abs();
}


class Maruti800 implements CommonCar, PartialLuxuryCar {
    @Override
    public void accelerate() {
        System.out.println("Calling accelerate method");
    }

    @Override
    public void brake() {
        System.out.println("brake method() calling");
    }

    @Override
    public void abs() {
        System.out.println("Call abs()");
    }
}

class Creta implements CommonCar, PartialLuxuryCar {

    @Override
    public void accelerate() {
        // Implementation specific to Creta
    }

    @Override
    public void brake() {
        // Implementation specific to Creta
    }

    @Override
    public void abs() {

    }
}

class BMW implements CommonCar, LuxuryCar {

    @Override
    public void accelerate() {
        // Implementation specific to BMW
    }

    @Override
    public void brake() {
        // Implementation specific to BMW
    }

    @Override
    public void powerWindows() {
        // Implementation specific to luxury cars like BMW
    }
}



