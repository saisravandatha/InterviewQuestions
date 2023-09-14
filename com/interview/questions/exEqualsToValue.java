package com.interview.questions;

import java.util.ArrayList;

public class exEqualsToValue {

	static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> integer = new ArrayList<>();
        for(int i=0; i<n;i++){
            if(arr[i] == i+1){
                integer.add(arr[i]);
            }
        }
        return integer;
    }
	public static void main(String[] args) {
		int[] arr = {15,2,8,9,0};
		System.out.println(valueEqualToIndex(arr,5));
	}

}
