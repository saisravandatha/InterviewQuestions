package com.interview.questions;

import java.util.ArrayList;
import java.util.List;

public class PrintOddIndexLettersFromWord {

	public static void main(String[] args) {
		String word = "Java Interview Questions";
		List<Character> oddIndexLetters = new ArrayList<>();
		for(int i=0; i<word.length();i++) {
			if(i%2!=0) {
				oddIndexLetters.add(word.charAt(i));
			}
		}
		System.out.println(oddIndexLetters);
	}

}
