package com.company;

public class StringMethods_EscapeSequences {

    public static void main(String[] args) {
	// write your code here
        String name = "Priyansh";
        int len = name.length();
//      System.out.println(len);
//      System.out.println(name.toLowerCase());
//      System.out.println(name.toUpperCase());
        String name1 = "     Shukla    ";
//      System.out.println(name1.trim());
//      System.out.println(name.substring(2));
//      System.out.println(name.substring(2,7));
//      System.out.println(name.replace('y','d'));
//      System.out.println(name.startsWith("Pr"));
//      System.out.println(name.startsWith("de"));
//      System.out.println(name.endsWith("sh"));
//      System.out.println(name.endsWith("h"));
//      System.out.println(name.endsWith("pr"));
//      System.out.println(name.charAt(3));

//        will return -1 if match is not found
//        System.out.println(name.indexOf('d'));
//        System.out.println(name.indexOf('y'));

        String name2 = "PriyanshShukla";
//        System.out.println(name2.indexOf('a',5));
//        System.out.println(name2.lastIndexOf('a'));
//        System.out.println(name2.lastIndexOf('a',10));
        System.out.println(name.equals("Priyansh"));
        System.out.println(name.equalsIgnoreCase("priYaNsh"));


//        Escape Sequences
//        double quotes
        System.out.println("I am \"Priyansh Shukla\"");
//        backslash
        System.out.println("I am \\Priyansh\\Shukla");
//        newline
        System.out.println("I am \nPriyansh Shukla");
//        tab
        System.out.println("I am \t Priyansh Shukla");
//        single quote
        System.out.println("I am \'Priyansh Shukla\'");

    }


}
