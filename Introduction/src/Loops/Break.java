package Loops;
import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for(int i=1; i<=100; i++) {
//			
//			if(i == 35) {
//				break; 
//			}
//			System.out.println(i);
//		}
//		take an input from user where user can input the number till its a positive number and comes out of the loop ones the number becomes negative
		
		Scanner sc =new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			
			if(n<0)
				break;
			
		}
	}

}
