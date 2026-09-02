import java.util.Scanner;
class StringExample2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		sc.nextLine();
		String sen;
		sen = sc.nextLine();
		System.out.println("Entered number is: " + n);
		System.out.println("Entered string is: " + sen);
	}
}