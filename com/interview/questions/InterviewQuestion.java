package com.interview.questions;

import java.util.Arrays;

public class InterviewQuestion {

    public static int ProductSmallestPair(int sum,int n, int[] arr){
        if(arr.length<=2){
            return -1;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(i<arr.length -1 && arr[i] + arr[i+1]<=7){
                return arr[i] * arr[i+1];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {-1,5,2,3,4,6,7};
        System.out.println(ProductSmallestPair(7,7,arr));
    }
}
