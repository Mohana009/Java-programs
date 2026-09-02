import java.util.Scanner;
class ScannerMethods{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long b = sc.nextLong();
		float c = sc.nextFloat();
		char ch = sc.next().charAt(0);
		System.out.printf("%d %d %f %c\n", a, b, c, ch);
	}
}