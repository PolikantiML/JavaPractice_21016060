package com.test.java;

import java.util.Scanner;

public class Scanner_4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter String :");
        String s1 = s.nextLine();
        System.out.println(s1);

        System.out.print("Enter Int :");
        int i = s.nextInt();
        System.out.println(i);

        System.out.print("Enter Float :");
        float f = s.nextFloat();
        System.out.println(f);
    }
}