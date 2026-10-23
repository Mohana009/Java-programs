import java.util.ArrayList;
class User{
    int id;
    String name;
    int rating;
    //Constructor
    User(int id, String name, int rating){
        this.id = id;
        this.name = name;
        this.rating = rating;
    }
    @Override
    public String toString(){
        return "User(" + id + ", " + name + ", " + rating + ")";
    }
}
public class ArrayListExample2 {
    static boolean isPrime(int n){
        int fc = 0;
        for(int i = 1; i <= n;  i++){
            if(n % i == 0)  fc++;
        }
        if(fc == 2) return true;
        return false;
    }
    public static void main(String[] args) {
        //addAll()
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        System.out.println(arr1);
        
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(40);
        newList.add(50);
        newList.add(60);
        newList.add(10);
        arr1.addAll(newList);
        System.out.println(arr1);

        //removeAll()
        ArrayList<Integer> removedNumber = new ArrayList<>();
        removedNumber.add(30);
        removedNumber.add(40);
        removedNumber.add(10);
        arr1.removeAll(removedNumber);  //removes all the occurrences from arr1
        System.out.println(arr1);
        System.out.println();

        //removeIf()
        ArrayList<String> rolls = new ArrayList<>();
        rolls.add("24P31A42D0");
        rolls.add("24B11CS490");
        rolls.add("24P31A42D9");
        rolls.add("24P31A42E5");
        rolls.add("24B11AI156");
        System.out.println(rolls);
        //To remove all strings start with "24B11"
        rolls.removeIf(e -> e.startsWith("24B11")); //the condition must return true or false
        System.out.println(rolls);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(12);
        arr2.add(31);
        arr2.add(24);
        arr2.add(67);
        arr2.add(90);
        System.out.println(arr2);
        //To remove odd numbers from arr2
        arr2.removeIf(n -> n % 2 != 0); //relational operator -> returns boolean 
        System.out.println(arr2);
        
        arr2.add(5);
        arr2.add(14);
        arr2.add(23);
        arr2.add(45);
        arr2.add(7);

        //To remove prime numbers arr2
        System.out.println(arr2);
        arr2.removeIf(eachNumber -> isPrime(eachNumber)); //the function should return boolean value
        System.out.println(arr2);

        ArrayList<User> users = new ArrayList<>();
        users.add(new User(101, "Alice", 1100));
        users.add(new User(102, "Bob", 1505));
        users.add(new User(103, "Charle", 1390));
        users.add(new User(104, "Diana", 1700));
        users.add(new User(105, "Ethan", 1215));

        //Removing all users with rating more than or equal to 1500
        System.out.println(users);
        users.removeIf(eachUser -> eachUser.rating >= 1500);
        System.out.println(users);

        System.out.println();

        ArrayList<Integer> numsList = new ArrayList<>();
        numsList.add(17);
        numsList.add(7);
        numsList.add(12);
        numsList.add(27);

        //sort() -> Uses MergeSort + Insertion Sort -> Tim Sort
        System.out.println(numsList);
        numsList.sort(null);    //no comparator passed because java knows how to sort primitive types
        System.out.println(numsList);

        //sorting ArrayList of custom class objects
        System.out.println(users);
        users.sort((u1, u2) -> u1.rating - u2.rating);  //sorts based on rating in ascending order
        System.out.println(users);
        
        // users.sort((u1, u2) -> {    //comparator function   })
    }
}
