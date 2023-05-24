package com.javagudies.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingStreamExample {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Guvava");
		fruits.add("Orange");

		// ascendingOrder
		fruits.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);// Method 1
		fruits.stream().sorted().forEach(System.out::println);
		fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).forEach(System.out::println);// ascending
		fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).forEach(System.out::println);// descending

		List<Employee> listObj = new ArrayList<Employee>();
		listObj.add(new Employee("chaman", "gupta", 22, 25000));
		listObj.add(new Employee("aman", "gupta", 24, 28000));
		listObj.add(new Employee("raj", "sharma", 28, 35000));
		listObj.add(new Employee("mohit", "sharma", 28, 20000));

		// Sort Employee by salary in ascending order
		listObj.stream().sorted(Comparator.comparingInt(Employee::getSalary)).collect(Collectors.toList())
				.forEach(System.out::println);

		// Sort Employee by salary in descending order
		listObj.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).collect(Collectors.toList())
				.forEach(System.out::println);

		// Sorting Employee by Age
		listObj.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList())
				.forEach(System.out::println);

		// Sorting Employee by Name
		listObj.stream().sorted(Comparator.comparing(Employee::getFirstName)).collect(Collectors.toList())
				.forEach(System.out::println);
		
	}

}

class Employee {
	private String firstName;
	private String lastName;
	private int age;
	private int salary;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(String firstName, String lastName, int age, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", salary=" + salary
				+ "]";
	}
}