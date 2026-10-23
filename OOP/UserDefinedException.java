import java.util.Scanner;

class MyException extends Exception{
    public MyException(String messsage){
        super(messsage);
    }
}
public class UserDefinedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        try{
            age = sc.nextInt();
            if(age < 0)    throw new MyException("Age cannot be negative");
            else    System.out.println("Your age is " + age);
        }
        catch(MyException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
