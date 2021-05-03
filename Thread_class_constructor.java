class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("Thank you");
//        while(true){
//            System.out.println("I am a thread");
//        }
    }
}

class Mythread2 implements Runnable{
    public void run(){
//        System.out.println("Name is");
        System.out.println("Welcomes yours");
    }
}
public class Thread_class_constructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Priyansh");
        MyThr t2 = new MyThr("Shukla");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t is " + t1.getId());
        System.out.println("The name of the thread t is " + t1.getName());
        System.out.println("The id of the thread t is " + t2.getId());
        System.out.println("The name of the thread t is " + t2.getName());
        Mythread2 t3 = new Mythread2();
        Thread sc = new Thread(t3,"Anshul");
        System.out.println(sc.getName());
        System.out.println(sc.getId()) ;
    }
}
