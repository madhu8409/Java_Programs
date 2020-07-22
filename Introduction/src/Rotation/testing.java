package Rotation;

public class testing {
	
	void leftRotate(int arr[], int d, int n) 
    { 
        /* To handle if d >= n */
//        d = d % n; 
//        System.out.println("d= " + d);
        int i, j, k, temp; 
        int g_c_d = gcd(d, n); 
        for (i = 0; i < g_c_d; i++) { 
           	
            temp = arr[i];        
            j = i; 
                      
            while (true) { 
            	
            	           	
                k = j + d;
                
                if (k >= n) 
                	
                	k = k - n; 
                
                if (k == i) 
                    break; 
                
                     arr[j] = arr[k]; 
                              
                j = k; 
//                System.out.println(j);
            } 
            arr[j] = temp; 
        } 
    } 
  
   
    void printArray(int arr[], int size) 
    { 
        int i; 
        for (i = 0; i < size; i++) 
            System.out.print(arr[i] + " "); 
    } 
  

    int gcd(int a, int b) // 2, 4
    { 
        if (b == 0) 
            return a; 
        else
            return gcd(b, a % b); //4, 2 = 2
     } 

	public static void main(String[] args) {

		
		testing rotate = new testing(); 
	        int arr[] = { 1, 2, 3, 4 };
            int d = 2;
	        int n = arr.length;
	        rotate.printArray(arr, n);
	        System.out.println();
	        rotate.leftRotate(arr, d, n); // arr, 2, 4
	        rotate.printArray(arr, n); 
	}

}
