public class MethodOverloading1 {
    //overloaded method
    static void add(int a, int b){
        System.out.println(a + b);
    }
    //overloaded method -> change in no.of parameters
    static void add(int a, int b, int c){
        System.out.println(a + b + c);
    }
    //overloaded method -> change in no.of parameters
    static void add(int a, int b, int c, int d){
        System.out.println(a + b + c + d);
    }
    //overloaded method -> change in type of parameter
    static void add(double a, double b){
        System.out.println(a + b);
    }
    //overloaded methos -> change in type of parameter
    static void add(String s){
        System.out.println(s.charAt(0) + s.charAt(s.length() - 1));
    }
    //overloaded method -> change in type of parameter
    static void add(int[] arr){
        int sum = 0;
        for(int eachValue: arr){
            sum += eachValue;
        }
        System.out.println(sum);
    }

    //by changing the order of parameters
    static void add(String x, int p){
        System.out.println(x.charAt(0) + p);
    }
    static void add(int p, String x){
        System.out.println(p + x.charAt(x.length() - 1));
    }
    public static void main(String[] args) {
        add(10, 20);
        add(10, 20, 30);
        add(10, 20, 30,40);
        add(1.2, 2.1);
        add(new int[] {10, 20, 30});
        add("name");
        add("hello", 2);
        add(2, "hello");   

    }
}
