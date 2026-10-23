abstract class Animal{  //parent class -> abstract
    abstract void makeSound();
}

class Dog extends Animal{   //child class -> concrete(with implementation)
    @Override
    void makeSound(){
        System.out.println("Bhow Bhow");
    }
}

abstract class Bank{    //parent class -> abstract
    abstract double getInterestOnPersonalLoans();
}

class SBI extends Bank{ //child class -> concrete(with implementation)
    @Override
    double getInterestOnPersonalLoans(){
        return 7.7;
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        SBI s1 = new SBI();
        System.out.println(s1.getInterestOnPersonalLoans());

        Dog d1 = new Dog();
        d1.makeSound();
    }
}
