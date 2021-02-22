package com.company;

public class Practice_set_6 {
    public static void main(String[] args) {

        // write your code here
//        Question1
//        Float[] fl = {90.0f,85.0f,89.0f,62.0f,75.0f};
//        float sum = 0;
//        for(int i=0;i<fl.length;i++){
//            sum = sum+fl[i];
//        }
//        System.out.println(sum);

//        Question2
//        Float[] fl = {90.0f, 85.0f, 89.0f, 62.0f, 75.0f};
//        float num = 90.0f;
//        boolean ifpre = false;
//        for (int i = 0; i < fl.length; i++) {
//            if (num == fl[i]) {
//                ifpre = true;
//                break;
//            }
//            if (ifpre) {
//                System.out.println("Present in array");
//            } else
//                System.out.println("Not present");

//        Question3
//          Float[] fl = {90.0f, 85.0f, 89.0f, 62.0f, 75.0f};
//          float ave = 0;
//          int num = 0;
//          float sum = 0;
//          for(int i=0;i<fl.length;i++){
//              sum = sum + fl[i];
//              num = num +1;
//          }
//          ave = sum/num;
//        System.out.println("Average is: "+ave);

//        Question4
//        int[][] arr1 = {{1,2,3},{4,5,6}};
//        int[][] arr2 = {{1,2,3},{4,5,6}};
//        int[][] sum = new int[2][3];
//        for(int i=0;i<arr1.length;i++){
//            for(int j=0;j<3;j++){
//                sum[i][j] = arr1[i][j] + arr2[i][j];
//            }
//        }
//        for(int a=0;a<sum.length;a++) {
//            for (int b = 0; b < 3; b++) {
//                System.out.print(sum[a][b]+" ");
//            }
//            System.out.println();
//        }

//        Question5
        int[] arr = {1, 21, 3, 4, 5, 34, 67};
        int len = arr.length;
        int temp = 0;
        int num = Math.floorDiv(len,2);
        System.out.println("Before reversing: ");
        for(int i=0;i<num;i++){
            temp = arr[i];
            arr[i] = arr[len-i-1];
            arr[len-i-1] = temp;
        }
        System.out.println("After reversing: ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }

//        Question6
//        int[] arr1 = {-10,-4,-6,2,-7,-4,-7,-3,-11,-12};
//        int max = arr1[0];
//        for(int i=1;i<arr1.length;i++){
//            if(arr1[i]>max)
//                max = arr1[i];
//            else
//                continue;
//        }
//        System.out.println("Maximum element is: "+max);

//        Question7
//          int[] arr1 = {-12,-4,-6,2,-7,-4,-7,-3,-11,-10};
//          int min = arr1[0];
//          for(int i=1;i<arr1.length;i++){
//            if(arr1[i]<min)
//                min = arr1[i];
//            else
//                continue;
//          }
//          System.out.println("Minimum element is: "+min);

//        Question8
//        int[] arr1 = {-12,-4,-6,2,-7,-4,-7,-3,-11,-10};
//        int[] ar = {6,5,4,3,2,1};
//        boolean iftrue = true;
//        boolean iftrue1 = true;
//        for(int i=0;i<ar.length-1;i++){
//            if(ar[i]>ar[i+1]){
//                iftrue = false;
//                break;
//            }
//            else
//                continue;
//        }
//        for(int j=0;j<ar.length-1;j++){
//            if(ar[j]<ar[j+1]){
//                iftrue1 = false;
//            }
//            else
//                continue;
//        }
//        if(iftrue || iftrue1)
//        System.out.println("The array is sorted");
//        else
//            System.out.println("Not sorted");

    }
}
