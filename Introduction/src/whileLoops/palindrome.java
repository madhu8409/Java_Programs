package whileLoops;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int reversedNumber = 0;
		
		while(temp>0) // this condition will run unless and until the temp is greater than 0.
		{
			
			int lastDigit = temp % 10;
			
//			System.out.println(lastDigit);
			
			reversedNumber = reversedNumber * 10 + lastDigit;
			
//			System.out.println(reversedNumber);
			
			
			temp = temp/10;
			
			System.out.println(temp);
			
			System.out.println(lastDigit + "  " + temp+ " " + reversedNumber);
		
			
		}
		if(reversedNumber == n) {
			System.out.println("N is palindrome");
		}
		else {
			System.out.println("The number is not a palindrome");
		}
		
	 }

}
 