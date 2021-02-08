package com.company;

import java.util.Scanner;

public class Practice_Set_1 {

    public static void main(String[] args) {
	// write your code here
//        Question1
        int num1 = 10;
        int num2 = 9;
        int num3 = 8;
        int sum = num1+num2+num3;
        System.out.println(sum);

//        Question2
        double s1 = 90;
        double s2 = 85;
        double s3 = 90;
        double per = ((s1+s2+s3)/300)*100;
        double cgpa = per/9.5;
        System.out.println(cgpa);

//        Question3
        System.out.println("enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("hello "+name+" have a good day");

//        Question4
        double km = 2;
        double miles = km*0.621371;
        System.out.println(miles);

//        Question5
        System.out.println("enter a number");
        Scanner sc1 = new Scanner(System.in);
        System.out.println(sc1.hasNextInt());


    }
}
