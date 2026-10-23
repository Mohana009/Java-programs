import java.util.Scanner;
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
public class ArrayOfObjects2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Circle[] circles = new Circle[n];  //Allocates space for n circles but no space is allocated for each circle

        //int[] arr = new int[n]           
    
        for(int i = 0; i < n; i++){
            circles[i] = new Circle(sc.nextDouble());  //space for each circle is allocated
            // int x = sc.nextInt();
            // circles[i] = new Circle(x);
        }
        int k = 1;
        for(Circle c: circles){
            System.out.println("Details of Circle " + (k++));
            System.out.println(c.radius);
            System.out.println(c.getArea());
            System.out.println(c.getPerimeter());
            System.out.println(c.getDiameter());
        }
    }
    
}
