package pattern;
import java.util.Scanner;

public class patternOne {

	public static void main(String[] args) {
		// print the pattern of n*n i.e, 4*4 or 5*5 stars pattern

			Scanner sc =new Scanner(System.in);
			int n= sc.nextInt();
			for(int i=1; i<=n;i++) {
				for(int j=1; j<=n;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
	}

}
