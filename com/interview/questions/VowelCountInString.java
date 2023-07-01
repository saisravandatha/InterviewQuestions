package com.interview.questions;

public class VowelCountInString {
    /*
       Input: Celebration
       OutPut : 5
       Input : Prediction
       Output : 4
    */
    public static void main(String[] args) {

        String str = "Prediction";
        int count = 0;
        for (char ch : str.toCharArray()){
            if(ch=='a' || ch == 'e' || ch=='i' || ch=='o' || ch=='u' ||
                    ch=='A' || ch == 'E' || ch=='I' || ch=='O' || ch=='U'){
                count++;
            }
        }
        System.out.println(count);
    }
}
