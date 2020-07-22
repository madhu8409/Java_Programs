package typeCasting;

public class TypeCasting {
	 public static void main(String[] args) {
		 
//		 byte x = 4;
//		 int y = x; automatic typecasting
		 
		 int x = 4;
		 
		 double y = x; 
		 
		 // Here we are doing manual type casting
		 double myDouble = 3.14;
		 int myInt = (int)myDouble;
		 
		 
		 System.out.println(myInt);
		 
		 
		 System.out.println(y);
	 }

}
