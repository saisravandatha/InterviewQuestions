package com.interview.questions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String A = "madam";
        /* Enter your code here. Print output to STDOUT. */
        String s = "LLAAL";
        System.out.println(A.indexOf("LLL"));
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = A.length()-1; i >=0; i--) {
            stringBuilder.append(A.charAt(i));
        }
        System.out.println(stringBuilder);
        if(A.equals(stringBuilder.toString())){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
