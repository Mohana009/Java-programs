import java.util.Arrays;
public class StringSorting {
    public static void main(String[] args) {
        String a = "university"; //sorted: "eiinrstuvy"
        // toCharArray() - >used to convert a string into a character array

        //1.convert the string into char array
        char[] arr = a.toCharArray();

        //2.since arrays can be sorted, using Arrays.sort()
        Arrays.sort(arr);

        //3. convert the charcter array back  into string
        String result = new String(arr);
        System.out.println(result);

        //Running a for each loop on string
        //needs conversion to a charArray
        String string = "hello world";
        for(char eachCharacter:string.toCharArray()){
            System.out.println(eachCharacter);
        }
    }
}