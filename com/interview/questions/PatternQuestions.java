package com.interview.questions;

public class PatternQuestions {

	public static void main(String[] args) {
		pattern5(7);
	}

	private static void pattern(int num) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	private static void pattern1(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=i;j<=num;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	private static void pattern2(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	private static void pattern3(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}
	
	private static void pattern4(int num) {
	
		for(int i=1;i<=num*2;i++) {
			int totalCol = i > num ? 2*num -i : i;
			for(int j=1;j<=totalCol;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	private static void pattern5(int num) {		
		for(int i=1;i<=num*2;i++) {
			int totalCol = i > num ? 2*num -i : i;
			int noOfSpaces = num - totalCol;
			for(int k=1;k<noOfSpaces;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=totalCol;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
