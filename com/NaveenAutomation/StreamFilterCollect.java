package com.NaveenAutomation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterCollect {

	public static void main(String[] args) {
		List<String> productList = Arrays.asList("MacBook", "iPhone", "Shoes", "clothes", "Watches");

		productList.stream().filter(e -> !e.equals("Shoes")).collect(Collectors.toList()).forEach(System.out::println);

		List<Customer> customerList = Arrays.asList(
				new Customer("Sai", "24"), 
				new Customer("Rajesh", "36"),
				new Customer("peter", "27"));
		
		customerList.stream().collect(Collectors.toList());
		
		int[] numbers = {1,2,3,4};
		int[] result= new int[numbers.length];
		int product = 1;
		for(int number : numbers) {
			product = product * number;
		}
		for(int i=0;i<numbers.length;i++) {
			result[i] = product/numbers[i];
		}
		
	}

}

class Customer {

	private String name;
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}

	public Customer(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

}