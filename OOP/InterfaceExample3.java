//Problem with Inheritance

interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}
class Bird{
    //Instance variables
    String colour;
    char gender;
    //Instance methods
    void sleep(){
        System.out.println("Sleeping...");
    }
    void eat(){
        System.out.println("Eating...");
    }
}
class Sparrow extends Bird implements Flyable{
    @Override
    public void fly(){
        System.out.println("Sparrow is flying");
    }
}
class Crow extends Bird implements Flyable{
    @Override 
    public void fly(){
        System.out.println("Crow is flying");
    }
}
class Penguin extends Bird implements Swimmable{
    @Override
    public void swim(){
        System.out.println("Penguin is swimming");
    }
}
class Ostrich extends Bird{

}
class Duck extends Bird implements Flyable, Swimmable{
    @Override
    public void fly(){
        System.out.println("Duck is flying");
    } 
    @Override
    public void swim(){
        System.out.println("Duck is swimming");
    }
}
class Airplane implements Flyable{
    @Override
    public void fly(){
        System.out.println("Airplane is flying");
    }
}

public class InterfaceExample3 {
    static void SwimmingCompetition(Swimmable[] participants){
        for(Swimmable sBird: participants){
            sBird.swim();
        }
    }
    public static void main(String[] args) {

        //Grouping all the birds

        Bird b1 = new Sparrow();    
        Bird b2 = new Crow();     
        Bird b3 = new Penguin();
        Bird b4 = new Ostrich();
        //Grouping based on abilities
        //---------------------------

        //Grouping all flyable birds
        Flyable fb1 = new Sparrow();
        Flyable fb2 = new Crow();
        
        //here the variables or methods coming from parent are not accessible
        //means eat(), sleep(), colour are not available, to use them we need to convert explicitly
        //fb1.sleep(); -> erroe
        ((Sparrow)fb1).sleep();

        // Flyable fb3 = new Ostrich(); -> invalid because Ostrich class doesn't implements Flyable interface
        fb1.fly();
        fb2.fly();

        //Grouping all swimmable birds
        Swimmable sb1 = new Duck();
        Swimmable sb2 = new Penguin();
        sb1.swim();
        sb2.swim();


        //Array of interface -> Swimming competition
        Swimmable[] arr = new Swimmable[2];
        arr[0] = sb1;
        arr[1] = sb2;
        SwimmingCompetition(arr);

        Flyable[] flyableObjects = {new Crow(), new Sparrow(), new Airplane()};
        for(Flyable fObject : flyableObjects){
            fObject.fly();
        }


    }
}
