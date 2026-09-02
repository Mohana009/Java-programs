public class SwitchExpression4 {
    public static void main(String[] args) {
        int d = 5;
        String res = switch(d){
            case 1, 7 -> "Weekend";
            case 2, 3, 4, 5, 6 -> "Week days";
            default -> "Invalid day";
        };
        System.out.println(res);
    }
}
