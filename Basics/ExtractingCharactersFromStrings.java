
import java.util.Arrays;

public class ExtractingCharactersFromStrings {
    public static void main(String[] args) {
        String s = "Aditya University";
        System.out.println(s);
        System.out.println(s.charAt(0));
        System.out.println();

        //getChars()
        char[] out = new char[10];
        s.getChars(0, 4, out, 3);
        System.out.println(Arrays.toString(out));
        int[] arr = {10, 20};
        System.out.println(Arrays.toString(arr));
        System.out.println();

        //toCharArray()
        char[] out2 = new char[s.length()];
        out2 = s.toCharArray();
        System.out.println(out2[2]);    //i
        System.out.println();

        //getBytes()
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));
    }
}
