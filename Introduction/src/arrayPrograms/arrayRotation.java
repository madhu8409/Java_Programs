package arrayPrograms;

public class arrayRotation {

	public static void main(String[] args) {
		// In this program we are going to rotate the array of size n with the d elements.
		
		int arr[] = {1,2,3,4,5};//creating an array with the elements in it.
		
		int n=5;// defining the size of an array.
		int d=1;// here variable d decides by how many elements an array should rotate.
		
		System.out.println("Original array before rotation: \n");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+"   ");
		}
		
		// the rotation starts from here.
		
		for(int i=0; i<d; i++) {// this is the outer loop which will loop only 1 times because d=1.
			
			int j;
			int temp = arr[0];
			
			for(j=0; j<n-1; j++) { //this is the inner loop which starts from 0 and till n-1 (5-1).
				
				arr[j] = arr[j+1]; // Here we are shifting the array after the rotation{2,3,4,5,5};
			}
			
			arr[j] = temp; // storing back the temporary variable in the array[j].
		}
		
		System.out.println("\n");
		System.out.println("The array after rotation:  \n");
		for(int i=0; i<n;i++) {
			System.out.print(arr[i]+"   ");
		}
	}

}
