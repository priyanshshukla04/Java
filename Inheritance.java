package com.company;
class Animal{
    int legs;

    public void setLegs(int legs) {
        System.out.println("In base class and setting legs");
        this.legs = legs;
    }
    public int getLegs() {
        return legs;
    }
}

class Dog extends Animal{
    String color;

    public void setColor(String color) {
        System.out.println("In child class and setting color now");
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}

public class Inheritance {

    public static void main(String[] args) {
	// write your code here
        Animal an = new Animal();
        an.setLegs(4);
        System.out.println(an.getLegs());

        Dog dg = new Dog();
        dg.setColor("Black");
        System.out.println(dg.getColor());
        dg.setLegs(3);
        System.out.println(dg.getLegs());
    }
}
