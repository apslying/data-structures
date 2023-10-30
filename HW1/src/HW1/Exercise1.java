//import class. Scanner is in java.util package
import java.util.Scanner;
public class Exercise1 {
	public static void main(String[] args) {
		//declare variables
		double a;
		double b; 
		double add;
		double sub;
		double div;
		double mult;
		double rem;
		
		//create a Scanner object
		Scanner myscan = new Scanner(System.in);
		
		//prompt the user to input first number
		System.out.println("Enter the first number: ");
		
		//reads input and assigns that to the variable a
		a = myscan.nextDouble();
		System.out.println("Enter the second number: ");
		b = myscan.nextDouble();
		
		//perform the operations
		add = a + b;
		sub = a-b;
		div = a/b;
		mult = a*b;
		rem = a%b;
		
		//display the results
		System.out.println("The sum is: " + add);
		System.out.println("The difference is: " + sub);
		System.out.println("The quotient is: " + div);
		System.out.println("The product is: " + mult);
		System.out.println("The remainder is: " + rem);
		
		//close the Scanner 
		myscan.close();
		
	}

}
