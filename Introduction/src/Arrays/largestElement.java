package Arrays;

public class largestElement {

	public static void main(String[] args) {
		// printing the largest element in the array
		
		int arr[] = {65,89,79,55,23,84};
		int max = arr[0];
		
			
		System.out.println("Printing the original array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + "  ");
		}
		
		System.out.println( " \n ");
		
		System.out.println("The largest element in the array is: ");
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>max) {
				
				max=arr[i];
				
			}
			
		}
		System.out.print(max +" ");
		
		

	}

}
