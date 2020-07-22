package Arrays;

public class forLooparray {

	public static void main(String[] args) {
		// The particular program shows that how can we fetch 
//		the values from the array using for loop
		
		int[] stud_no= {1, 2, 3, 4, 5, 6, 7, 8};
		double[] stud_marks= {25.5,32.6,33.9,85.3,99.95,66.9,77.7,88.8};

		for(int i=0; i<stud_no.length;i++) {
			System.out.println(stud_no[i] + "  "+ stud_marks[i]);
		}
		
	}

}
