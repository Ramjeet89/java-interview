package com.interview.utils.coding;

@FunctionalInterface
interface Sayable {
    void say(String msg);
}


public class FunctionalInterfaceExample implements Sayable {
    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample f = new FunctionalInterfaceExample();
        f.say("Hello java");
    }
}
