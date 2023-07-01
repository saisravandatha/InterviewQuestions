package com.interview.questions;

public class SumOfIndividualDigitsBetweenRange {

    // we have given range 19,22
    //Output is (2+3+0) + (2+3+1) + (2+3+2) + (2+3+3) + (2+3+4) = 5+6+7+8+9 = 35
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 230; i <= 234; i++) {
            while(i != 0) {
                sum = sum + i % 10;
                i = i / 10;
            }
        }
        System.out.println(sum);
    }
}
