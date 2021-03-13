class Base{
    public void First(){
        System.out.println("I am method of Base class");
        int a = 0;
        System.out.println(a);
    }
}

class Derived extends Base{
    @Override
    public void First(){
        System.out.println("I am method of derived class");
        int a = 1;
        System.out.println(a);
    }
}
public class method_overriding {
    public static void main(String[] args) {
        Base obj = new Base();
        obj.First();
        Derived obj1 = new Derived();
        obj1.First();
    }
}
