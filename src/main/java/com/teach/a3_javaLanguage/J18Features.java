package com.teach.a3_javaLanguage;

import java.util.ArrayList;
import java.util.List;



public class J18Features {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        var a = "42";

        System.out.println(a.getClass().getSimpleName());

    }

    public List<String> display(String str){
        return new ArrayList<>();
    }

    public void display(String str, String str2){
        return ;
    }
}

interface ISomething1 {
    void doSomething();
}
interface ISomething2 {
    void doSomething();
}

