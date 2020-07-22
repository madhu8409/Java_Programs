package Loops;
import java.util.Scanner;

public class Factorialofn {

	public static void main(String[] args) {
		// Find out the factorial of n through keyboard
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int factorial = 1;
		
		for(int i = n; i >= 1; i--) {
			
			factorial = factorial * i;
			
		}
		System.out.println(factorial);

	}

}
