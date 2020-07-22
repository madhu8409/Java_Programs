package Loops;
import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number along with the power: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 1;
		
		for(int i = 0; i<b; i++) {
			
			result *= a;
		}
		
		System.out.println(result);
		
	
	}

}
