package com.interview.questions;

import java.util.*;

public class MaximumElementInArray {

	public static void main(String[] args) {
		
		int[] numbers = {4,6,7,9,10,8,4,3,2};
		int temp = 0;
		for(int i=0;i<numbers.length-1;i++) {
			if(numbers[i] < numbers[i+1]) {
				temp = numbers[i];
				numbers[i] = numbers[i+1];
				numbers[i+1] = temp;
			}
		}
		for(int number : numbers) {
			System.out.println(number);
		}

		int[] arrDesc = Arrays.stream(numbers).boxed()
				.sorted(Collections.reverseOrder())
				.mapToInt(Integer::intValue)
				.toArray();
		System.out.println(arrDesc[0]);
	}
	
}
