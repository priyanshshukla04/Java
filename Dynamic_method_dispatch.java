package com.company;
class Phone{
    public void time(){
        System.out.println("The time is 5:48 pm");
    }
    public void Turn_on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void Turn_on(){
        System.out.println("Turning on Smart phone...");
    }
}

public class Dynamic_method_dispatch {

    public static void main(String[] args) {
	// write your code here
        Phone obj = new SmartPhone();
        obj.time();
        obj.Turn_on();
    //  obj.music();    //not allowed
    }
}
