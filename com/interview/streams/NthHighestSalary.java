package com.interview.streams;

import java.util.*;
import java.util.stream.Collectors;

public class NthHighestSalary {

    public static void main(String[] args) {

        Map<String,Integer> map1 = new HashMap<>();
        map1.put("anil",1000);
        map1.put("bhavna",1300);
        map1.put("michal",1500);
        map1.put("tom",1600);
        map1.put("ankit",1200);
        map1.put("daniel",1300);
        map1.put("james",1900);

        //If each employee has different salary this will work otherwise not 
        map1.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(1);

        System.out.println(getNthHighestSalary(2,map1));

    }

    public static Map.Entry<Integer, List<String>> getNthHighestSalary(int num, Map<String,Integer> map){
        return map.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(num-1);
    }
}
