package com.telusko;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		//Factorial of a number
		// 5! = 5 * 4 * 3 * 2 * 1
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = 1;
		 
		result = factorial(num);
		
		System.out.println(result);
	}

	private static int factorial(int num) {
		if(num == 0) 
			return 1;
		return num * factorial(num -1);
	}

}
