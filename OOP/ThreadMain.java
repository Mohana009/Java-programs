public class ThreadMain {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);  // reference -> [thread_name, priority, thread_group]
        System.out.println(t.getName());    // name
    }
}
