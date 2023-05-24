package com.interview.streams;

public class Employee {
	
	private String firstName;
	private String lastName;
	private int age;
	private String department;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String firstName, String lastName, int age, String department, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.department = department;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", department="
				+ department + ", salary=" + salary + "]";
	}
	
	
}
