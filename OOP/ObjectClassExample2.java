import java.util.Scanner;
class Product{
    String name;
    double price;
    Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    @Override //Possible because Object class is parent class of every class
    public String toString(){
        return "Product(" + name + ", " + price + ")";
    }
}
public class ObjectClassExample2 {
    public static void main(String[] args) {
        Product pro1 = new Product("Laptop", 56000);
        System.out.println(pro1);
        System.out.println();
        Product pro2 = new Product("Chair", 5000);
        System.out.println(pro2);
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
    }
}
