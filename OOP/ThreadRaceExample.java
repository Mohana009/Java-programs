public class ThreadRaceExample {
    static int count = 0;
    public static void main(String[] args) throws Exception{
        Thread t1 = new Thread(){
            public void run(){
                count += 1;

                try{
                    sleep(10);
                }catch(Exception e){

                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                count += 1;

                try{
                    sleep(10);
                }catch(Exception e){

                }
            }
        };

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(count);
    }
}
