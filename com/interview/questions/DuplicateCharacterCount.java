package com.interview.questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateCharacterCount {
    public static void main(String[] args) {
        String string = "eeee";
        List<String> characterList= new ArrayList<>();
        characterList = List.of(string.split(""));
        Set<String> characterSet = new HashSet<>(characterList.stream().collect(Collectors.toSet()));
        System.out.println(string.length() - characterSet.stream().count());
    }
}
