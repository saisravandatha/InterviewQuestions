package com.interview.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeStreams {

	public static void main(String[] args) {
		List<Employee> listObj = new ArrayList<Employee>();
		Employee e1  = new Employee("chaman", "gupta", 22,"IT",25000);
		Employee e2  = new Employee("aman", "gupta", 24,"Sales",26000);
		Employee e3  = new Employee("raj", "sharma", 28,"IT",30000);
		Employee e4  = new Employee("mohit", "sharma", 28,"Marketing",34000);
		Employee e5  = new Employee("ram", "gupta", 33,"Sales",30000);

		listObj.add(e1);
		listObj.add(e2);
		listObj.add(e3);
		listObj.add(e4);
		listObj.add(e5);
		//List of employee having maximum age
		Integer age = listObj.stream()
				.max(Comparator.comparing(Employee::getAge)).map(e -> e.getAge()).get();
		List<Employee> employees = listObj.stream().filter(e -> e.getAge()==age).toList();
		System.out.println(employees);
		
		//List of employees in age between 25 - 35
		List<Employee> employeeList = listObj.stream().
				filter(e -> e.getAge()>25 && e.getAge()<35)
				.collect(Collectors.toList());
		
		System.out.println(employeeList);
		
		//count of employees of each department
		System.out.println(listObj.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())));
	 
		//employees in each department
		System.out.println(listObj.stream().collect(Collectors.groupingBy(Employee::getDepartment)));
		

		//find highest paid employee from each department
		Map<String, Optional<Employee>> employeemap = listObj.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
	
		//groupping the words by length
		String word = "Hello world my name is Hello Jane and I hate Mango fruit";
		List<String> words = Arrays.asList(word.split(" "));
		final Map<Integer,List<String>> map = new TreeMap<>(words.stream().collect(Collectors.groupingBy(String::length)));
		System.out.println(map);
		System.out.println(words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
	}
}
