package com.test.java;

import java.util.Scanner;

public class ForLoop_16 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the series that I want to print to N :");
        int n = s.nextInt();
        for (int i = 1 ; i <= n ; i++){
            System.out.println(i);
        }
    }
}