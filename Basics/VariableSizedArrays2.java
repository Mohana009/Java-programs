import java.util.Arrays;
public class VariableSizedArrays2 {
    public static void main(String[] args) {
        int[][] mat = new int[3][];
        mat[0] = new int[5];
        mat[1] = new int[10];
        mat[2] = new int[20];
        for(int i = 0; i < mat.length; i++){
            System.out.println(Arrays.toString(mat[i]));
        }

        //to quickly see the 1D array -> Arrays.toString();
        //to quickly see the 2D array -> Arrays.deepToString();

        System.out.println(Arrays.deepToString(mat));
    }
}
