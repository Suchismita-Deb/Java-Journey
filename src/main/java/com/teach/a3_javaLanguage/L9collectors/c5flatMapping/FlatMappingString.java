package com.teach.a3_javaLanguage.L9collectors.c5flatMapping;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class FlatMappingString {
    public static void main(String[] args) {
        List<String> list = List.of("one", "two wings", "three tyres", "four turbo combustion engine");

        //Fnd a list of each word separated without space
        List<String> collect = list.stream()
                .collect(
                        flatMapping(str -> Stream.of(str.split(" ")), toList()
                        )
                );

        System.out.println(collect);
    }
}
