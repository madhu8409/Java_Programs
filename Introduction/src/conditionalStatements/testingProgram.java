package conditionalStatements;


public class testingProgram {

	public static void main(String[] args) {
		// This concept is of adding the number of digits where the input is already given and it doesnot matter whether the looping starts 
//		from 0 or 1.
		
		int sum=0, temp;
		
		int n =4959;
		
			
		for(int i=0; i<=n; i++) {
			
			temp= n%10;
			sum = sum + temp;
			
			n /=10;
		}
		
		System.out.println(sum);
	}

}
