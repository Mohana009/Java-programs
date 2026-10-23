import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        String[] names = {"Alice", "Alice", "Bob", "Charlie", "Charlie", "Diana"};
        HashSet<String> hs = new HashSet<>();
        for(String name: names){
            hs.add(name);
        }
        System.out.println(hs);
    }
}
