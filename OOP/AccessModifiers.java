class Employee{
    //Private instance variables -> cannot be accessed outside this class 
    private String name;
    private int age;
    private double salary;
    //Constructor
    Employee(String name, int age, double salary){
        // this.name = name;
        // this.age = age;
        // this.salary = salary;
        setName(name);
        setAge(age);
        setSalary(salary);
    }
    //Setter -> public method
    public void setName(String name){
        this.name = name;
    }
    //Setter -> public method   
    public void setAge(int age){
        if(age > 0) this.age = age;     //Checks for validity also
        else    System.out.println("Age cannot be negative");
    }
    //
    public void setSalary(double salary){
        if(salary > 0)  this.salary = salary;
        else    System.out.println("Salary cannot be negative");
    }

    //Getter -> public method
    public double getSalary(){
        return this.salary;
    }
    
}
public class AccessModifiers {
    public static void main(String[] args) {
        Employee e1 = new Employee("Tejeswari", 200, 100000);
        //System.out.println(e1.salary); -> doesn't work because salary is private instance variable
        System.out.println(e1.getSalary()); // -> so using Getter
        e1.setSalary(5000);
        System.out.println(e1.getSalary());
    }
}
