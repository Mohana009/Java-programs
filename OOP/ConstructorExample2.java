class Product{
    //Instance variables
    int id;
    String name;
    String type;
    double price;
    int discountPercentage;

    //Instance methods
    void printProductDetails(){
        System.out.println("Id: " +id);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Discount percentage: " + discountPercentage);
    } 
    double getDiscountAmount(){
        return price * (discountPercentage / 100.0);
    }

    //Constructor (Parametric)
    Product(int i, String n, String t, double p, int dp){
        id = i;
        name = n;
        type = t;
        price = p;
        discountPercentage = dp;
    }
    
}
public class ConstructorExample2 {
    public static void main(String[] args) {
        Product p1 = new Product(7898, "Teju's phone", "Mobile", 10000, 50);
        p1.printProductDetails();
        System.out.println(p1.getDiscountAmount());

    }
}
