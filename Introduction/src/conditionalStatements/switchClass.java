package conditionalStatements;
import java.util.Scanner;

public class switchClass {

	public static void main(String[] args) {
		
		
//		int dayOfweek = 4;
		
		Scanner sc = new Scanner(System.in);
		int dayOfweek = sc.nextInt();
		
//		
//		
//		if(dayOfweek == 1) {
//			
//		}
//		if(dayOfweek == 2) {
//			
//		}
//		if(dayOfweek == 3) {
//			
//		}
//		if(dayOfweek == 4) {
//			
//		}
//		if(dayOfweek == 5) {
//			
//		}
//		if(dayOfweek == 6) {
//			
//		}
//		if(dayOfweek == 7) {
//			
//		}
		
//In order to check the condition we are using if statement so many times hence this can be replaced by 
// by the switch statement.		
		
	switch(dayOfweek) {
	//if we want to print the same statement for multiple values we can use this.
	case 1:
	case 2:
		System.out.println("I am on leave");
		break;
//	case 2:
//		System.out.println("I'm in office");
//		break;
	case 3:
		System.out.println("I'm playing football");
		break;
	case 4:
		System.out.println("It's my coding day");
		break;
	default:
		System.out.println("Oops no condition matched");
	}

	}

}
