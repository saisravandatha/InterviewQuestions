package com.interview.streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDistinctStringInList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sai","Sai","Sravan","Datha");

        List<String> distinctNames = names.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue()<=1).map(e -> e.getKey()).collect(Collectors.toList());

        System.out.println(distinctNames);

    }
}


