package com.interview.prepbytes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VolumeOfBox {

    public static int volumeOfBoxes(List<Integer> box1, List<Integer> box2 ,List<Integer> box3){
//        int sum = box1.stream()
//                .mapToInt(i -> i * box2.get(i) * box3.get(i))
//                .sum();

        int sum =0;

        for (int i = 0; i < box1.size(); i++) {
            sum += box1.get(i) * box2.get(i) * box3.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(volumeOfBoxes(Arrays.asList(2, 3, 2), Arrays.asList(6, 6, 7), Arrays.asList(1, 2, 1)));
    }
}
