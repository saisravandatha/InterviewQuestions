package com.interview.questions;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int[] array = {10,3,5,6,2};
		int[] resultArray = new int[array.length];
		int product = 1;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j < array.length;j++) {
				if(i!=j) {
					product = product * array[j];
				}
			}
			resultArray[i] = product;
			product = 1;
		}
		Arrays.stream(resultArray).forEach(System.out::println);
	}

}
