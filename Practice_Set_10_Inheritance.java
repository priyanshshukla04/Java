package com.company;
//  1
class Circle{
    public int radius;
    Circle(){
        System.out.println("I am constructor of Circle class...");
    }
    Circle(int r){
        this.radius = r;
        System.out.println("Value of r is.."+r);
    }
    void CircleArea(){
        double area = Math.PI*radius*radius;
        System.out.println("Area of cirlce is.."+area);
    }
}

class Cylinder extends Circle{
    public int height;
    Cylinder(){
        System.out.println("I am constructor of Cylinder class...");
    }
    Cylinder(int r, int h){
        super(r);
        System.out.format("Value of r is %d and h is %d\n",r,h);
        this.height = h;
    }
    void CylinderVolume(){
        double volume = Math.PI*radius*radius*height;
        System.out.println("Volume of cylinder is.."+volume);
    }
}

public class Practice_Set_10_Inheritance {

    public static void main(String[] args) {
	// write your code here
//        Circle cr = new Circle(4);
    //  Cylinder cy = new Cylinder();
        Cylinder cy = new Cylinder(6,5);
        cy.CylinderVolume();
        cy.CircleArea();
    }
}
