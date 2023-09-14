package com.interview.questions;

import java.util.Arrays;

public class SumOfDigitsforProductofArray {

    /*
    Input: {4,,5,6,7,8,9}
    Ouput: Sum Of Digits of the Product Array i.e "18"
    * */
    public static int method(int num,int[] arr){
        int sum=0;
        int mul = Arrays.stream(arr).reduce(1,(x,y) -> x*y);
        while (mul>0){
            sum = sum + mul % 10;
            mul = mul/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9};
        System.out.println(method(6,arr));
    }
}
