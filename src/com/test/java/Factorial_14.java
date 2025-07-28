package com.test.java;

import java.util.Scanner;

public class Factorial_14 {
    public static void main(String[] args) {

        int n , fact=1 ;

        Scanner s = new Scanner(System.in);

        System.out.println("Give me the value for the factorial : ");

        n = s.nextInt();

        for (int i=2 ; i <= n ; i++) {
            fact = fact*i;
        }

        int fact1 = 1;
        for (int j = n ; j > 1 ; j--){
            fact1 = fact1 * j ;
        }

        System.out.println("Fact Value is : " +fact);
        System.out.println("Fact Value is : " +fact1);
    }
}