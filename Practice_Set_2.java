package com.company;

import java.util.Scanner;

public class Practice_Set_2 {

    public static void main(String[] args) {
	// write your code here
//        Question1
        char grade = 'D';
        char encr = (char)(grade - 3);
        System.out.println("False grade is: "+encr);
        char decr = (char)(encr+3);
        System.out.println("Original grade is: "+decr);

//        Question2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println(num>8);
        int a = 7*49/7 + 35/7;
        System.out.println(a);

    }
}
