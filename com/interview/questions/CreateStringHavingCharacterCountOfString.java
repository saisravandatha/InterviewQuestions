package com.interview.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CreateStringHavingCharacterCountOfString {

    /*
    * Input: aabbbbeeeeffggg
    * Output: a2b4e4f2g3
    * */
    public static void main(String[] args) {
        Map<Character,Integer> characterCount = new HashMap<>();
        String s = "aabbbbeeeeffggg";

        for (char c: s.toCharArray()) {
            characterCount.put(c,characterCount.getOrDefault(c,0)+1);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Character,Integer> entry: characterCount.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append(entry.getValue()>1 ? entry.getValue() :"");
        }
        System.out.println(stringBuilder);
    }
}
