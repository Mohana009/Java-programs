import java.util.ArrayList;
class Student{
    int id;
    String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString(){
        return "Student(" + id + ", " + name + ")";
    }
}
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        //To get length size()
        System.out.println("Length of arr: " + arr.size());
        System.out.println(arr);    //To quickly look

        //To access elemet at a specific index
        System.out.println(arr.get(0)); //prints 10
        System.out.println(arr.get(1)); //20
        System.out.println(arr.get(2)); //30
        System.out.println();

        //Loop on ArrayList
        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
        System.out.println();

        //for each loop
        for(Integer eachValue: arr){
            System.out.println(eachValue);
        }

        //To add element at specific index in ArrayList -> arr.add(index, value);
        arr.add(1, 100);
        System.out.println(arr);    //quick look 

        System.out.println();

        //To add elemet at the begining (At 0 index)
        arr.addFirst(500);
        System.out.println(arr);
        
        System.out.println();

        //To add element at last (At n+1 index)
        arr.addLast(1000);
        System.out.println(arr);

        System.out.println();

        //To delete element at index -> arr.remove(index);
        arr.remove(1);  //removes 10 (element at 1st index)
        System.out.println(arr);

        System.out.println();

        //To delete an element directly it should not be primitive type
        //The value should be converted into it's wrapper class
        arr.remove((Integer)1000);
        System.out.println(arr);

        System.out.println();

        //If same value is present in ArrayList for more than 1 time the left most one will be removed
        arr.add(20);
        System.out.println(arr);
        arr.remove((Integer)20);
        System.out.println(arr);

        System.out.println();

        //If the element is not present in the ArrayList and still trying to remove it
        arr.remove((Integer)2000);

        System.out.println();

        //To check if an element is present in ArrayList or nor
        System.out.println(arr.contains(500));  //true
        System.out.println(arr.contains(700));  //false

        //ArrayList of Strings
        ArrayList<String> stringArray = new ArrayList<>();

        System.out.println();

        //ArrayList of students -> class
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Alice"));
        studentList.add(new Student(2, "Bob"));
        studentList.add(new Student(3, "Charlie"));

        //for each loop on ArrayList of students
        for(Student eachStudent: studentList){
            System.out.println(eachStudent);
        }





    }
}
