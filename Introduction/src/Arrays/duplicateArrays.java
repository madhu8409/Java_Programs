package Arrays;

public class duplicateArrays {
	
//	In the following program we are printing the duplicate elements in the array
	public static void main(String args[]) {
		
		int arr[]= {1,2,3,2,3,4,5,4,6};
		
		System.out.print("The original including the duplicate elements is: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "   ");
		}
		
		System.out.println(" \n ");
		
//		The search for the duplicate array begins here.
		
		System.out.print("The array of duplicate elements are the following: ");
		
		for(int i=0;i<arr.length;i++) {
				
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[j] + "   ");
				}
			}
		}
	}

}
