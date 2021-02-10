package com.company;

import java.util.Scanner;

public class Exercise1_CBSE_Calculator {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Enter the maximum possible marks: ");
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        System.out.println("Enter subject1 marks: ");
        float sub1 = sc.nextFloat();
        System.out.println("Enter subject2 marks: ");
        float sub2 = sc.nextFloat();
        System.out.println("Enter subject3 marks: ");
        float sub3 = sc.nextFloat();
        System.out.println("Enter subject4 marks: ");
        float sub4 = sc.nextFloat();
        System.out.println("Enter subject5 marks: ");
        float sub5 = sc.nextFloat();
        float total = sub1+sub2+sub3+sub4+sub5;
        float per = (total/max)*100;
        System.out.println("Your percentage is: "+per);
    }
}
