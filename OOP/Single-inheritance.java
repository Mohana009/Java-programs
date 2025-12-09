// Parent / Base / Super class
class Person{ 
    //Instance variables
    String name;
    int age;
    char gender;

    //Instance methods
    void walk(){
        System.out.println("Walking...");
    }
    void read(){
        System.out.println("Reading...");
    }
    void showPersonDetails(){
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Gender is: " + gender);
    }
}

//child class -> An employee is a person
//Employee gets the properties and behaviours of Person
class Employee extends Person{
    //Instance variables
    int empId;
    double salary;

   //Instance methods
    void showEmpDetails(){
        this.showPersonDetails();
        System.out.println("Employee Id is: " + empId);
        System.out.println("Salary: "+ salary);
    }
    void applyALeave(){
        System.out.println("Applying for a leave");
    }
    void getPromoted(){
        System.out.println("You are promoted");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Alice";
        e1.age = 20;
        e1.gender = 'F';
        e1.empId = 1234;
        e1.salary = 10000.00;

        System.out.println("Person level details: ");
        e1.showPersonDetails();  //shows only person level details of e1
        System.out.println();

        System.out.println("Employee level details: ");
        e1.showEmpDetails();   //shows person level details and also employee level details of e1
        System.out.println();

        //e1 can walk and read (Person level)
        e1.walk();
        e1.read();

        //e1 can apply for a leave and get promoted
        e1.applyALeave();
        e1.getPromoted();
    }
}
 
