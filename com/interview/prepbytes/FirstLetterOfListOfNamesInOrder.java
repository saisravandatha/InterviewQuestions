package com.interview.prepbytes;

import java.util.*;
import java.util.stream.Collectors;

public class FirstLetterOfListOfNamesInOrder {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Phoebe","Chandler","Rachel","Ross","Monica","Joey");
        String sortedString= names.stream()
                                              .map(e -> e.charAt(0))
                                              .sorted(Comparator.naturalOrder())
                                              .map(String::valueOf)

                .collect(Collectors.joining());

        System.out.println(sortedString);
    }
}
