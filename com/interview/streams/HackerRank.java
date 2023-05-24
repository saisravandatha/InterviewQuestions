package com.interview.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerRank {

    public static void method(int number, List<Integer> numberList, int queries,String value1,List<Integer> insertNumbeList,String value2, int deleteNumber){
        if(!numberList.isEmpty() && value1.equalsIgnoreCase("INSERT")){
           int index = insertNumbeList.get(0);
           Integer addNumber = insertNumbeList.get(1);
           numberList.add(index, addNumber);
        }
        if(!numberList.isEmpty() && value2.equalsIgnoreCase("DELETE")){
           numberList.remove(deleteNumber);
        }
        System.out.println(numberList);
    }
    
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(12,0,1,78,12));
		List<Integer> numbers1 = new ArrayList<>(Arrays.asList(5,23));
		method(5,numbers,2,"INSERT",numbers1,"DELETE",0);
	}

}
