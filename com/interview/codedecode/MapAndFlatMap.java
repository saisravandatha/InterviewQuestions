package com.interview.codedecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {

//	How Map works in Java 8
//
//	The Stream.map() function performs map functional operation i.e. it takes a Stream and transforms it to another new Stream.
//
//	It applies a function on each element of Stream and stores return value into new Stream. 
//
//	The map operation takes a Function, which is called for each value in the input stream and produces one result value, which is sent to the output stream.

//	How Flat Map works in java 8 
//
//	Is the combination of a map and a flat operation
//
//	This means you first apply the map function and then flattens the result.
//
//	The key difference is the function used by map operation returns a Stream of values or a list of values rather than a single value, that's why we need flattening. When you flat a Stream of Stream, it gets converted into Stream of values.
//
//	To understand what flattening a stream consists in, consider a structure like [ [1,2,3],[4,5,6],[7,8,9] ] which has "two levels". It's basically a big List containing three more List.  Flattening this means transforming it in a "one level" structure e.g. [ 1,2,3,4,5,6,7,8,9 ] i.e. just one list.
//
//	In short,
//	Before flattening - Stream of List of Integer
//	After flattening - Stream of Integer
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Sravan",Arrays.asList("Delhi","Pune","Chennai"));
		Employee e2 = new Employee(2, "Code",Arrays.asList("Hyderabad","Mumbai","Chennai"));
		Employee e3 = new Employee(3, "Sai",Arrays.asList("Banglore","Pune","Chennai"));
		Employee e4 = new Employee(4, "Decode",Arrays.asList("Nagpur","Noida","Chennai"));
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);


		List<Integer> id = employeeList.stream()
				.map(e -> e.getId()).collect(Collectors.toList());
		System.out.println(id);
		
		System.out.println(employeeList.stream()
		.flatMap(e -> e.getCitiesWorkedIn().stream())
		.collect(Collectors.toSet()));

		List<String> emplooyeeNames = employeeList.stream().map(Employee::getName).collect(Collectors.toList());
	}



}
