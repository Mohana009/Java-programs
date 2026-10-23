class Person{
    //Instance variables
    String name;
    int age;
    char gender;
    int height;
    //Instance methods
    void showPersonDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
    //Constructor
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

}
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 19);
        Person p2 = new Person("Bob", 19, 'M');
        p1.showPersonDetails();
        System.out.println();
        p2.showPersonDetails();
    }
}
