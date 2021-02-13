package com.company;

public class Java_Loops {

    public static void main(String[] args) {
	// write your code here
//        While Loop
        System.out.println("While Loop....");
        int i=100;
        while(i<=105){
            System.out.println(i);
            i++;
        }

//        do-while loop
        System.out.println("Do-While Loop....");

        int a = 0;
        do{
            System.out.println(a);
            a++;
        }while(a<11);

//        for loop
        System.out.println("For Loop....");
        for(int z=5;z>0;z--){
            System.out.println(z);
        }
    }
}
