package com.test.java;

import java.util.Scanner;

public class CompareStrings_15 {
    public static void main(String[] args) {

        String s1 , s2 ;
        Scanner s = new Scanner(System.in) ;

        System.out.print("Enter the first string : ");
        s1 = s.next();
        System.out.print("Enter the Second string : ");
        s2 = s.next();

        if(s1.compareTo(s2) > 0) System.out.println("first is grater");
        else if(s1.compareTo(s2) < 0) System.out.println("Second one is grater");
        else System.out.println("Both are euqal");
//
//        if(s1.equals(s2)) System.out.println("Equals");
//        else System.out.println("not equals");
    }
}

//C:\Users\hp\Desktop\tool\jdk-21.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.2.2\lib\idea_rt.jar=50899:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.2.2\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\hp\IdeaProjects\JavaPractice_21016060\bin com.test.java.CompareStrings_15
//        Enter the first string : hi
//        Enter the Second string : hello
//        first is grater
//        not equals
//
//        Process finished with exit code 0
// why because it is checking the lexiographical order hi comes first in the dictionary than hello