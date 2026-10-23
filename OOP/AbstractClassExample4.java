//Enemy Types
//1. BossEnemy -> 1. Dragon, 2. Assisn
//2. --
//3. 
abstract class Enemy{
    //Instance methods
    abstract void spawn();
    abstract void attack();
}
//Making BossEnemy as abstract as we can't provide implementation for attack() method
abstract class BossEnemy extends Enemy{
    //Instance method
    @Override
    void spawn(){
        System.out.println("BossEnemy is entering");
    }
}
class Dragon extends BossEnemy{
    //Instance method
    @Override
    void attack(){
        System.out.println("Spitting fire");
    }
}
class Assisn extends BossEnemy{
    //Instance method
    @Override
    void attack(){
        System.out.println("Shooting bullets");
    }
}
public class AbstractClassExample4 {
    public static void main(String[] args) {
        BossEnemy boss1 = new Dragon();
        boss1.spawn();
        boss1.attack();
        System.out.println();
        BossEnemy boss2 = new Assisn();
        boss2.spawn();
        boss2.attack();

        
    }
}
