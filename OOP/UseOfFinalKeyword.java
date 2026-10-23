final class X{

    final void fun(){
        System.out.println("This is parent class");
    }
}
//for classes inheritance is not possible beacuse X is set to final

// class Y extends X{

//     //  fun() method cannot beoverridden because it is set to final

//     // void fun(){ 
//     //     System.out.println("This is child class");
//     // }
// }
public class UseOfFinalKeyword {
    public static void main(String[] args) {
        final double PI = 3.14;
        //PI = 2.14; -> It will give error beacuse of re-assigning

    }
}
