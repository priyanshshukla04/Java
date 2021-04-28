abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FoundationPen extends Pen{
    public void Nib(){
        System.out.println("Blue nib");
    }
    public void write(){
        System.out.println("Writing...");
    }
    public void refill(){
        System.out.println("Refilled...");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Monkey{
    public void jump(){
        System.out.println("Jumping monkey");
    }
    public void bite(){
        System.out.println("Monkey bitten");
    }
}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Eating...");
    }
}

abstract class Telephone{
    abstract void lift();
    abstract void disconnected();
}
class SmartTelephone extends Telephone{
    public void Redial(){
        System.out.println("Redials last number..");
    }
    public void lift(){
        System.out.println("Used to reduce human load");
    }
    public void disconnected(){
        System.out.println("Phone disconnected");
    }
}
public class Practice_Set_11_abstract_class {
    public static void main(String[] args) {
        Telephone tc = new SmartTelephone();
        tc.disconnected(); tc.lift();
//        tc.Redial();   --> throws error
        

    }
}
