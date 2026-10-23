class Person{
    String name;
    int age;
    void showPersonDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person{
    double salary;
    int id;
    void showEmployeeDetails(){
        this.showPersonDetails();
        System.out.println("Salary: " + salary);
        System.out.println("Id: " + id);
    }
    Employee(String name, int age, double salary, int id){
        super(name, age);
        this.salary = salary;
        this.id = id;
    }

}
public class Main2 {
    public static void main(String[] args) {
        Person p1 =new Person("Alice", 19);
        Employee e1 = new Employee("Bob", 17, 20000.0, 12345);
        p1.showPersonDetails();
        System.out.println();
        e1.showEmployeeDetails();
    }
}
