import java.util.Arrays;
public class ArrayClassExample {
    public static void main(String[] args) {
        int A[] = {10, 20, 60, 40};
        int[] B = {10, 20, 30, 40, 50};

        //Arrays.toString()

        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));

        //Arrays.equals()

        if(Arrays.equals(A, B)){
            System.out.println("Both arrays are same");
        }else{
            System.out.println("Both arrays are not same");
        }

        //Arrays.compare()

        System.out.println(Arrays.compare(A, B));

        //Arrays.fill(arr_name, value)

        int[] d = new int[5];
        System.out.println("Before filling: " + Arrays.toString(d));
        Arrays.fill(d, -1); //fills the complete array d with -1
        System.out.println("After filling: " + Arrays.toString(d));

        //Arrays.sort()

        int [] intArray = {7, 6, -2, 1, 4};
        System.out.println("Before sort: " + Arrays.toString(intArray));
        Arrays.sort(intArray);  //uses dual-pivot quick sort
        System.out.println("After sort: " + Arrays.toString(intArray));
        String[] names = {"Charlie", "Alice", "Bob"};
        System.out.println("Before sort: " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("After sort: " + Arrays.toString(names));


        //Arrays.binarySearch()
        int[] a1 = {10, 20, 30, 40};
        System.out.println(Arrays.binarySearch(a1, 20));

        //Arrays.copyOf()
        int[] Copy = Arrays.copyOf(A, A.length);;
        
        System.out.println(Arrays.toString(Copy));
        
        //Arrays.mismatch()
        int[] a2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.mismatch(a1, a2));




    }
}
