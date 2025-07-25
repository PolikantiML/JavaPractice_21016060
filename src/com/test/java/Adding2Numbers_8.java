package com.test.java;

import java.util.Scanner;

public class Adding2Numbers_8 {
    public static void main(String[] args) {
        int i,j;
        Scanner s = new Scanner(System.in);
        System.out.println("Give me I and J values");
        i = s.nextInt();
        j = s.nextInt();
        int add = i+j;

        System.out.println("After adding values : "+add);
    }
}