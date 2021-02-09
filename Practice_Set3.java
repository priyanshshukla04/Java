package com.company;

public class Practice_Set3 {

    public static void main(String[] args) {
	// write your code here
//        Question1
        String str = "Priyansh Shukla";
        System.out.println(str.toLowerCase());

//        Question2
        System.out.println(str.replace(" ","_"));

//        Question3
        String str1 = "Dear <|name|>, Thanks a lot";
        System.out.println(str1.replace("<|name|>","Priyansh"));

//        Question4
        String str2 = "This is  me Priyansh   Shukla";
        System.out.println(str2.indexOf("  "));
        System.out.println(str2.indexOf("   "));

//        Question5
        String str3 = "Dear Harry, This Java Course is nice. Thanks";
        System.out.println("Respected Mam,\n\t This is your requested letter\nThanks");
    }
}
