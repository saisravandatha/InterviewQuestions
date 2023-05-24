package com.interview.questions;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OpenTextInterview {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number Between 1 and 50000");
		int number = sc.nextInt();
		//Method of summing Digits
		long sumOfDigits = String.valueOf(number).chars().map(Character::getNumericValue).sum();
		//int somethoing = String.valueOf(number).chars().map(a->a).
		System.out.println(sumOfDigits);
		long sumArray = Arrays.stream(String.valueOf(number).split("")).collect(Collectors.summarizingInt(Integer::parseInt)).getSum();
		int sum = sumOfDigits(number);
		for(int i= number+1; i<=50000;i++) {
			if(sumOfDigits(i) == sum) {
				System.out.println(i);
				break;
			}
		}
	}

	private static int sumOfDigits(int number) {
		int sum = 0;
		while(number!=0) {//26
			int r = number%10;//6
			sum = sum + r;//6
			number = number/10;//2
		}
		return sum;
	}

}
