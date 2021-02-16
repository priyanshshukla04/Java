package com.company;

public class Break_Continue {

    public static void main(String[] args) {
	// write your code here
//        Break statement
//     for(int i=0;i<5;i++){
//         System.out.println(i);
//         System.out.println("Iterating");
//         if(i==2){
//             System.out.println("End loop now");
//             break;
//         }
//     }

//        int i=0;
//        do{
//            System.out.println("Iterate");
//            i++;
//            if(i==2){
//                System.out.println("Exit loop");
//                break;
//            }
//        }while (i<5);

//        Continue Statement
//        for(int i=0;i<5;i++){
//         if(i==2){
//             System.out.println("Skip this iteration");
//             continue;
//         }
//            System.out.println(i);
//            System.out.println("Iterating");
//     }

        int i=0;
        do{
            i++;
            if(i==2){
                System.out.println("Skip this part");
                continue;
            }
            System.out.println(i);
            System.out.println("Iterate");
        }while (i<5);

    }
}
