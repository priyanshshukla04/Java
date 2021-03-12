package com.company;
class Base{
    Base(){
        System.out.println("I am base class constructor with no arguments");
    }
    Base(int a){
        System.out.println("I am overloaded constructor of base class with one argument and a value as: "+a);
    }
}

class Derived extends Base{
    Derived(){
        System.out.println("I am constructor of derived class with no argument");
    }
    Derived(int a,int b){
        super(a);
        System.out.println("I am overloaded constructor of derived class with two argument and b value as: "+b);
    }
}

class ChildOfDerived extends Derived{
    ChildOfDerived(){
        System.out.println("I am constructor of child of Derived class with no argument");
    }
    ChildOfDerived(int a,int b,int c){
        super(a,b);
        System.out.println("I am overloaded constructor of child of derived class with three argument and c value as: "+c);
    }
}

public class Constructor_With_Inheritance {

    public static void main(String[] args) {
	// write your code here
//         Base b = new Base();
//         Derived d = new Derived();
//         Derived d1 = new Derived(14, 9);
//         ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd1 = new ChildOfDerived(1, 2, 3);

    }
}
