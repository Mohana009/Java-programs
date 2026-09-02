import java.util.Scanner;
public class Two_D_Array4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        //row wise sum
        int sum = 0;
        for(int i = 0; i < r; i++){
            sum = 0;
            for(int j = 0; j < c; j++){
                sum += mat[i][j];
            }
            System.out.println(sum);
        }

    }
}
