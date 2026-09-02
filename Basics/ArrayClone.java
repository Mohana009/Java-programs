import java.util.Arrays;
public class ArrayClone {
    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40};
        int[] B = A;
        A[1] = 100; //changes the value of both A[i] & B[i]
        B[1] = 200; //Changes the value of both A[1] & B[1]
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        int[] C = {1, 2, 3, 4};
        int[] D = C.clone();    //Creates duplicate array using clone
        D[1] = 1000;    //Changes only D[1], C[1] remains same 
        C[1] = -1;      //changes only C[1], D[1] remains same
        System.out.println(Arrays.toString(C));
        System.out.println(Arrays.toString(D));
    }
}
