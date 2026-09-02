import java.util.*;
public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char c = sc.next().charAt(0);
        int res = switch(c){
            case '+' -> a+b;
            case '-' -> a-b;
            case '*' -> a*b;
            case '/' -> a/b;
            default -> a ^ b;
        };
        System.out.println(res);
    }
}
