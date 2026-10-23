class Square{

    //instance variables(attribute / property)
    int side;
    int area;
    int perimeter;

    //instance methods
    void calculateArea(){
        area = side * side;
    }
    void calculatePerimeter(){
        perimeter = 4 * side;
    }
}

public class OopExample1 {
    public static void main(String[] args) {
        //Create an object of Square class
        //ClassName obj_name = new ClassName();
        
        Square s1 = new Square();
        s1.side = 10;
        System.out.println(s1.area);    //before calculation
        s1.calculateArea();
        System.out.println(s1.area);    //after calculation
        s1.calculatePerimeter();
        System.out.println(s1.perimeter);
        Square s2 = new Square();
        s2.side = 20;
        s2.calculateArea();
        System.out.println(s2.area);


    }
}
