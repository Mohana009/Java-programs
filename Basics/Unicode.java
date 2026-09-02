public class Unicode {
    public static void main(String[] args) {
        char ch1 = 'a';
        char ch2 = 'b';
        if(ch1 > ch2)   System.out.println("Yes");
        else System.out.println("No");
        System.out.println((int)ch1);
        
        System.out.println((char)(ch1 + 1));    //b
        System.out.println();
        System.out.println();
        System.out.println(ch2-ch1);
        int x = 121;
        System.out.println(x);
        int num = 3077;     //Unicode value of telugu 'a'
        System.out.println((char)num);
    }
}
