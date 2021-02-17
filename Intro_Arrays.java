package com.company;

public class Intro_Arrays {

    public static void main(String[] args) {
	// write your code here
//        Normal Array

//        1) Only declaration
        int[] arr;

//        2)Declaration and memory allocation
        int[] arr1 = new int[5];
        
//        3) Declaration, memory allocationa and initialization
        int[] arr2 = {1,2,3,4,5};
//        System.out.println(arr2[2]);

        String[] str = {"Priyansh","Shukla","Saumya","Shukla"};
        Float[] fl = {90.05f,89.05f};
        System.out.println(str.length);
        System.out.println(fl.length);

//        Displaying using for loop
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }

//        Advanced way
        System.out.println("Using for each loop");
        for (String e: str){
            System.out.println(e);
        }
    }
}
