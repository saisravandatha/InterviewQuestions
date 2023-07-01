package com.interview.questions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(89);
        list1.add(25);

        List<Integer> list2 = new ArrayList<>();
        list2.add(89);
        list2.add(25);
        list2.add(0);

        Stream<Integer> stream1 = list1.stream();
        Stream<Integer> stream2 = list2.stream();

        System.out.println(Stream.concat(stream1,stream2).distinct().collect(Collectors.toList()));

    }
}
