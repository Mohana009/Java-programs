public class ThreadDeadlockExample {
    public static void main(String[] args) {
        Object r1 = new Object();
        Object r2 = new Object();

        Thread t1 = new Thread(){
            public void run(){
                synchronized(r1){   //locks r1
                    try{
                        sleep(100);
                    }catch(Exception e){

                    }
                    synchronized(r2){   //waiting for r2

                    }
                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                synchronized(r2){   //locks r2
                    try{
                        sleep(100);
                    }catch(Exception e){

                    }
                    synchronized(r1){   //waiting for r1

                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
