package com.interview.questions;

import java.util.Arrays;
import java.util.List;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int number = 879373;
		
		System.out.println(String.valueOf(number).chars().map(Character::getNumericValue).sum());
		
		String name = "najaa";
				
		System.out.println(String.valueOf(name).chars().filter(e -> e == 'a').count());
		
		List<String> names = Arrays.asList("Thomas","vamsi","ram");
		for(var  i : names) {
			System.out.println(i);
		}
		
	}

}
