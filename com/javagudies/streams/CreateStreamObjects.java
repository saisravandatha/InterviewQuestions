package com.javagudies.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CreateStreamObjects {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("a", "b", "c");
		stream.forEach(System.out::println);

		Collection<String> collection = Arrays.asList("JAVA", "J2EE", "Spring");
		Stream<String> stream2 = collection.stream();
		stream2.forEach(System.out::println);

		List<String> list = Arrays.asList("JAVA", "J2EE", "Spring");
		Stream<String> stream3 = list.stream();
		stream3.forEach(System.out::println);

		Set<String> set = new HashSet<>(list);
		Stream<String> stream4 = set.stream();
		stream4.forEach(System.out::println);
		
		String[] array = {"a","b","c"};
		Stream<String> stream5 = Arrays.stream(array);
		stream5.forEach(System.out::println);
 	}
}
