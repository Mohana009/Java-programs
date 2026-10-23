class Citizen{
    //Instance variables
    String aadhar;
    String firstName;
    String lastName;
    int age;
    char gender;
    String city;

    //Instance methods
    void displayDetails(){
        System.out.println("Aadhar: " + aadhar);
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("City: " + city);
    }
    //constructors
    //No parametric constructor
    Citizen(){

    }
    //Parametric Constructors
    Citizen(String a){
        aadhar = a;
    }
    Citizen(String fn, String ln){
        firstName = fn;
        lastName = ln;
    }
    Citizen(String fn, String ln, int a){
        firstName = fn;
        lastName = ln;
        age = a;
    }
    Citizen(String c, char g, String ln){
        city = c;
        gender = g;
        lastName = ln;
    }
    Citizen(char g){
        gender = g;
    }
}

public class ConstructorTask {
    public static void main(String[] args) {
        Citizen c1 = new Citizen('F');
        c1.aadhar = "89697468";
        c1.city = "Rajahmundry";
        c1.firstName = "Teju";
        c1.lastName = "Sanaboina";
        c1.age = 200;
        c1.displayDetails();
        Citizen c2 = new Citizen("Naga", "Tejeswari", 200);
        System.out.println();
        c2.displayDetails();


        System.out.println();
        System.out.println(c1); //Hashcode of the object -> used in hashbased collections
        System.out.println(c2);
        

       

    }
}
