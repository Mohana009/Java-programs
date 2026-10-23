interface IF1 {
    void A();
    void B();
}
class class1 implements IF1{
    @Override
    public void A(){
        System.out.println("This is m1 from IF1");
    }
    @Override
    public void B(){
        System.out.println("This is m2 from IF1");
    }
}
class class2 implements IF1{
    @Override
    public void A(){
        System.out.println("This is m1 from IF1");
    }
    @Override
    public void B(){
        System.out.println("This is m2 from IF1");
    }

}
public class InterfaceExample2 {
    public static void main(String[] args) {
        IF1 r1 = new class1();
        IF1 r2 = new class2();
        r1.A();
        r1.B();
        r2.A();
        r2.B();
    }
}
