package com.test.java;

import java.util.Scanner;

// Swapping 2 numbers without using the third varable
public class SwapUsing3rdVar_6 {
    public static void main(String[] args) {

        int i,j ;
        Scanner s = new Scanner(System.in);
        System.out.println("Give First 2 values : ");
        i = s.nextInt();
        j = s.nextInt();
        System.out.println("i :- "+i);
        System.out.println("j :- "+j);
        System.out.println("Swapping .....");
        int swap;
        swap = i;
        i = j;
        j = swap;

        System.out.printf("Values after Swapping ..... i :- %d , j :- %d %n ",i,j);
    }
}