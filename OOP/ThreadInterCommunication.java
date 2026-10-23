class Communication{
    public synchronized void getData(){
        try{
            wait();
        }
        catch(Exception e){

        }
    }

    public synchronized void produceData(){
        notifyAll();
    }
}
public class ThreadInterCommunication {
    public static void main(String[] args) {
        Communication obj = new Communication();

        Thread t1 = new Thread(){
            public void run(){
                obj.getData();
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                try{
                    Thread.sleep(100);
                }
                catch(Exception e){

                }
                obj.produceData();
            }
        };

        t1.start();
        t2.start();
    }
}
