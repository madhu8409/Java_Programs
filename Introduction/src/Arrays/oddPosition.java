package Arrays;

public class oddPosition {

	public static void main(String[] args) {
		// Print the elements present in the odd positions
		
		
//		int arr[] = {1,2,3,4,5,6,7,8,9}; here we can use either of the array to test the efficiency of the program
		
		
		int arr[] = {2,1,4,3,6,5,8,7,10,9};
		
		System.out.println(" Printing out the original array: ");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "    ");
		}
		
		System.out.println("   \n ");
		
		System.out.println("Printing out the array elements present in the odd position: ");
		
		for(int i=0; i<arr.length;i=i+2)
		{
			
			System.out.print(arr[i] + "    ");
		}

	}

}
