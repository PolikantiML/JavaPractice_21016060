package com.test.java;

import java.util.*;

public class SwapUsing2Var_7 {
    public static void main(String[] args) {


    int i,j ;
    Scanner s = new Scanner(System.in);
        System.out.println("Give First 2 values : ");
        i = s.nextInt();
        j = s.nextInt();
        System.out.println("i :- "+i);
        System.out.println("j :- "+j);
        System.out.println("Swapping .....");
        i = i+j ;
        j = i-j ;
        i = i-j ;
        System.out.printf("Values after Swapping ..... i :- %d , j :- %d %n ",i,j);
}
}