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
public class ConstructorExample3 {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Diameter: " + c1.getDiameter());


    }
}
