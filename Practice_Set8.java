package com.company;
//1
class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String newname){
        name = newname;
    }
}

//2
class CellPhone{
    public void Calling(String name){
        System.out.println("Calling "+name);
    }
    public void Ringing(){
        System.out.println("Ringing....");
    }
    public void Received(){
        System.out.println("Received");
    }
}

//3
class Square{
    int a;
    public void sides(int side){
        a = side;
    }
    public void area(){
        int area1 = a*a;
        System.out.println(area1);
    }
    public void perimeter(){
        int perimeter1 = 4*a;
        System.out.println(perimeter1);
    }
}

//4
class TommyVecetti{
    public void hit(){
        System.out.println("Hitting opponent....");
    }
    public void run(){
        System.out.println("Running opponent....");
    }
    public void fire(){
        System.out.println("Firing opponent....");
    }
}

public class Practice_Set8 {

    public static void main(String[] args) {
	// write your code here
//        Question1
//    Employee obj = new Employee();
//    obj.salary = 100000; obj.name = "Priyansh";
//        System.out.println(obj.getSalary());
//        System.out.println(obj.getName());
//        obj.setName("Anshul");
//        System.out.println(obj.getName());

//        Question2
//        CellPhone obj1 = new CellPhone();
//        obj1.Calling("Rahul"); obj1.Ringing(); obj1.Received();

//        Question3
//        Square obj2 = new Square();
//        obj2.sides(3); obj2.area(); obj2.perimeter();

//        Question4
        TommyVecetti obj3 = new TommyVecetti();
        obj3.fire(); obj3.hit(); obj3.run();
    }
}
