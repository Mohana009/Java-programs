public class StringExample4 {
    public static void main(String[] args) {
        String s = "hello world";
        for(int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i) + "-->" + (int)s.charAt(i));
        }
    }
}
