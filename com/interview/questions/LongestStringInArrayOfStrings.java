package com.interview.questions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestStringInArrayOfStrings {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple","Banana","Orange","Apricot");
        System.out.println(strings.stream().collect(Collectors.toMap(s -> s, String::length))
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Comparator.comparingInt(Map.Entry::getValue)))
                .findFirst().get());


    }
}
