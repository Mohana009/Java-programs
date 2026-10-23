class DOB{
    //Instance variables
    int date;
    int month;
    int year;

    //Constructor
    DOB(int date, int month, int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }
    
    @Override
    public String toString(){
        return date + "-" + month + "-" + year;
    }
    //If not overridden here s1.dateOfBirth prints hashcode
}
class Student{
    int id; //int
    String name;    //String
    DOB dateOfBirth;    //DOB -> -> defined by us -> THINKING IN TYPES
    //Structure -> user defined data type

    //Constructor
    Student(int id, String name, DOB dateOfBirth){
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
}
public class CompositionExample {
    public static void main(String[] args) {
        DOB dob1 = new DOB(17, 5, 2001);
        Student s1 = new Student(101, "Alice", dob1);
        // Student s1 = new Student(101, "Alice", new DOB(17, 5, 2001));
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.dateOfBirth);
        //If not overridden toString() method in DOB class s1.dateOfBirth prints hashcode

    }
}
