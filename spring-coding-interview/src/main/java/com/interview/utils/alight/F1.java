package com.interview.utils.alight;

@FunctionalInterface
public interface F1 {
    void m1();
}


@FunctionalInterface
 interface F2{

    void m2();
}

class F3 implements F1, F2 {

    /**
     *
     */
    @Override
    public void m1() {

    }

    /**
     *
     */
    @Override
    public void m2() {

    }
}