package com.java.techie;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EmployeeMethodReference {

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		
		employeeService.loadEmployeesFromDB()
		               .stream()
		               .forEach(System.out::println);
		
		String [] array = {"Code","Java","C++"};
		
		System.out.println(Arrays.stream(array)
				                 .map(String::toUpperCase)
				                 .collect(Collectors.toList()));
		
		//constructor Reference
		// Employee::new 
	}
}
