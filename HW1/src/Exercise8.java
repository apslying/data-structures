import java.util.Scanner;


public class Exercise8 {

	public static void main(String[] args) {
		
		//declare variables
		double x1,y1,x2,y2,d;
		
		//create Scanner object
		Scanner myscan = new Scanner(System.in);
		
		//receive input
		System.out.println("Enter x1 and y1: ");
		x1 = myscan.nextDouble();
		y1 = myscan.nextDouble();
		
		System.out.println("Enter x2 and y2: ");
		x2 = myscan.nextDouble();
		y2 = myscan.nextDouble();
		
		//calculate result
		d= Math.pow((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1), 0.5);
		
		System.out.printf("The distance between these two points is %.2f", d );

		//close Scanner
		myscan.close();
	}

}
