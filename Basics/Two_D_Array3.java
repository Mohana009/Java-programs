import java.util.Scanner;
import java.util.Arrays;

public class Two_D_Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        //r -> no.of 1D arrays
        //c -> no.of elements in each 1D array
        int[][] mat = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        // System.out.println(Arrays.toString(mat)); -> not working -> printing addresses

        System.out.println(Arrays.toString(mat[0]));  //working


        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
