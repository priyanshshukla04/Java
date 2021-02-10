package com.company;

import java.util.Scanner;

public class Practice_Set_4 {

    public static void main(String[] args) {
	// write your code here
//        Question1
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your physics marks: ");
//        float phy = sc.nextFloat();
//        System.out.print("Enter your chemistry marks: ");
//        float che = sc.nextFloat();
//        System.out.print("Enter your maths marks: ");
//        float math = sc.nextFloat();
//        float perc = (phy+che+math)/3.0f;
//        if(perc>=40.0 && phy>=33 && che>=33 && math>=33){
//            System.out.println("You pass");
//        }
//        else
//            System.out.println("You fail");
//        System.out.println("your percentage is: "+perc);

//        Question2
//        Scanner sc1 = new Scanner(System.in);
//        System.out.println("Enter your income: ");
//        float income = sc1.nextFloat();
//        float tax = 0;
//        if(income>0 && income<=2.5f){
//            System.out.println("No tax to pay");
//        }
//        else if(income>2.5f && income<=5.0f){
//            tax = 0.05f * (income - 2.5f)+tax;
//            System.out.println("Your payable tax is: "+tax);
//        }
//        else if(income>5.0f && income<=10.0f){
//            tax = 0.05f * (5.0f - 2.5f)+tax;
//            tax = 0.20f * (income-5.0f)+tax;
//            System.out.println("Your payable tax is: "+tax);
//        }
//        else {
//            tax = 0.05f * (5.0f - 2.5f)+tax;
//            tax = 0.20f * (10.0f-5.0f)+tax;
//            tax = 0.30f * (income - 10.0f)+tax;
//            System.out.println("Your payable tax is: "+tax);
//        }

//        Question3
//        System.out.println("Enter a number: ");
//        Scanner sc2 = new Scanner(System.in);
//        byte number = sc2.nextByte();
//        switch(number){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("You entered wrong input");

//        Question4
//        System.out.println("Enter a url: ");
//        Scanner sc3 = new Scanner(System.in);
//        String str = sc3.next();
//        if(str.endsWith(".org")){
//            System.out.println("Organization website");
//        }
//        else if(str.endsWith(".com")){
//            System.out.println("Commercial website");
//        }
//        else if(str.endsWith(".in")){
//            System.out.println("Indian website");
//        }
//        else{
//            System.out.println("No result found");
//        }

//        Question5
        System.out.println("Enter a year: ");
        Scanner sc4 = new Scanner(System.in);
        int year = sc4.nextInt();
        int rem = 0;
        if(year%4!=0){
            System.out.println("Not a leap year");
        }
        else if(year%4==0 && year%100==0 && year%400==0){
            System.out.println("Leap year");
        }
        else if(year%4==0 && year%100!=0){
            System.out.println("Leap year");
        }
        else if(year%4==0 && year%100==0 && year%400!=0){
            System.out.println("Not a leap year");
        }

    }
}
