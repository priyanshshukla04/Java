
abstract class Animal{
    abstract public void DogName();
    abstract public void CatName();
    Animal(){
        System.out.println("This is the animal class");
    }
}

class Dog extends Animal{
    @Override
    public void DogName(){
        System.out.println("Dog name is Tiger");
    }
    @Override
    public void CatName(){
        System.out.println("Cat name is Simmy");
    }
}

abstract class Cat extends Animal{
    @Override
    public void CatName(){
        System.out.println("Cat belongs to lion family thus lion");
    }
}

public class Abstract_class_method_java {
    public static void main(String[] args) {
//       Animal a = new Animal();    error
        Dog d = new Dog();
        d.CatName();
        d.DogName();
//        Cat c = new Cat();   error
    }
}
