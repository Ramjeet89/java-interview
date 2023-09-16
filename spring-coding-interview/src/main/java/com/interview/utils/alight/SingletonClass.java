package com.interview.utils.alight;

public class SingletonClass {
    private static volatile SingletonClass INSTANCE;
    private SingletonClass() {
        //private constructor to prevent instantiation from other class
    }
    public static SingletonClass getINSTANCE() {
        if (INSTANCE == null) { //check -1
            synchronized (SingletonClass.class) {
                if (INSTANCE == null) { // Check-2 (inside synchronized block)
                    INSTANCE = new SingletonClass();
                }
            }
        }
        return INSTANCE;
    }
}
/*
    The volatile keyword consumes that any read or write to the instance variable
    is directly performed on the main memory, preventing any visibility issues among threads.

    The first if check (Check-1) is used to avoid the expensive synchronization overhead if the instance is already created

    Inside the synchronized block, the second if check (Check-2) ensures that if two threads simultaneously enter
    the synchronized block, only one of them will create the instance while the other waits.

    This technique improves performance by reading by reducing the used for synchronized after the instance is created
 */
