public class SwitchExpression3 {
    public static void main(String[] args) {
        String day = "Wednesday";
        int res = switch(day){
            case "Monday" -> 1;
            case "Tuesday" -> 2;
            case "Wednesday" -> 3;
            default -> 0;
        };
        System.out.println(res);
    }
}
