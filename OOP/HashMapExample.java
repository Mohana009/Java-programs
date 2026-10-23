import java.util.HashMap;
import java.util.Scanner;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Sachin", 100); //map.put(key, value);
        map.put("Kohli", 78);
        map.put("Ponting", 88);

        System.out.println(map.get("Sachin"));

        System.out.println();

        System.out.println(map);    

        System.out.println(map.keySet());    //prints all keys

        System.out.println();

        //keyset contains all keys of map
        for(String eachKey: map.keySet()){
            System.out.println(eachKey);    //prints all keys in new line
        }

        System.out.println();

        for(String eachKey: map.keySet()){
            System.out.println("Cricketer is " + eachKey);
        }
        
        System.out.println();
        for(String eachKey: map.keySet()){
            System.out.println("Cricketer is " + eachKey);  //prints key
            System.out.println("Score is " + map.get(eachKey)); //prints value
        }
        System.out.println();
        System.out.println(map.containsKey("Sachin"));  //true
        System.out.println(map.containsKey("Ram")); //false
        System.out.println();

        String[] Winners = {"Alice", "Bob", "Charlie", "Alice", "Bob", "Bob", "Alice", "Charlie", "Bob"};
        //Let's create map for winners
        HashMap<String, Integer> map2 = new HashMap<>();
        
        for(String s: Winners){
            //if the key is already present
            if(map2.containsKey(s)){
                map2.put(s, map2.get(s) + 1);   //map2.get(s) -> brings the initial key value + 1 and keep it in the same place
            }
            //If key is not present in map2
            else{
                map2.put(s, 1);
            }
        }
        System.out.println(map2);



        // HashMap<String, String> bookAuthors = new HashMap<>();
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int i = 0; i < n; i++){
        //     String bookName = sc.nextLine();
        //     String authorName = sc.nextLine();
        //     bookAuthors.put(bookName, authorName);
        // }
        // System.out.println(bookAuthors);
    }
}
