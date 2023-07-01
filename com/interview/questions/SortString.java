package com.interview.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortString {
    //Input: Hello
    //Output: ehllo
    public static void main(String[] args) {
        String s = "hello";
        char[] c = s.toCharArray();
        Arrays.sort(c);
        System.out.println(c);
    }
}
