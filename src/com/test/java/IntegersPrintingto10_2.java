package com.test.java;

public class IntegersPrintingto10_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number : "+i);
        }

    }
    /*for (int number : IntStream.rangeClosed(1, 10).toArray()) {
        System.out.println(number);
    }*/
}