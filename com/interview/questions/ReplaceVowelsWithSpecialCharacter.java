package com.interview.questions;

public class ReplaceVowelsWithSpecialCharacter {

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        String str = "the aardvark";
        System.out.println(str.replaceAll("[AEIOUaeiou]", "#"));

        // Method 2 using string builder
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (isVowel(ch)) {
                sb.append("#");
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

}
