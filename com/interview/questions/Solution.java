package com.interview.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
	    public static void buildArray(int[] nums) {
	        int[] newArray = new int[nums.length];
	        for(int i=0;i<nums.length;i++) {
	        	int value = nums[nums[i]];
	        	newArray[i] = value;
	        }
	        for(int num : newArray) {
	        	System.out.println(num);
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,0,1,2,3,4};
		//buildArray(nums);
		List<Integer> numbers = Arrays.asList(87,9,29,99,100);
		int number = numbers.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(numbers.stream().max(Integer::compare).get());
		System.out.println(number);
	}

}
