class Employee{

    //Instance variables
    String name, department;
    int age;
    double salary;
    char gender;

    //Constructors
    Employee(String name, String department){
        this.name = name;
        this.department = department;
    }
    Employee(String name, String department, int age){
        this(name, department); //Constructor chaining
        this.age = age;
    }
    Employee(String name, String department, int age, double salary, char gender) {
        this(name, department, age);    //Constructor chaining
        this.salary = salary;
        this.gender = gender;
    }
}
public class ChainingOfConstructorUsingThisKeyword {
    public static void main(String[] args) {
        Employee e1 = new Employee("Teju", "AIML", 12);
        
    }
}
