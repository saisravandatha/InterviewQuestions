package com.interview.questions;

public class CharacterDifferCountBetweenTwoStrings {

    /*
       Input: abcbba abcbda
       Output: 1

       Input: abcde bcdef
       OutPut: 5
    */
    public static void main(String[] args) {
        String input1 = "abcde";
        String input2 = "bcdef";
        System.out.println(differCount(input1,input2));
    }

    public static int differCount(String input1, String input2){
        int count = 0;
        for(int i=0; i<input1.length(); i++){
            if(input1.charAt(i) !=input2.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
