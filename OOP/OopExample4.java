class Product{

    //instance variables
    String name;
    double price;
    int stockQuantity;
    double discountPercentage;
    double discountAmount;

    //instance methods
    void displayProductDetails(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Stock quantity: " + stockQuantity);
        System.out.println("Discount percentage: " + discountPercentage);
        System.out.println("Discount amount: " + discountAmount);
    }
    double getDiscountAmount(){
        discountAmount = price * discountAmount;
        return discountAmount;
    }
}

public class OopExample4 {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.displayProductDetails();
        System.out.println();
        p1.name = "Mugs";
        p1.price = 89.78;
        p1.stockQuantity = 80;
        p1.getDiscountAmount();
        p1.displayProductDetails();
    }
}
