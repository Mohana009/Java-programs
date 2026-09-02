public class StaticMethods {
    static void Greeting(){
            System.out.println("Hello");
    }
    static boolean isFactor(int a, int b){
        if(b % a == 0)  return true;
        else return false;
    }
    public static void main(String[] args) {
        Greeting();
        boolean res = isFactor(2, 4);
        System.out.println(res);
    }
}
