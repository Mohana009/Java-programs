public class ExceptionTypes {
    public static void main(String[] args) {
        // 1. Arithmetic Exception

        // Division by zero
        int a = 10;
        int b = 0;
        System.out.println(a / b);

        //2. Number Format Exception

        // String num = "1345b7";
        // int ans = Integer.parseInt(num);
        // System.out.println(ans * ans);
 
        // 3. Index out of bounds exception -> runtime error

        // int[] arr = {10, 20, 30};
        // System.out.println(arr[4]);  //No 4th index
        
        // 4. Null pointer exception -> run time exception

        // String name ;    //Declared but not initialized
        // System.out.println(name.charAt(0));  //Accessing from a null reference

        // 5. File not found exception -> compile time exception 
    }
}
