import java.util.Scanner;
public class Exercise4 {
	public static void main (String[] args){
		
		//declare varibles
		double f,c;

		Scanner myscan = new Scanner(System.in);
		
		//receive input
		System.out.println("Enter temperature in Fahrenheit:");
		
		f= myscan.nextDouble();
		
		c= (5.0/9.0)*(f-32);
		
		//display result
		System.out.printf("That is equal to %.2f degrees Celsius", c);
		
		myscan.close();
		
	}
}
