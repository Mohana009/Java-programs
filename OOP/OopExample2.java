class Rectangle{
    //instance variables
    int length;
    int breadth;
    int area;
    int perimeter;
    //instance methods
    void showDetails(){
        System.out.println("length: " + length);
        System.out.println("breadth: " + breadth);
    }
    int getArea(){
        area = length * breadth;
        return area;
    }
    int getPerimeter(){
        perimeter = 2 * (length + breadth);
        return perimeter;
    }
}
public class OopExample2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.breadth = 20;
        r1.showDetails();
        System.out.println(r1.getArea());
        System.out.println(r1.area);
        System.out.println(r1.perimeter);   //before calculating
        System.out.println(r1.getPerimeter());
        Rectangle r2 = new Rectangle();
        r2.length = 100;
        r2.breadth = 200;
        r2.showDetails(); 
    }
}
