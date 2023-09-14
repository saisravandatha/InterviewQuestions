package com.interview.questions;

public class StringInBraces {

    /*Print the String present in braces
    *Input: how (are) you
    *Output: are*/
    public static void main(String[] args) {
        String str = "how (are) you";
        int firstIndex = 0;
        int secondIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '('){
                firstIndex = i+1;
            } else if (str.charAt(i) == ')') {
                secondIndex = i;
            }
        }
        System.out.println(str.substring(firstIndex,secondIndex));
    }
}
