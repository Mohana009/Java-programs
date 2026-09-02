public class Conversions {
    public static void main(String[] args) {
        int i = 123;
        String s = Integer.toString(i);
        System.out.println(s.length()); //123 is a string now
        System.out.println(Integer.toString(i));    //converting into string and printing
        System.out.println(Integer.toString(i, 2)); //binary of 123
        System.out.println(Integer.toString(10, 2));
        System.out.println(Integer.toString(10, 6));
    }
}
