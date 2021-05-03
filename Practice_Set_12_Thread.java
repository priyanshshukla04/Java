class MyThread1 extends Thread{
    public void run(){
        System.out.println("good morning...");
    }
}
class MyThread2 extends Thread{
    public void run(){
        try{
            Thread.sleep(200);
        }catch(Exception  e){
            System.out.println(e);
        }
        System.out.println("Welcome");
    }
}

public class Practice_Set_12_Thread {
    public static void main(String[] args) {
        MyThread1 sc1 = new MyThread1();
        MyThread2 sc2 = new MyThread2();
        sc1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(sc1.getPriority());
        System.out.println(sc1.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
