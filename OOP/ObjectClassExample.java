class Y{
    void method3(){
        System.out.println("This is method 3");
    }
    void method4(){
        System.out.println("This is method 4");
    }
}

class X extends Y{
    void method1(){
        System.out.println("This is method 1");
    }
    void method2(){
        System.out.println("This is method 2");
    }
}
public class ObjectClassExample {
    public static void main(String[] args){
        X obj = new X();
        System.out.println(obj instanceof X);   //true
        System.out.println(obj instanceof Y);   //because X is child of Y
        System.out.println(obj instanceof Object);  //Object is parent of every class

    }
}
