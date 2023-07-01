package com.interview.questions;

public class SwitchCase {

    public static void main(String[] args) {

        String day = "Monday";
        String time = "";

        time = switch (day.toLowerCase()){
            case "Saturday", "Sunday" -> "6 A.M";
            case "Wednesday" -> "8 A.M";
            default -> "7 A.M";
        };
        System.out.println(time);
    }
}
