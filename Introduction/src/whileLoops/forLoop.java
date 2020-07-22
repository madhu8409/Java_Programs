package whileLoops;
import java.util.Scanner;

public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp, i, sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
//		int numberOfdigits = (int)Math.log10(n)+1;
//		
//		System.out.println(numberOfdigits);
		for(i=0; i<n; i++) {
	        temp = n % 10;
	        sum = sum + temp;
	        n /= 10;
	    }
		System.out.println(sum);
	}

}
