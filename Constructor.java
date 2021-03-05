package com.company;

class MyEmployee{
    private int id;
    private String name;

    public MyEmployee(){
        id = 0;
        name = "Priyansh";
    }
    public MyEmployee(int n,String name1){
        id = n;
        name = name1;
    }

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int a){
        id = a;
    }
    public int getId(){
        return id;
    }
}

public class Constructor {

    public static void main(String[] args) {
	// write your code here
        MyEmployee obj = new MyEmployee();
        MyEmployee obj1 = new MyEmployee(12,"Rahul");
//        obj.setId(90); obj.setName("Priyansh");
        System.out.println(obj.getId());
        System.out.println(obj.getName());
        System.out.println(obj1.getId());
        System.out.println(obj1.getName());
    }
}
