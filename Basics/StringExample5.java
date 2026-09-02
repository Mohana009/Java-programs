import java.util.Arrays;
public class StringExample5 {
    public static void main(String[] args) {
        String original = "ADITYA";
        String lower = original.toLowerCase();
        System.out.println(lower);
        String upper = lower.toUpperCase();
        System.out.println(upper);

        //converting string into character array


        //toCharArray();


        String x = "technicalhab";
        char[] arr = x.toCharArray();
        
        System.out.println(Arrays.toString(arr));
        arr[10] = 'u';  //changing 'a' at 10 index into 'u'

        System.out.println(Arrays.toString(arr));

        //Converting character array back to string

        String outputString = new String(arr);
        System.out.println(outputString.toUpperCase());


    }
}
