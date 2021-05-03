class MyThread1 implements Runnable{
    public void run(){
        while(true){
            System.out.println("Used to run background process..");
        }
    }
}
class MyThread2 implements Runnable{
    public void run(){
        while(true){
            System.out.println("Used to auto save");
        }
    }
}

public class Thread_using_Runnable_interface {
    public static void main(String[] args) {
        MyThread1 sc1 = new MyThread1();
        Thread t1 = new Thread(sc1);
        t1.start();
        MyThread2 sc2 = new MyThread2();
        Thread t2 = new Thread(sc2);
        t2.start();
    }
}
