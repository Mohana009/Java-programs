import java.util.Scanner;
class Volume{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double v = (4/3.0)*(3.14)*r*r*r;
        System.out.println(v);
    }
}
