
// Parent/Base/Super class
class Person{ 
    String name;
    int age;
    char gender;
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
//child class 1 -> An employee is a person
class Employee extends Person{
    int empId;
    double salary;
    //Constructor
    // Employee(String name, int age, char gender, int empId, double salary){
    //     this.name = name;
    //     this.age = age;
    //     this.gender = gender;
    //     this.empId = empId;
    //     this.salary = salary;
    // }
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
//child class 2 -> A student is a person
class Student extends Person{
    String rollNumber;
    String branch;
    double cgpa;
    double fee;
    void takeExam(){
        System.out.println("Writing an exam");
    }
}
//Multi-level Inheritance:
//Grandparent -> Person
//Parent -> Employee
//Child -> Professor
class Professor extends Employee{
    String[] subjects;
    String[] papers;
    String branch;
    void takeClass(){
        System.out.println(name + " is taking a class");
    }
}
public class InheritanceExample1 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.showEmpDetails();   //shows person level details and also employee level details
        System.out.println();

        //Professor is a person
        //Professor is an employee
        Professor p1 = new Professor();
        p1.name = "Professor";
        p1.age = 90;
        p1.empId = 57690;
        p1.subjects = new String[3];
        p1.subjects[0] = "C";
        p1.subjects[1] = "Java";
        p1.papers = new String[4];
        p1.papers[0] = "A new view on AI";
        p1.walk();          //From grandparent
        p1.applyALeave();   //From parent
        p1.takeClass();     //From child

    }
}
