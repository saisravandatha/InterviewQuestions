package com.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndexBasedReverseString {

    //Input: India is my country
    //Output: country my is India
    public static void main(String[] args) {
        String s = "India is my country";
        List<String> list = Arrays.asList(s.split(" "));
        String sm = "";
        for (int i = list.size()-1; i >= 0; i--) {
            if(i>0)
                sm+=list.get(i) +" ";
            else
                sm+=list.get(i);
        }
        System.out.println(sm);
    }
}
