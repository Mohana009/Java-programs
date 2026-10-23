class Circle{
    //instance variables
    double radius;
    double diameter;
    double area;
    //instance methods
    double getDiameter(){
        diameter = 2 * radius;
        return diameter;
    }
    double getArea(){
        area = 3.14 * radius * radius;
        return area;
    }
    void displayCircleDetails(){
        System.out.println("Radius: " + radius);
        System.out.println("Diameter: "  + diameter);
        System.out.println("Area: " + area);
    }
}

public class OopExample3 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 10.9;
        c1.getDiameter();
        c1.getArea();
        c1.displayCircleDetails();
        Circle c2 = new Circle();
        System.out.println();
        c2.radius = 20.9;
        c2.getDiameter();
        c2.getArea();
        c2.displayCircleDetails();
    }
}
