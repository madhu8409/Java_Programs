package arrayPrograms;

public class Program1 {
	
	public static void main(String[] args) {
	
		// Creating program for copying the element of array1 to the another array2 using simple method.This method of copying elements
		// from one method to another are done using looping statements.		
		
		
		int arr1[] = {1,2,3};// here we are initializing the array.
		int arr2[]= new int[arr1.length];// here we are creating a new array arr2[] with the same size of the arr1[].
		
		
		
		// Here we are printing the original array before copying the array.		
		System.out.print("The Original array before copying:  ");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+"    ");
		}
		System.out.println();
		
		// Here now with the help of a for loop we are iterating through every time and then we are copying the value from the array1 and 
		// assigning the copied value to the array2.	
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i]= arr1[i];
		}
		
		
		// Here we are printing the copied array.		
		
		System.out.print("The resultant array after copying:  ");
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+"    ");
		}
		System.out.println();

	}

}
