abstract class Polygon{ //Parent -> abstract
    abstract void printArea();
    abstract void printPerimeter();
}
class Square extends Polygon{
    //Instance variables
    int side;
    
    //Instance methods
    @Override
    void printArea(){
        System.out.println(side * side);
    }
    @Override
    void printPerimeter(){
        System.out.println(4 * side);
    }

    //Constructor
    Square(int side){
        this.side = side;
    }
}
class Rectangle extends Polygon{
    //Instance variables
    int length;
    int breadth;

    //Instance methods
    @Override
    void printArea(){
        System.out.println(length * breadth);
    }
    @Override
    void printPerimeter(){
        System.out.println(2 * (length + breadth));
    }

    //Constructor
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
}
class Triangle extends Polygon{
    //Instance variables
    int a, b, c;

    //Instance methods
    @Override
    void printArea(){
        double s = (a + b + c) / 2.0;
        double ans = s * (s - a) * (s - b) * (s - c);
        System.out.println(Math.sqrt(ans));
    }
    @Override
    void printPerimeter(){
        System.out.println(a + b + c);
    }

    //Constructor
    Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

}
public class AbstractClassExample2 {
    public static void main(String[] args) {
        Square s1 = new Square(2);
        s1.printArea();
        s1.printPerimeter();

        Rectangle r1 = new Rectangle(2, 3);
        r1.printArea();
        r1.printPerimeter();

        Triangle t1 = new Triangle(2, 3, 4);
        t1.printArea();
        t1.printPerimeter();
    }
}
