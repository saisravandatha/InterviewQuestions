package com.interview.questions;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ModeOfArray {

    public static void main(String[] args) {
        int[] arr ={1,1,4,4,1,5};
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }


        System.out.println(map);
        System.out.println(map.entrySet().stream().sorted(Collections.reverseOrder(Comparator.comparingInt(Map.Entry::getValue))).map(e -> e.getKey()).findFirst().get());
    }
}
