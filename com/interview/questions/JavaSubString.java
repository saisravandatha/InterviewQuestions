package com.interview.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaSubString {
    public static String getSmallestAndLargest(String s, int k) {
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        List<String> substrings = new ArrayList<>();
        for (int i = 0; i <=s.length()-k; i++) {
            substrings.add(s.substring(i, i+k));
        }
        substrings.sort(String::compareTo);
        System.out.println(substrings);
        return substrings.get(0) + "\n" + substrings.get(substrings.size()-1);
    }

    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcomejava",3));
    }
}
