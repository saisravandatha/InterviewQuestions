package com.interview.questions;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
  Problem is to find the key
  Input are three numbers we need to dervice key based on the formaula
  key = (Hundreds digit of input1) * (Tens digit of input 2) - (Largest digit of input 3)
*/
public class RandomInterviewQuestion {
    public static void main(String[] args) {

        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;

        String[] a = String.valueOf(input1).split("");
        String[] b = String.valueOf(input2).split("");
        String c = Arrays.stream(String.valueOf(input3).split("")).sorted(Comparator.reverseOrder()).findFirst().get();

        int  key = Integer.valueOf(a[1]) * Integer.valueOf(b[2]) - (Integer.valueOf(c));

        System.out.println(key);
    }
}
