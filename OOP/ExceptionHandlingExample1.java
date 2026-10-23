public class ExceptionHandlingExample1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            System.out.println("Division : " + a / b);
        }
        catch(ArithmeticException e){
            // System.out.println(e);  //prints ecxeption -> java.lang.ArithmeticException: / by zero
            System.out.println(e.getMessage());  //prints exception message -> / by zero
        }
        System.out.println("Addition : " + a + b);
        System.out.println("Product : " + a * b);
    }
}
