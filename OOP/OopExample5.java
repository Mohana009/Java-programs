class Student{
    //instance variables
    String name;
    int rollno;
    String branch;
    int sub1Marks;
    int sub2Marks;
    int sub3Marks;
    int totalMarks;
    char grade;

    //instance methods
    void displayStudentDetails(){
        System.out.println("Name: " + name);
        System.out.println("RollNo: " + rollno);
        System.out.println("Branch: " + branch);
        System.out.println("sub1 Marks: " + sub1Marks);
        System.out.println("sub2 Marks: " + sub2Marks);
        System.out.println("sub3 Marks: " + sub3Marks);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Grade: " +grade);
    }
    int getTotalMarks(){
        totalMarks = sub1Marks + sub2Marks + sub3Marks;
        return totalMarks;
    }
    char getGrade(){
        if(totalMarks > 260) grade = 'A';
        else if(totalMarks >= 200 && totalMarks < 260)   grade = 'B';
        else if(totalMarks >= 150 && totalMarks < 200)   grade = 'C';
        else if(totalMarks >= 100 && totalMarks < 150)   grade = 'D';
        else grade= 'E';
        return grade;
    }
}

public class OopExample5 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";
        s1.rollno = 72;
        s1.branch = "AIML";
        s1.sub1Marks = 100;
        s1.sub2Marks = 70;
        s1.sub3Marks = 40;
        System.out.println(s1.getTotalMarks());
        System.out.println(s1.getGrade());
        s1.displayStudentDetails();
        System.out.println();
        Student s2 = new Student();
        s2.displayStudentDetails();
    }
}
