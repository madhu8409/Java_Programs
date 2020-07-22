package userInput;
import java.util.Scanner;

public class simpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc =new Scanner(System.in);
		
		int principal = sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();
		
		float SI = principal*rate*time/100;
		
		System.out.println("The simple interest is: "+ SI);

	}

}
 