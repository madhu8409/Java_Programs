package conditionalStatements;
import java.util.Scanner;

public class ifelseifCondition {

	public static void main(String[] args) {
		

		
		Scanner sc = new Scanner(System.in);
		int sunday= sc.nextInt();
		if(sunday==5) {
			System.out.println("The month starts from sunday");
		}
		
		else if(sunday==4) {
			System.out.println("The month doesnt start from sunday");
		}
		else {
			System.out.println("Invalid data");
		}
	}

}