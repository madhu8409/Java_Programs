
	
//A library has an average of 510 visitors on Sundays and 240 on other days.
//The average number of visitors per day in a month of 30 days beginning with a Sunday is:

package conditionalStatements;


public class SundayVisitors {

	public static void main(String[] args) {
		
		int sunday = 510,
		
		otherDays = 240,
		
		totalSunday = 5,
		
		remainingDays = 25,
		
		month = 30;
		
		int totalSum = (sunday*totalSunday) + (otherDays*remainingDays);
		
		System.out.println("The total Sum is: " + totalSum);
		
		int average = totalSum/month;
		
		System.out.println("The average numbers of the visitors perday in  a month of 30 is: " +average);

	}

}
