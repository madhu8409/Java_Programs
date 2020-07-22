package whileLoops;
import java.util.Scanner;

public class sumOfdigits {

	public static void main(String[] args) {
		// sum of digits
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt(); 
		
		int temp = n;// initialisation
		
		int sum = 0;
		
		while(temp > 0) // condition
		{
			int lastDigit = temp % 10;
			temp /= 10;// re-initialisation
			
			sum += lastDigit;
			
			System.out.println(lastDigit + " " + temp + " "+ sum   );
		}
		
		System.out.println("The sum of the digit of"+ n + "is "+ sum);
		 

	}

}
