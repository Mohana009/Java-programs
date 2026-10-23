import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListHR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            arr.add(new ArrayList<Integer>());
            int k = sc.nextInt();
            for(int j = 0; j < k; j++){
                int val = sc.nextInt();
                arr.get(i).add(val);
            }
        }
        int q = sc.nextInt();
        for(int i = 0; i <= q; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(arr.size() > x - 1 && arr.get(x - 1).size() > y - 1){
                System.out.println(arr.get(x - 1).get(y - 1));
            }
            else{
                System.out.println("Error!");
            }
        }
    }
}
