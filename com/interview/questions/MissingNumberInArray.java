package com.interview.questions;

import java.util.Arrays;

public class MissingNumberInArray {

    public static int missingNumberInArray(int n,int[] arr){
        int[] expectedArray = new int[n];
        for (int i = 0; i <n; i++) {
            expectedArray[i] = i+1;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.stream(arr).max());
//        for (int i = 0; i <n; i++) {
//            if (arr[i] != expectedArray[i]){
//                return expectedArray[i];
//            }
//        }
        /*Another Method*/
        int expectedSum = ((n)*(n+1))/2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return expectedSum - sum;
    }
    public static void main(String[] args) {
        int[] arr = {5,7,8,4,6,1,3,9};
        System.out.println(missingNumberInArray(9,arr));
    }
}
