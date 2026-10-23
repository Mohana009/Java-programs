class MyThread extends Thread{
    @Override
    public void run(){
        //
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
public class ThreadPriority {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        // t.start();
        Thread t1 = new Thread(t, "One");
        Thread t2 = new Thread(t, "Two");
        t1.setPriority(2);
        t2.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
    }
}
