import java.util.HashMap;

public class HashMapExample3 {
    public static void main(String[] args) {
        // getOfDefault()
        // This method takes a key and take a defaut value
        // If key is present in hashmap's keyset it returns the value
        //else puts that key in map with the default value
        HashMap<String, Integer> map = new HashMap<>();
        String[] names = {"alice", "bob", "alice", "charlie", "charlie"};
        for(String name : names){
            //If exists, value + 1
            //If not, 0 + 1
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        System.out.println(map);
    }
}
