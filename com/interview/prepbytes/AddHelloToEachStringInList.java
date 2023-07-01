package com.interview.prepbytes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddHelloToEachStringInList {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Joe","Angela");

        System.out.println(names.stream()
                                .map(e -> "Hello".concat(e))
                                .collect(Collectors.joining(",")));

    }
}
