import java.util.Scanner;
public class MaxMinSuminArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for(int i = 0;  i < n; i++){
            sum += arr[i];
            if(arr[i] > max)    max = arr[i];
            //max = math.max(arr[i], max);
            if(arr[i] < min)    min = arr[i];
            //min = math.min(arr[i], min);
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum : " + min);
        System.out.println("Sum: " + sum);


    }
}
