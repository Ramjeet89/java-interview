package com.interview.utils.alight;

interface AA{
    void m1();
}

interface BB{
    void m1(String s);
}

public class Demo implements AA,BB{
    @Override
    public void m1() {
        System.out.println("From AA or BB");
    }

    @Override
    public void m1(String s) {
        System.out.println("Length of the String:  "+s.length());
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.m1();
        d.m1("Hello");
    }
}
