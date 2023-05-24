package com.interview.questions;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharactersOccurances {

	public static void main(String[] args) {
		duplicateCharacters("sarvanii");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		System.out.println(factorial(number));
	}
	
	private static void duplicateCharacters(String string) {
		System.out.println("The quick brown fox jumped over the lazy dog."
        .chars()
        .mapToObj(i -> (char) i)
        .collect(Collectors.groupingBy(Object::toString, Collectors.counting())));
        
 		Arrays.asList(string.split("")).stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
		.stream().filter(e -> e.getValue()>1).forEach(System.out::println);
 		
	}
	
	private static int factorial(int number) {		
		if(number == 1 || number == 0) {
			return 1;
		}
		return number * factorial(number - 1);
	}
}
