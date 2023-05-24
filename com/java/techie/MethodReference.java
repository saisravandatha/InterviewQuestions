package com.java.techie;

public class MethodReference {
	
	private void m1() {
		System.out.println("m1() instance/non-static method");
	}
	
	private static void m2() {
		System.out.println("m2() is a static method");
	}
	public static void main(String[] args) {
		//Method Reference
		// syntax: Object::MethodName
		
		MethodReference.m2();// we can call static methods without creating a object of the class
		
		MethodReference methodReference = new MethodReference();
		methodReference.m1();
		
		//MethodReference::m2; // static method reference
		
		//methodReference::m1 // instance method reference
		
		//constructor reference
		//
	}
}
