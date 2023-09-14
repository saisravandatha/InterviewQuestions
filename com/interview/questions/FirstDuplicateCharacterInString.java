package com.interview.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstDuplicateCharacterInString {

    public static void main(String[] args) {
        String str = "abcgggrrr";
        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i))==null){
                map.put(str.charAt(i),1);
            }else {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }

        System.out.println(map.entrySet().stream().filter(e -> e.getValue()>1).findFirst().get().getKey());
    }
}
