package com.interview.questions;

public class RemoveDuplicateSpaces {

    public static void main(String[] args) {
        String str = "Java        Bytes      is";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) !=' '|| !Character.isSpaceChar(str.charAt(i+1))){
                sb.append(str.charAt(i));
            }
        }
       System.out.println(sb);
    }
}
