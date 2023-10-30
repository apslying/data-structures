import java.util.Scanner;
public class Exercise6 {

	public static void main(String[] args) {
		
		//declare variables
		double a,b,c;
		
		Scanner myscan = new Scanner(System.in);
		
		//receive input
		System.out.println("Enter first number: ");
		
		a=myscan.nextDouble();
		
		System.out.println("Enter second number: ");
		
		b=myscan.nextDouble();
		
		c= a-b; 
		
		/*compare the two numbers by calculating their difference then follow
		  an if-else statement*/
		if (c>0) {
			System.out.println("The maximum is " + a);
		}
		else if (c<0) {
			System.out.println("The maximum is " + b);
		}
		else{
			System.out.println("The two numbers are equal.");
		}
		myscan.close(); 
	}
}
