interface MathOps{
    //The methods in interface are by default public + abstract
    int factorial(int n);
}
abstract class MyMath1 implements MathOps{
    //In abstract methods the overriding method should not have weaker access that overridden method
    //So this method is set to public
    @Override
    //Iterative
    public int factorial(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f *= i;
        }
        return f;
    }
}
class MyMath2 implements MathOps{
    //Recursive
    public int factorial(int n){
        if(n <= 1)  return 1;
        return n * factorial(n - 1);
    }
}
public class InterfaceExample1 {
    public static void main(String[] args) {
        MyMath1 m1 = new MyMath1();
        System.out.println(m1.factorial(5));

        MyMath2 m2 = new MyMath2();
        System.out.println(m2.factorial(5));
    }
}
