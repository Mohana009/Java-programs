import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class DifferentMaps2 {
    public static void main(String[] args) {
        int[] nums = {16, 4, 9, -12, 17, 7, 3, 21};

        HashMap<Integer, Integer> map1 = new HashMap<>();
        LinkedHashMap<Integer, Integer> map2 =new LinkedHashMap<>();
        TreeMap<Integer, Integer> map3 = new TreeMap<>();
        for(int num: nums){
            map1.put(num, num * num);
            map2.put(num, num * num);
            map3.put(num, num * num);
        }
        System.out.println("HashMap: " + map1);
        System.out.println("LinkedHashMap: " + map2);
        System.out.println("TreeMap: " + map3);
    }
    

}
