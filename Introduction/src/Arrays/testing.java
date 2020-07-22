package Arrays;
import java.util.Scanner;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n = sc.nextInt();
		
		int[] marks = new int[n];
		
		System.out.println("Enter the marks now");
		
		for(int i=0; i<n; i++) {
			
			marks[i]= sc.nextInt();
		}
		
		int avgMarks=0;
		for(int i=0; i<n; i++) {
			
			avgMarks += marks[i];
			System.out.println(avgMarks);
		}
		
		avgMarks /= n;
		System.out.println(avgMarks);
		
	}

}
