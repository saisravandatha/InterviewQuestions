package com.interview.questions;

import java.util.ArrayList;
import java.util.List;

public class FindDigitsInString {
    public static void main(String[] args) {
        String s = "1 am f9 doing ge8 with 1.25";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(Character.isDigit(chars[i])){
                System.out.print(chars[i]-48 +" ");
            }
        }
    }
}
