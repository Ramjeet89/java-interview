package com.interview.utils.alight;

public class GCDemo {
    GCDemo gcDemo3;

    public static void main(String[] args) {
        GCDemo gcDemo1 = new GCDemo();
        GCDemo gcDemo2 = new GCDemo();
        gcDemo1.gcDemo3 = gcDemo2;
        gcDemo2.gcDemo3 = gcDemo1;

        gcDemo1 = null;
        gcDemo2 = null;
        gcDemo1 = gcDemo2;

        // gc = null;
        //System.gc();
        Runtime.getRuntime().gc();
        System.out.println("Main method is done");

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method is done");
    }
}
