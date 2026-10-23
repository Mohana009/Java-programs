import java.util.HashMap;
public class HashMapExample2 {
  public static void main(String[] args) {
    HashMap<Character, Integer> map = new HashMap<>();
    // put() method needs be used to put values
    // Order is not guranteed
    map.put('Z', 26);
    map.put('P', 16);
    map.put('A', 1);
    // size()
    System.out.println(map);
    System.out.println(map.size());
    // keySet(), values()
    System.out.println(map.keySet());
    System.out.println(map.values());
    // Traverse a hashmap (run a loop using keySet)
    for (Character c: map.keySet()) {
      System.out.println(c);
      System.out.println(map.get(c));
    }

    // How you can use hashmap to
    // maintain frequencies
    // no of occurrences
    String[] names = {"alice", "alice", "bob", 
                      "charlie", "charlie"};
    HashMap<String, Integer> fMap = new HashMap<>();
    for (String name: names) {
      // If exists, value + 1
      // If not, 0 + 1 (new pair)
      fMap.put(name, fMap.getOrDefault(name, 0) + 1);
    }
    System.out.println(fMap);
    
    
    
    // containKey() --> Verify if the map already contains
    // a given key
    System.out.println(map.containsKey('X'));

    // getOrDefault(key, defaultValue);
    // This method takes a key and take a default value
    // If key is present in hashmap's keySet it returns the value
    // corresponding to the key, else it returns default_value
    System.out.println(map);
    System.out.println(map.getOrDefault('Z', 1001));
    System.out.println(map.getOrDefault('X', 10001));
  }
}
