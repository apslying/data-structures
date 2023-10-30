import java.util.Scanner;


public class Exercise7 {

	public static void main(String[] args) {
		
		
		//declare variables
		double a,b,c,d;
		
		Scanner myscan = new Scanner(System.in);
		
		//receive input
		System.out.println("Enter first exam grade: ");
		
		a=myscan.nextDouble();
		
		System.out.println("Enter second exam grade: ");
		
		b=myscan.nextDouble();
		
		System.out.println("Enter third exam grade: ");
		
		c=myscan.nextDouble();
		
		d= (a+b+c)/3;
		
		//display result
		System.out.printf("The mean of your exam grades is %.2f ", d);

		myscan.close();


	}

}
