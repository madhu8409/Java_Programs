package conditionalStatements;
import java.util.Scanner;

public class ifelseifclass {

	public static void main(String[] args) {
		

		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number<=10) {
			System.out.println("The number is less than 10");
		}
		else if(number>=10 && number<=23) {
			System.out.println("The number is in the range");
		}
		else {
			System.out.println("The number is not in the range");
		}

	}

}
