import java.util.*;
class ScannerProgram{
	public static void main(String[] args){
		//Creating an object to Scanner class
		Scanner sc = new Scanner(System.in);
		//Reading
		int a = sc.nextInt();
		int b = sc.nextInt();
		//long val = sc.nextLong();
		//char ch = sc.next().charAt(0);
		int c = a + b;
		System.out.printf("Sum of %d and %d is: %d\n", a, b, c);
	}
}