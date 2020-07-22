package Arrays;
import java.util.*;

public class multiplicationMatrix {

	public static void main(String[] args) {
		// This program is done using the user input
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Welcome! Please Enter Dimensions: ");
		
		int n = sc.nextInt();
				
		int a[][]= new int[n][n];
		int b[][]= new int[n][n];
		
//		Now we will try to input the data from the user for matrix a
		
		System.out.println("Enter the elements for matrix A: ");
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				a[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("Enter the elements for matrix B: ");
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				b[i][j]= sc.nextInt();
			}
		}
		
//		calculation happens in this block
//		Here we are creating another matrix for storing the calculated elements
		
		int c[][]= new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<n; k++) {
					
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		System.out.println("The results prints here: ");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
		

	}

}