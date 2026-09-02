import java.util.Arrays;
public class StringMethods {
    public static void main(String[] args) {
        //toCharArray()

        //Methods for lexicographical comparison on strings
        //equals() -> true/false 
        //equalsIgnoreCase() -> ignores the case differences
        //compareTo()-> gives difference btw unicodes of first mismatched characters
        //              if s1 > s2 +ve value
        //              if s2 > s1 -ve value
        //              if s1 == s2 0
        //compareToIgnorecase() -> 


        String s1 = "aBc";
        String s2 = "abc";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println();

        //compareTo()

        String s3 = "pavan";
        String s4 = "ashok";
        System.out.println(s3.compareTo(s4));   //diff of 'p' & 'a' is 15
        System.out.println(s4.compareTo(s3));     //diff of 'a' & 'p' is -15

        //compareToIgnoreCase()

        String s5 = "abc";
        String s6 = "ABC";
        System.out.println(s5.compareToIgnoreCase(s6));     //same -> 0
        System.out.println(s5.compareTo(s6));   //diff of 'a' & 'A' -> 32

        System.out.println();

        //contains()
        //used to check if sequence of characters is a part of string or not

        String sentence = "Java is a goat programming language";
        String word = "goat";
        boolean ans = sentence.contains(word);
        System.out.println(ans);
        System.out.println(sentence.contains("mmi"));
        System.out.println(sentence.contains("lnu"));

        char ch = 'g';
        //System.out.println(sentence.contains(ch)); -> error
        System.out.println(sentence.contains("" + ch)); // checks for "g" -> true

        System.out.println();

        //isEmpty() -> check if there any characters in the string

        String x = "abc";
        System.out.println(x.isEmpty());    //false
        String y = "  ";
        System.out.println(y.isEmpty());    //false
        String z = "";
        System.out.println(z.isEmpty());    //true

        System.out.println();

        //isBlank() -> doesn't consider spaces 
        System.out.println(x.isBlank());    //false
        System.out.println(y.isBlank());    //true
        System.out.println(z.isBlank());    //true

        System.out.println();


        //split() ->used to split a string based on delimeter
        //the return typr of split() is an array of string
        sentence = "java is a GOAT programming language";
        //using space as a delimeter
        //"java", "is", "a"
        String[] words = sentence.split(" ");
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }

        String date = "28-07-2025";
        System.out.println(Arrays.toString(date.split("-")));
        // for(int i = 0; i < words.length; i++){

        // }
        System.out.println();

        //indexOf() -> used to give the firt index of a character or substring in a string
        //if not returns -1
        word = "Games Gosling";
        char ch1 = 'e';
        char ch2 = 'z';
        System.out.println(word.indexOf(ch1));
        System.out.println(word.indexOf(ch2)); // -1 -> because it is not present
        word = "java";
        System.out.println(word.indexOf('a')); // 1
        System.out.println(word.indexOf('a', 2)); //starts checking from 2nd index -> 3

        System.out.println();

        //lastIndexOf()

        //start and end check using

        //endsWith()
        String fileName = "java_examples.pdf";  //'.mp3', '.mp4', '.jpeg'
        System.out.println(fileName.endsWith(".pdf")); // true

        

        //startsWith()
        //roll number example

        // substring
        String s = "Aditya University";
        System.out.println("Substring of s: " + s.substring(5));
        System.out.println();
        
        //trim()
        s = "     Aditya College         ";
        s = s.trim();
        System.out.println(s);
        System.out.println();
        
        //replace()
        s = "Aditya College";
        s = s.replace("College", "University");
        System.out.println(s);
        System.out.println();

        //concat()
        s = s.concat("(AU)");
        System.out.println(s);
        System.out.println();

        //lastIndex()
        s = "AdityaUni University";
        System.out.println(s.lastIndexOf("Uni"));   //10

        //substring
        s = "AdityaUni University";
        String subString1 = s.substring(0, 6);
        System.out.println(subString1);
        String subString2 = s.substring(9, s.length());
        String out = subString1.concat(subString2);
        System.out.println(out);
    }

}
