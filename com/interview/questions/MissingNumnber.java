package com.interview.questions;

import java.util.Arrays;

public class MissingNumnber {

	public static int missingNumber(int[] array) {
		int length = array.length;
		int sumOfArray = (length+1)*(length+2)/2;
		Integer missingNumber = sumOfArray - Arrays.stream(array).sum();
		return missingNumber;
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,5};
		System.out.println(missingNumber(array));
	}

}
