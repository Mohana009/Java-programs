class Person {
  // Instance variables
  String name;
  int age;
  char gender;

  // Instance method
  void showPersonDetails() {
    System.out.println("Name is: " + name);
    System.out.println("Age is: " + age);
    System.out.println("Gender is: " + gender);
  }

  // A no-parametric constructor
  Person(){

  }

  // A parametric constructor
  Person(String name, int age, char gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
  
}
class Employee extends Person {
    // Using super class constructor

    //Instance variables
    int empId;
    double salary;
    String org;

    //Constructor
    Employee(String name, int age, char gender, int empId, double salary, String org) {

      // You can only call super class constructor from sub-class constructor
      super(name, age, gender);
      this.empId = empId;
      this.salary = salary;
      this.org = org;
    }

    //Instance method
    void showEmployeeDetails() {
      showPersonDetails();
      System.out.println("Employee id: " + empId);
      System.out.println("Salary is: " + salary);
      System.out.println("Ogranization is: " + org);
    }
}
class Student extends Person {
  //Instance variables
  String rollNumber;
  String branch;
  double cgpa;

  //Constructor
  Student(String name, int age, char gender, String rollNumber, String branch, double cgpa) {
    super(name, age, gender);
    this.rollNumber = rollNumber;
    this.branch = branch;
    this.cgpa = cgpa;
  }

  //Instance method
  void showStudentDetails() {
    showPersonDetails();
    System.out.println("Roll Number is: " + rollNumber);
    System.out.println("Branch is: " + branch);
    System.out.println("CGPA is: " + cgpa);
  }
}
public class ConstructorsInInheritanceDemo {

  //Static method
  static void fun(Person p){
    if(p instanceof Employee){  //instanceof gives the right handed on i.e, Person p1 = new Employee();
      ((Employee)p).showEmployeeDetails();
    }
    else{
      ((Student)p).showStudentDetails();
    }
  }
  public static void main(String[] args) {

    // Employee e1 = new Employee("Alice", 20, 'F', 123, 50000, "Google");
    // e1.showEmployeeDetails();
    // Student s1 = new Student("Bob", 15, 'M', "24P31Axxxx", "CSE", 7.8);
    // s1.showStudentDetails();
    // Person p1 = new Person("Charlie", 45, 'M');
    // p1.showPersonDetails();

    Person p1 = new Employee("Alice", 25, 'F', 2345, 20000.00, "Thub");
    Person p2 = new Student("Bob", 17, 'M', "24P3xxxxxx", "AIML", 9.5);

    //p1.showEmployeeDetails() -> doesn't work
    // p1.showPersonDetails(); // -> this only works because p1 is from Person super class
    // System.out.println();
    
    //Type casting
    ((Employee)p1).showEmployeeDetails();
    System.out.println();
    ((Student)p2).showStudentDetails();
    System.out.println();
    fun(p1);
    System.out.println();
    fun(p2);

  }
}
