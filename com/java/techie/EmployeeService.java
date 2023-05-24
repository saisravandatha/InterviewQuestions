package com.java.techie;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeService {
	
	public List<Employee> loadEmployeesFromDB(){
		return IntStream.rangeClosed(1, 10)
				.mapToObj(i ->new Employee(String.valueOf(i), "employee"+i, new Random().nextInt(41000)))
				.collect(Collectors.toList());
	}
}
