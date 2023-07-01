package com.interview.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SecondSmallestElementInArray {
    public static void main(String[] args) {

        int[] numbers = {5,3,8,2,1};
        System.out.println(Arrays.stream(numbers).distinct().sorted().skip(1).findFirst().getAsInt());
    }
}
