package arrayPrograms;

public class Program3 {

	public static void main(String[] args) {
		// In this program we are going to find out the frequency of each element in the array.
		
		
		int arr[] = {1, 2, 8, 3, 2, 2, 2, 5, 1};
		
		int fr[] =  new int[arr.length]; //9
		
//		System.out.println(arr.length);
		
		int visited = -1; //
		
		for(int i=0; i<arr.length; i++) {
			
				
			int count = 1;
			
			for(int j=i+1; j<arr.length; j++) {
				
				System.out.println(arr.length);
				
				if(arr[i] == arr[j]) {
					
					count++;

					fr[j] = visited;

				}
				
			}
			
			if(fr[i]!=visited) {
			
			 fr[i]=count;
			
		}
		}
		
//		System.out.println(" Element | Frequency");
//		for(int i=0;i<fr.length; i++) {
//			if(fr[i]!=visited)
//			System.out.println("    " + arr[i] + "    |     " + fr[i]);
//		}
//		System.out.println();

	}

}