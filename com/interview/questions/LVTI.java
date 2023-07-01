package com.interview.questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Local Variable Type Inference about var
public class LVTI {
    public static void main(String[] args) {
        //BufferedReader is also a way to take input from the User.

        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(i);

        //TestBlock
        String hrml = "<html>\n" +
                "<body>\n" +
                "<body>\n" +
                "<html>\n";

        //Using Test Block
        String html = """
                <html>
                <body>
                </body>
                </html>
                """;
        System.out.println(html);



    }
}
