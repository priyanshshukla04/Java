import org.w3c.dom.css.Rect;

class Cylinder{
    private float radius;
    private float height;

    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    public float getHeight() {
        return height;
    }
    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double Calculate_Area(){

        return (2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
    }
    public double Calculate_Volume(){
        return Math.PI*radius*radius*height;
    }
}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        this.length = 3;
        this.breadth = 4;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class Practice_Set_9 {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder(9,12);
        obj.setHeight(20); obj.setRadius(5);
        System.out.println(obj.getHeight());
        System.out.println(obj.getRadius());

        System.out.println("The surface area is: "+obj.Calculate_Area());
        System.out.println("The volume is: "+obj.Calculate_Volume());

        Rectangle r = new Rectangle(12,3);
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());
        Rectangle r1 = new Rectangle();
        System.out.println(r1.getLength());


    }
}
