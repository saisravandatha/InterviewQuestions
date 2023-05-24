package com.interview.questions;

import java.util.HashMap;

public class FirstRepeatedAndNonRepeatedCharacter {

	public static void main(String[] args) {
		String input = "Hello World";
		//input.chars().mapToObj( i -> char)
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0; i<input.length();i++) {
			int count=0;
			for (int j = 0; j < input.length(); j++) {
				if(input.charAt(i) == input.charAt(j)) {
					count++;
					map.put(input.charAt(i), count);
				}
			}
		}
		System.out.println(map);
	}
}
