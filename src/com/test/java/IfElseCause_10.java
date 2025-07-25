package com.test.java;

import java.util.Scanner;

public class IfElseCause_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean learning = s.nextBoolean(); // enter only TRUE or FALSE
        if (learning) {
            System.out.println("Java programmer");
        }
        else {
            System.out.println("What are you doing here?");
        }

    }
}