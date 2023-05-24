package com.interview.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentImplementation {

	public static void main(String[] args) {
		Student s1 = new Student("Sai",1,90,18);
		Student s2 = new Student("Rajesh",2,87,15);
		Student s3 = new Student("Teja",3,78,19);
		Student s4 = new Student("Ram",4,69,20);
		Student s5 = new Student("Raghu",5,97,19);
		
		List<Student> studentList = Arrays.asList(s1,s2,s3,s4,s5);
		
		Predicate<Student> marksFilter = (student) -> student.getMarks()>80;
		
		studentList.stream().filter(marksFilter).forEach(System.out::println);
		
		Consumer<Student> studentAge = (student) -> System.out.println(student.getAge());
		
		studentList.stream().forEach(studentAge);
		
		//studentList.stream().map( e -> e).max((o1, o2) -> o)
		// total marks of all students;
		int totalMarks = studentList.stream().collect(Collectors.summingInt(Student::getMarks));
		System.out.println(totalMarks);
	}
}
