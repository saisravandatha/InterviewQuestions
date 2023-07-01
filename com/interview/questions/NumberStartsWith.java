package com.interview.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,222,234,567,889,713,12,14);
		numbers.stream().forEach( e -> {
			if(String.valueOf(e).charAt(0) == '2') {
				System.out.println(e);
			}
		});
		
		numbers.stream().filter(e -> String.valueOf(e).charAt(0) == '2')
		.collect(Collectors.toList());

		numbers.stream().map(s -> s+"").filter( s->s.startsWith("1")).forEach(System.out::println);
	}
}
