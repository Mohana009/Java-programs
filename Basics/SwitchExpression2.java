public class SwitchExpression2 {
    public static void main(String[] args) {
        int n = 1;
        int res = switch(n){
            case 1 -> 10;
            case 2 -> 20;
            default -> 0;
        };
        System.out.println(res);
    }
}
