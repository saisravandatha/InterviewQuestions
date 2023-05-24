package com.interview.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,10,20,30,20,20,34,98,89,90,87,89);
		
		Set<Integer> sup = list.stream().
		filter(e -> Collections.frequency(list, e)>1)
		.collect(Collectors.toSet());
		
		Set<Integer> dupNum = new HashSet<>();
		list.stream().filter(e -> dupNum.add(e));

	}
}
