package com.company;

import java.util.Scanner;

public class Prcatice_Set_5 {

    public static void main(String[] args) {
	// write your code here
//      Question1
//        for(int i=4;i>0;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Question2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n: ");
//        int n = sc.nextInt();
//        int i = 0;
//        int sum = 0;
//        while(i<n){
//            sum = sum+(2*i);
//            i++;
//        }
//        System.out.println(sum);

//        Question3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n: ");
//        int n = sc.nextInt();
//        for(int i=1;i<=10;i++){
//            System.out.println(n+"*"+i+"="+n*i);
//        }

//        Question4
//        for(int i=10;i>=0;i--){
//            System.out.println(10+"*"+i+"="+10*i);
//        }

//        Question5
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n: ");
//        int n = sc.nextInt();
//        int fact = 1;
//        for(int i=n;i>0;i--){
//            fact = fact*i;
//        }
//        System.out.println(fact);

//        Question6
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n: ");
//        int n = sc.nextInt();
//        int fact = 1;
//        int i = n;
//        while(i>0){
//            fact = fact*i;
//            i--;
//        }
//        System.out.println(fact);

//        Question7
//        int i = 4;
//        while(i>0) {
//            int j = i;
//            while(0!=j){
//                System.out.print("*");
//                j--;
//            }
//            System.out.println();
//            i--;
//        }

//        Question8
        int sum = 0;
        for(int i=0;i<=10;i++){
            sum = sum+(8*i);
        }
        System.out.println(sum);
    }
}
