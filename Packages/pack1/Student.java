package pack1;

public class Student {
    //Instance variables
    public String name;    //access modifier -> default
    public int age;
    public double cgpa;
    //Parametric constructor
  public Student(String name, int age, double cgpa){
        this.name = name;
        this.age = age;
        this.cgpa =  cgpa;
    }
    //Instance method -> to print details
    public void displayStudentInfo(){
        System.out.println("Name is: " + name); 
        System.out.println("Age is: " + age);
        System.out.println("CGPA is: " + cgpa);
    }
}
