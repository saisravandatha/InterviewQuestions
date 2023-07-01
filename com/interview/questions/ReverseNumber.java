package com.interview.questions;

import java.util.Arrays;

public class ReverseNumber {

    public static void main(String[] args) {

        int number = 892;
        int reverseNumber = 0;
        while (number!=0){
            int remainder = number % 10;
            reverseNumber = reverseNumber*10 + remainder;
            number = number/10;
        }
        System.out.println(reverseNumber);
    }
}
