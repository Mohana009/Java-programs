abstract class Animal{
    //Instance variable
    String speciesType;

    //Instance method
    abstract void makeSound();

    //Constructor
    Animal(String speciesType){
        this.speciesType = speciesType;
    }
}
class Cat extends Animal{
    //Instance variable
    String name;

    //Instance method
    @Override
    void makeSound(){
        System.out.println("Meow");
    }

    //Constructor
    Cat(String name, String speciesType){
        super(speciesType); //Constructor in parent class is called to initialise the variable
        this.name = name;
    }
}
class Dog extends Animal{
    //Instance variable
    String breed;

    //Instance method
    @Override
    void makeSound(){
        System.out.println("Bhow");
    }

    //Constructor
    Dog(String breed, String speciesType){
        super(speciesType);
        this.breed = breed;
    }

}
public class AbstractClassExample3 {
    public static void main(String[] args) {
        Cat c1 = new Cat("Alfred", "Lion");
        System.out.println(c1.name);
        System.out.println(c1.speciesType);

        Dog d1 = new Dog("Lab", "Carnivore");
        System.out.println(d1.breed);
        System.out.println(d1.speciesType);

        // 1. Can abstract classes have instance variables?
        // YES
        // 2. Can abstract classes have constructors?
        // YES


    }
}
