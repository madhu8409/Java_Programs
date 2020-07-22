package Rotation;

public class arrayRotation1 {

	public static void main(String[] args) {
		// This rotation method do not use any function and simply rotates the array by d elements of array of size n. 
	   //  The input has already been defined here so no use of scanner class.
		
		int arr[]= {1,2,3,4,5};
		int d= 1;
		int n=5;
		
//		Printing the original array
		System.out.println("Original Array");
		for(int i=0; i<n; i++) {
			
			System.out.print(arr[i]+ "     ");
		}
		
//		rotation starts here
		
		for(int i=0; i<d; i++) {
			int j, temp;
			
			temp =arr[0];
			for( j=0; j<n-1; j++) {
				arr[j] = arr[j+1];
			}
			arr[j]=temp;
		}
		System.out.println();

//		printing the rotated array where rotation done by d elements.
		System.out.println("After Rotation");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + "     ");
		}
		
	}

}
