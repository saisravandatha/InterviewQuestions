package com.interview.scriptlearners;

public class MakeTheStringGreat {

    public static void main(String[] args) {
        String s = "s";
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)==Character.toUpperCase(s.charAt(i+1)) || Character.toUpperCase(s.charAt(i))== s.charAt(i+1)){
                s = s.substring(0,i) + s.substring(i+2,s.length());
                i=-1;
            }
        }
        System.out.print(s);
    }
}
