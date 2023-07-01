package com.interview.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonElementsInTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {4,5,6,7,8};

        System.out.println(Arrays.stream(array1)
                .filter(i -> Arrays.stream(array2).anyMatch(arr2Number -> arr2Number == i))
                .boxed()
                .collect(Collectors.toList()));
    }
}
