//import class
import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		
		int minutes, years, days;
		
		//create Scanner object
		Scanner myscan = new Scanner(System.in);
		
		System.out.println("Enter the number of minutes: ");
		
		minutes = myscan.nextInt();
		
		/*years and minutes are of type int, so years will have the correct 
		  integer number of years and will omit the remainder*/
		years = minutes/(60*24*365);
		
		/*first the remaining number of minutes to do not create a whole year
		  is calculated and that number is converted to number of days*/
		days = (minutes%(60*24*365))/(60*24);
		
		System.out.println(minutes + " minutes is equal to " + years + " years and " + days + " days");
		
		//close Scanner 
		myscan.close();
		
		

	}

}
