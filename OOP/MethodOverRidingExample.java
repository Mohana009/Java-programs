class Animal{
    void makeSound(){
        System.out.println("Animal is making sound...");
    }
}
class Cat extends Animal{
    //Overriding method
    @Override
    void makeSound(){
        System.out.println("Meow...");
    }
}
class Dog extends Animal{
    //Overriding method
    @Override
    void makeSound(){
        System.out.println("Bhow Bhow...");
    }
}
public class MethodOverRidingExample {
    static void validateAnimal(Animal x){
        if(x instanceof Cat){
            System.out.println("It's a Cat");
        }
        else if(x instanceof Dog){
            System.out.println("It's a Dog");
        }
        else{
            System.out.println("I don't know the type");
        }
    }
    public static void main(String[] args) {
        // Animal a1 = new Animal();
        // a1.makeSound();
        // Cat c1 = new Cat();
        // c1.makeSound();
        // Dog d1 = new Dog();
        // d1.makeSound();

        //A super class reference -> Animal a1
        //a sub-class object -> new Cat()
        Animal a1 = new Cat();  //is-a relation -> Cat is an animal
        Animal a2 = new Dog();
        Animal a3 = new Animal();
        validateAnimal(a1);
        validateAnimal(a2);
        validateAnimal(a3);
        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}
