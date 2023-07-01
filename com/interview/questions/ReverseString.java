package com.interview.questions;

public class ReverseString {
    public static void main(String[] args) {
        String word = "sravan";
        String reversedWord = "";
        for(int i = word.length()-1;i >= 0;i--){
            reversedWord =  reversedWord + word.charAt(i);
        }
        System.out.println(reversedWord);
        //Another Way using String Builder
        StringBuilder sb = new StringBuilder();
        for (int i = word.length()-1;i >= 0;i--) {
            sb.append(word.charAt(i));
        }
        System.out.println(sb);
    }
}
