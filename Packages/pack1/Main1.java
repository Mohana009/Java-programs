package pack1;

public class Main1 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 17, 5.6);
        s1.displayStudentInfo();    //method
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.cgpa);
    }
}
