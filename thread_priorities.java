class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 34;

        while(true){
//            System.out.println("I am a thread");
            System.out.println("Task Is: " + this.getName());
        }

    }
}

public class thread_priorities {
    public static void main(String[] args) {
        // Ready Queue: T1 T2 T3 T4 T5
        MyThr1 t1 = new MyThr1("Cursor movement(most important)");
        MyThr1 t2 = new MyThr1("Saving");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();

    }
}
