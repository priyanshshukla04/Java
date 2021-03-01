package com.company;

import java.util.Scanner;

public class Practice_Set_7 {
    //1
    static void Multi(int t) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(t + " * " + i + " =" + t * i);
        }
    }

    //2
    static void Pattern() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 3
    static int Natural_Sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + Natural_Sum(n - 1);
    }

    //4
    static void Pattern1() {
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //5
    static int Fibo_N(int n1) {
        if (n1 == 1) {
            return 0;
        }
        if (n1 == 2) {
            return 1;
        }
        return Fibo_N(n1 - 2) + Fibo_N(n1 - 1);
    }

    //6
    static int Ave(int... arr) {
        int average = 0;
        int sum = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            sum += arr[i];
        }
        average = sum / len;
        return average;
    }

    //  7
//    static void Pattern_Recurison(int o){
//        if(0<o-1){
//
//            for(int i=4;i>o;i--){
//                System.out.print("*");
//            }
//            System.out.println();
//            Pattern_Recurison1(o+1);
//        }
//    }

//    8
    static void Pattern_Recurison1(int m){
        if(m>0){
            Pattern_Recurison1(m-1);
            for(int i=0;i<m;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    9
    static void Fah_Cel(float tem){
        float F = tem * 1.8000f+ 32.00f;
        System.out.println(F);
    }

//    10
    static void Natu(int v){
        int sum = 0;
        for(int i=0;i<=v;i++){
         sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        // write your code here
//        Question1
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number to get its table: ");
//        int num = sc.nextInt();
//        Multi(num);

//        Question2
//          Pattern();

//        Question3
//        System.out.println("Enter the value of n: ");
//        int num1 = sc.nextInt();
//        System.out.println(Natural_Sum(num1));

//        Question4
//        Pattern1();

//        Question5
//        System.out.println("Enter the term of the series: ");
//        int num2 = sc.nextInt();
//        System.out.println(Fibo_N(num2));

//        Question6
//          System.out.println(Ave(1,2,3,4,5,6,7,8));
//          System.out.println(Ave(1,2,3,4,5,6,7,8,1,2,3,5));

//        Question7
//         Pattern_Recurison(4);

//        Question8
//         Pattern_Recurison1(4);

//        Question9
//        Fah_Cel(0);

//        Question10
          Natu(5);
    }
}
