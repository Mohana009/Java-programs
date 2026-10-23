//Synchronizing thread using synchronized block 
class Greeting extends Thread{
    @Override
    public void run(){
        synchronized(this){    
            System.out.println("Hello World");
            System.out.println("Greetings from " + Thread.currentThread().getName());
        }
    }
}
public class ThreadSynchronizing {
    public static void main(String[] args) {
        Greeting g = new Greeting();
        Thread t1 = new Thread(g, "Greet1");
        Thread t2 = new Thread(g, "Greet2");

        t1.start();
        t2.start();
        
    }
}
