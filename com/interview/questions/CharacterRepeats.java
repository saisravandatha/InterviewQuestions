package com.interview.questions;

public class CharacterRepeats {

	public static void main(String[] args) {
		String word = "Java Interview Questions";
		char character = 'a';
		int count = 0;
		for(int i =0; i<word.length();i++) {
			if(word.charAt(i)== character) {
				count++;
			}
		}
		System.out.println(count);
		
		// Another Method
		String[] words = word.split("a");
		for(String worda : words) {
			System.out.println(worda);
		}
		System.out.println(words.length - 1);
 	}
}
