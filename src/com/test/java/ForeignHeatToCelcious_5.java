package com.test.java;

import java.util.Scanner;

//The formula to convert Fahrenheit to Celsius is given by °C = [°F - 32] × (5/9).
public class ForeignHeatToCelcious_5 {
    public static void main(String[] args) {

        System.out.println("*** Conversion From Foreign Heat to Celsious ***");
        Scanner s = new Scanner(System.in);
        float f = s.nextFloat();
        System.out.println("Your Entered ForeignHeat Value is : "+f);
        System.out.println("Caluculating ...... ");
        float c = (float) (((f-32)*5)/9);
        System.out.println("Celsious Value is : "+c);
    }
}