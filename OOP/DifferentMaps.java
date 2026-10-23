import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.TreeMap;
public class DifferentMaps {
    public static void main(String[] args) {

        //HashMap doesn't maintain any order, doesn't allow duplicate keys
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Bob", 20);
        map1.put("Alice", 19);
        map1.put("Charlie", 90);
        map1.put("Ron", 80);
        System.out.println(map1);

        //LinkedHashMap maintains insertion order
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("Bob", 20);
        map2.put("Alice", 19);
        map2.put("Charlie", 90);
        map2.put("Ron", 80);
        System.out.println(map2);

        //TreeMap sorts the data based on the key
        TreeMap<String, Integer> map3 = new TreeMap<>();
        map3.put("Bob", 20);
        map3.put("Alice", 19);
        map3.put("Charlie", 90);
        map3.put("Ron", 80);
        System.out.println(map3);

        


    }
}
