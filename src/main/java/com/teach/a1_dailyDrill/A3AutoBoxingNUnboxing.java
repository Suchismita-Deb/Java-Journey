package com.teach.a1_dailyDrill;

import java.util.ArrayList;
import java.util.List;

public class A3AutoBoxingNUnboxing {
    public static void main(String[] args) {
        int i = 5;
        long j = 105L;

        //passed the int, will get converted to Integer object at Runtime
        doSomething(i);

        List<Long> list = new ArrayList<>();
        //autoboxing to add primitive type in collection classes
        list.add(j);
    }

    private static void doSomething(Integer wrapperInt) {
        //unboxing, at runtime Integer.intValue() is called implicitly to return int
        int j = wrapperInt;
        //unboxing, Integer is passed where int was expected
        doPrimitive(wrapperInt);
    }

    private static void doPrimitive(int i) {
    }
}
