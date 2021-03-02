package com.company;

class Student_Intern{
    int id;
    int stripend;
    String name;
    String surname;
    public void details(){
        System.out.println("Name is: "+name);
        System.out.println("Id is: "+id);
        System.out.println("Stripend is: "+stripend);
    }

    public String lastname(){
        return surname;
    }

}

public class Custom_Class {

    public static void main(String[] args) {
	// write your code here
        Student_Intern obj1 = new Student_Intern();
        obj1.name = "Priyansh"; obj1.id = 90; obj1.stripend = 30000; obj1.surname = "Shukla";
        obj1.details();
        obj1.lastname();

        Student_Intern obj2 = new Student_Intern();
        obj2.name = "Rajesh"; obj2.id = 20; obj2.stripend = 12000; obj2.surname = "Lincoln";
        obj2.details();
        obj2.lastname();
    }
}
