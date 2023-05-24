package com.interview.questions;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharactersInString {

	public static void main(String[] args) {

		System.out.println(findDuplicateUsingFor("code decode"));
		System.out.println(findDuplicateUsingStreams("code decode"));
	}

	private static Set<Character> findDuplicateUsingFor(String string) {
		// TODO Auto-generated method stub
		Set<Character> characterDuplicates = new LinkedHashSet<>();
		for (int i = 0; i < string.length(); i++) {
			for (int j = i + 1; j < string.length(); j++) {
				if (string.charAt(i) == string.charAt(j)) {
					characterDuplicates.add(string.charAt(i));
				}
			}
		}
		return characterDuplicates;
	}
	
	private static Set<Character> findDuplicateUsingArrays(String string) {
		// TODO Auto-generated method stub
		Set<Character> characterDuplicates = new LinkedHashSet<>();
		int[] arrayForChar = new int[256];
		for(int i=0; i<string.length();i++) {
			arrayForChar[string.charAt(i)] = arrayForChar[string.charAt(i)]+1;
		}
		
		for(int i =0 ; i< arrayForChar.length;i++) {
			if(arrayForChar[i]>1) {
				characterDuplicates.add((char) arrayForChar[i]);
			}
		}
		return characterDuplicates;
	}
	
	private static Set<String> findDuplicateUsingStreams(String string) {
		// TODO Auto-generated method stub
		Set<String> characterDuplicates = Arrays.asList(string.split("")).stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter( e -> e.getValue()>1).map(e -> e.getKey()).collect(Collectors.toSet());
		return characterDuplicates;
	}
	
}
