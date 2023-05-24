package com.interview.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonStreams {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("John", 25), new Person("Jane", 30), new Person("Joe", 25));
		Map<Integer, List<Person>> peopleByAge = people.stream().collect(Collectors.groupingBy(Person::getAge));
		System.out.println(people.stream().collect(Collectors.groupingBy(Person::getAge,Collectors.counting())));
		System.out.println(peopleByAge); // output: {25=[John, Joe], 30=[Jane]}
		
		try (Stream<String> stream = Files.lines(Paths.get("C:\\Users\\srava\\OneDrive\\Desktop\\input.txt"))) {
		    stream.map(e -> e.toUpperCase()).forEach(System.out::println);;
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}

}
