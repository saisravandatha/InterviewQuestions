package com.telusko;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
	
	private static Map<Integer,Integer> cache = new HashMap<>();
	
	public static void main(String[] args) {
		int position = 8;
		int result = fib(position);
		System.out.println(result);
	}

	private static int fib(int position) {

		if(position == 0)
			return 0;
		if(position == 1 || position==2)
			return 1;
		if(cache.containsKey(position)) {
			return cache.get(position);
			
		}
		int result = fib(position - 1) + fib(position - 2);
		cache.put(position, result);
		return result;
//		int a = 0;
//		int b = 1;
//		int c = 0;
//		for(int i = 2; i <= position;i++) {
//			c = a + b;
//			a = b;
//			b = c;
//		}
//		return c;
	}
}
