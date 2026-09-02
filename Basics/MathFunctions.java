public class MathFunctions {
    public static void main(String[] args) {
        int a = -12;
        System.out.println(Math.abs(a));
        System.out.println(Math.sqrt(25));
        int b = (int)Math.sqrt(30);         //type casting double to int
        System.out.println(b);
        System.out.println(Math.pow(2, 3));
        int c = (int)Math.pow(2, 3);    //type casting double to int
        System.out.println(c);
        System.out.println(Math.max(10, 20));
        System.out.println(Math.max(Math.max(10, 20), 30));
    }
}
