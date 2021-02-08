package com.company;

import java.util.Scanner;

public class Scanner_Class {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Taking user input");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int a = sc.nextInt();
//        System.out.println(a);
//        System.out.println("Enter a string");
//        String b = sc.nextLine();
//        System.out.println(b);
//        System.out.println("enter a float number");
//        float c = sc.nextFloat();
//        System.out.println(c);
        System.out.println("this method reads only one word");
        String d = sc.next();
        System.out.println(d);
    }
}
