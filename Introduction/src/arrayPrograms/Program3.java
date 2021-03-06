package arrayPrograms;

public class Program3 {

	public static void main(String[] args) {
		// In this program we are going to find out the frequency of each element in the array.
		
		int arr[] = {1,1,1,2,3,6,2,2,2,5,6,6,3,3,3,9};// create a new array with a repeating values for counting frequency occurrence
		int freq[] = new int[arr.length];// create another array to store the frequency counting of the elements.
		
		int eleVisited = -1; // this will mark the elements which are already been visited and save us from counting the same element again.
		
		//	Actual calculation for the frequency starts from here.		
		
		// We can print each and every line after writing the program this will allow us understand the program more clear. 		
		
		for(int i=0; i<arr.length; i++) { // If the condition satisfies and gets the value as true then we will get into the inner loop.
			
			int count = 1;
			
			for(int j=i+1; j<arr.length; j++) {// when the condition satisfies here the next immediate statement starts executing.
					
				if(arr[i] == arr[j]) {
				
					count++;
												
					arr[j]=eleVisited;
				}
			}
			
			if(arr[i]!=eleVisited) {
				
				freq[i]=count;
			}
		}
		
		System.out.println("  "+  "Elements" + "   |   " +  "Frequency");
		
		for(int i=0; i<freq.length; i++) {
			
			if(arr[i]!=eleVisited) {
				
				System.out.println("      "+  arr[i] + "      |       " +  freq[i]);
			}
		}
		
		System.out.println();
		
	}

}
