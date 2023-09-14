package com.interview.scriptlearners;

import java.util.Arrays;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(3,2,6,5,1,4,8,9);
        int indexOfFive = 0;
        int indexOfEight = 0;
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) == 5){
                indexOfFive = i;
            }
            if(integerList.get(i)==8){
                indexOfEight = i;
            }
        }
        int sum = 0;
        for (int i = 0; i < integerList.size(); i++) {
            if (i<indexOfFive || i > indexOfEight){
                sum = sum + integerList.get(i);
            }
        }
        System.out.println(sum);
        List<Integer> concatedList = integerList.subList(indexOfFive,indexOfEight+1);
        System.out.println(concatedList);
        StringBuilder s = new StringBuilder();
        for (Integer integer : concatedList) {
            s.append(integer);
        }
        System.out.println(Integer.parseInt(s.toString())+sum);
    }
}
