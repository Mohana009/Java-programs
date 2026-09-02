public class ContainsMethod {
    static boolean isVowel(char a){
        String vowels = "aeiouAEIOU";
        return vowels.contains("" + a);
    }

    public static void main(String[] args){
        boolean res = isVowel('a');
        System.out.println(res);
    }
}
