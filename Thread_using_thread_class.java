class MyThread1 extends Thread{
//    int i = 500;
    @Override
    public void run(){
        while(true) {
            System.out.println("This is use to run background process...");
        }
    }
}
class MyThread2 extends Thread{
//    int i = 500;
    @Override
    public void run(){
        while(true) {
            System.out.println("This is use to auto save");
        }
    }
}

public class Thread_using_thread_class {
    public static void main(String[] args) {
        MyThread1 sc1 = new MyThread1();
        MyThread2 sc2 = new MyThread2();
        sc1.start();
        sc2.start();

    }
}
