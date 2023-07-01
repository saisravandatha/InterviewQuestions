package com.learning;

import java.util.Scanner;

public class ScannerLearning {

    public static void main(String[] args) {
 //       Scanner scanner = new Scanner(System.in);
        //next() is used for only one word and nextLine() is for sentence
//        System.out.println("Enter your name");
//        String name = scanner.nextLine();
//        System.out.println("Enter your age");
//        int age = scanner.nextInt();
//        System.out.println("Hello " +name);
//        System.out.println("Your age is " +age);


        String sentence = "How are you doing?";
        Scanner sc = new Scanner(sentence);
        System.out.println(sc.nextLine());
        System.out.println(sc.next());
        System.out.println(sc.next());
    }
}
