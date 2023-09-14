package com.interview.scriptlearners;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int[] missedNum = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        missedNum[0] = map.entrySet().stream().filter(e -> e.getValue()>1).findFirst().get().getKey();
        missedNum[1] = missedNum[0
                ]+1;
        System.out.println(Arrays.toString(missedNum));
    }
}
