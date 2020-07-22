package Operators;
import java.util.Scanner;
public class logicalOperator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your choosen number: ");
		
		int number = sc.nextInt();
		
		
		if(number >=1  && number <= 100) {
			System.out.println("The number is in the range of 1-100");
		}
		else {
			System.out.println("The number is out of box of range");
		}

	}

}
