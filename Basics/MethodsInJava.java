public class MethodsInJava {
    static char lastChar(String S1){
        int l = S1.length();
        return S1.charAt(l-1);
    }
    public static void main(String[] args) {
        System.out.println(lastChar("   Maya   ")); //space is printed
    }
}
