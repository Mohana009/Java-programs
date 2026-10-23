class Circle{
    //Instance variables
    double radius;

    //Instance methods
    double getArea(){
        return 3.14 * radius *radius;
    }
    double getPerimeter(){
        return 2 * 3.14 * radius;
    }
    double getDiameter(){
        return 2 * radius;
    }
    //Constructor
    Circle(double r){
        radius = r;
    }
}
public class ArrayOfObjects {
    public static void main(String[] args) {
        Circle[] circles = {new Circle(10),
                            new Circle(20),
                            new Circle(30),
                            new Circle(45.4)};
        for(int i = 0; i < circles.length; i++){
            System.out.println("Details of Circle " + (i + 1));
            System.out.println(circles[i].getArea());
            System.out.println(circles[i].getDiameter());
            System.out.println(circles[i].getPerimeter());
            System.out.println();
        }
    }
}
