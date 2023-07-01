package com.interview.questions;

public class CardMasking {
    public static void main(String[] args) {

        String cardNumber = "12345678";

        System.out.println(cardNumber.substring(0,cardNumber.length()-4)
                .replaceAll("[0-9]","*")
                .concat(cardNumber.substring(cardNumber.length()-4,cardNumber.length())));
    }
}
