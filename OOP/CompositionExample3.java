class Subject{
    //Instance variables
    String name;
    String type;
    int credits;
    //Constructor to initialize variables
    Subject(String name, String type, int credits){
        this.name = name;
        this.type = type;
        this.credits = credits;
    }
    //Method overriding to print something meaningful when we try to print the object
    @Override
    public String toString(){
        return "Subject(" + name + ", " + type + ", " + credits + ")";
    }
}
class Branch{
    //Instance variables
    String name;
    String bhavan;
    int floor;
    String hod;
    int code;
    //Constructor
    Branch(String name, String bhavan, int floor, String hod, int code){
        this.name = name;
        this.bhavan = bhavan;
        this.floor = floor;
        this.hod = hod;
        this.code = code;
    }
    @Override
    public String toString(){
        return "Branch(" + name + ", " + bhavan + ", " + floor + ", " + hod + ", " + code + ")";
    }
}
class Student{
    //Instance variables
    String rollNumber;
    String name;
    int age;
    Branch branch;  //Composition
    Subject[] Subjects; //Composition -> here it is array of Subject like array of int -> int[] arr;

    //Constructor
    Student(String rollNumber, String name, int age, Branch branch, Subject[] Subjects){
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.branch = branch;
        this.Subjects = Subjects;
    }
    //Instance Method
    void showStudentDetails(){
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        //Since the toString() in Branch class is overridden hashcode will not be printed
        System.out.println("Branch: " + branch);
        //Subjects is an array so we need loop to print
        for(Subject subs: Subjects){
            System.out.println(subs);   //Here also overridden
        }
    }


}
public class CompositionExample3 { 
    public static void main(String[] args) {
        Branch b1 = new Branch("AIML", "Ratan Tata", 3, "XYZ", 23);
        Subject[] subs = { new Subject("Python", "Lab", 4),
                         new Subject("Java", "Theory", 3)

                        };
        Student s1 = new Student("24p31axxxx", "Alice", 17, b1, subs);
        s1.showStudentDetails();
    }
}
