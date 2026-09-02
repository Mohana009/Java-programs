import java.util.Arrays;
public class StringToCharArray {
    public static void main(String[] args) {
        String a = "university";

        //Sorting a String

        //1. Convert the string into character array
        char[] arr = a.toCharArray();
        //2. Sort the character array
        Arrays.sort(arr);
        //3. Convert the character array back into String
        String ans = new String(arr);

        System.out.println(ans);

        //for-each loop on Strings doesn't work
        //First we have to convert it into character array to run for-each loop

        for(char eachCharacter: a.toCharArray()){
            System.out.print(eachCharacter);      //prints the string "university"
        }

    }
}
