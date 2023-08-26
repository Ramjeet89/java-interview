package com.coding.interview.logicbig;

import java.util.stream.IntStream;

public class LazyExample {
    public static void main(String[] args) {
        IntStream stream = IntStream.range(1, 5);
        stream = stream.peek(i -> LogUtil.log("starting", i)).filter(i -> {
            LogUtil.log("starting", i);
            return i % 2 == 0;
        }).peek(i -> LogUtil.log("post filtring", i));
        LogUtil.log("involving terminal method count");
        LogUtil.log("Count is " + stream.count());
    }
}
