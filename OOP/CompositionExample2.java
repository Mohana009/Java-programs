class Point{
    //Instance variables
    int x, y;
    //Constructor
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "Point(" + x + ", " + y + ")";
    }
}
class StraightLine{
    //Instance variables
    Point p1, p2;
    //Constructor
    StraightLine(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    //Instance method
    double getLength(){
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }
}
public class CompositionExample2 {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(3, 2);
        // StraightLine line1 = new StraightLine(new Point(2, 3), new Point(3, 2));
        StraightLine line1 = new StraightLine(p1, p2);
        System.out.println(line1.getLength());
        // System.out.println(s1 instanceof StarightLine);
        // System.out.println(s1 instanceof Point);
        System.out.println(line1.p1);
        System.out.println(line1.p2);
        System.out.println(line1 instanceof StraightLine);
        // System.out.println(line1 instanceof Point); -> error
    } 
}
