class ArrayExample1{
    public static void main(String[] args) {
        //Initialize an array
        int[] arr = {10, 20, 30, 40, 50, 60};
        //            0   1   2   3   4   5
        System.out.println(arr.length);
        System.out.println(arr[5]);
        // System.out.println(arr[6]); -> out of bounds
        // index -> 0 to n-1

        //loop on int array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " " );
        }
        System.out.println();

        String[] names = {"Harry", "Ron", "Hermoine"};
        System.out.println(names.length);
        System.out.println(names[2]);
        //reverse loop on string array
        for(int i = names.length - 1; i >= 0; i--){
            System.out.print(names[i] + " ");
        }
    }
}