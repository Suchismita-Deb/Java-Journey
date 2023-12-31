package com.teach.a4_designPatterns.creational.builder.lombok;


public class Runner {
    public static void main(String[] args) {
        DemoBuilder demoBuilder = DemoBuilder.builder()
                .name("Test")
                .build();

        System.out.println(demoBuilder);
    }
}
