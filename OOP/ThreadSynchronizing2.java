//Synchronizing thread synchronized keyword
class Greeting extends Thread{
    public synchronized void run(){
        System.out.println("Hello World");
        System.out.println("Greetings from " + Thread.currentThread().getName());
    }
}
public class ThreadSynchronizing2 {
    public static void main(String[] args) {
        Greeting g = new Greeting();
        Thread t1 = new Thread(g, "Greet1");
        Thread t2 = new Thread(g, "Greet2");

        t1.start();
        t2.start();
    }
}
