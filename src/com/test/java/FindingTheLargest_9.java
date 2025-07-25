package com.test.java;

import java.util.Scanner;

public class FindingTheLargest_9 {
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("Give me the three numbers");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();
        z = s.nextInt();
        System.out.println("Finding the largest");
        if (x == y && y == z) {
            System.out.println("All numbers are equal");
        } else if (x >= y && x >= z) {
            System.out.println("X is the largest");
        } else if (y >= z) {
            System.out.println("Y is the largest");
        } else {
            System.out.println("Z is the largest");
        }
    }
}