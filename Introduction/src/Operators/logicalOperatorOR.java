package Operators;
import java.util.Scanner;
public class logicalOperatorOR {

	public static void main(String[] args) {
		System.out.println("Please enter the grade to check your eligibility:");
		
		
		Scanner sc = new Scanner(System.in);
		
		int grade = sc.nextInt();
		
		if(!(grade < 10 || grade == 11)) {
			System.out.println("Welcome to hell life struggle starts now");
		}
		else {
			System.out.println("Wow you are lucky time left to enter the hell");
		}

	}

}
