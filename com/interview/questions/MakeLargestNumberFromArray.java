package com.interview.questions;

public class MakeLargestNumberFromArray {

    /*
    * Input:{2,10,9}
    * output:9210
    * */
    public static void main(String[] args) {
        int[] arr = {2,10,9};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if(i!=0 && arr[i]>sb.charAt(0)){
                sb.insert(0,arr[i]);
            }else{
                sb.append(arr[i]);
            }
        }
        System.out.println(sb);
    }
}
