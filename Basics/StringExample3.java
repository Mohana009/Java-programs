public class StringExample3 {
    public static void main(String[] args) {
        String s = "hello world";
        int len = s.length();
        System.out.println(len);
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(10));

        //Run a loop on string
        for(int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }
        System.out.println();
        //Run a loop on string backward
        for(int i = s.length() - 1; i >= 0; i--){
            System.out.println(s.charAt(i));
        }
    }
}
