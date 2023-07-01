package com.interview.questions;

public class PrintStringBasedOnOddEvenIndex {

    //Input:adbecf
    //Output: abc def
    public static void main(String[] args) {

        String s = "adbecf";
        StringBuilder evenIndexString = new StringBuilder();
        StringBuilder oddIndexString = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i%2 == 0){
                evenIndexString.append(s.charAt(i));
            }else {
                oddIndexString.append(s.charAt(i));
            }
        }
        System.out.print(evenIndexString +" "+ oddIndexString );
    }
}
