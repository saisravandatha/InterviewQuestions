package com.interview.questions;

public class MaximumSumInSubArray {
    public static void main(String[] args) {
        int[] arr = {2,9,31,-4,21,7};
        int k = 3;
        int currentSum = 0;
        //When we want fetch the maximum values initialize the max with minimum value or vice - versa
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        for (int i = k; i <arr.length; i++) {
            currentSum = currentSum - arr[i-k] + arr[i];
            maxSum = Math.max(currentSum,maxSum);
        }
        System.out.println(maxSum);

//        Navie Apprach
//        for (int i = 0; i <= arr.length-k; i++) {
//            currentSum = 0;
//            for(int j = i; j < i + k; j++){
//                currentSum = currentSum + arr[j];
//            }
//            maxSum = Math.max(currentSum,maxSum);
//        }

    }
}
