package com.learning;

import java.util.Arrays;
import java.util.List;

public class Sample {

	private static boolean isGreaterThan3(int number) {
		return number > 3;
	}
	
	private static boolean isEven(int number) {
		return number % 2 ==0;
	}
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,5,6,7,8,9);
		
		System.out.println(numbers.stream()
		       .filter(Sample::isGreaterThan3)
		       .filter(Sample::isEven)
		       .map(e-> e*2)
		       .findFirst().get());
	}

}
