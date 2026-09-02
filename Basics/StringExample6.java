public class StringExample6 {
    public static void main(String[] args) {
        String[] names = {"abc", "def", "ghi", "jkl"};  //String array
        String ansString = "";  //String
        for(String eachValue : names){
            ansString += eachValue.charAt(0);   //String concatenation
        }
        System.out.println(ansString);
    

    }
}
