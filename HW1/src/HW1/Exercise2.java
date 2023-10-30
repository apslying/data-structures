import java.util.Scanner;
public class Exercise2{
	public static void main (String[] args){
		double km; 
		double miles;
		
		Scanner myscan = new Scanner(System.in);
		
		System.out.println("enter km:");
		
		km= myscan.nextDouble();
		
		miles = 0.6214 * km;
		
		//%.2f formats the output to 2 decimal places
		System.out.printf(km + " kilometers is equal to %.2f miles", miles);

		myscan.close();
	}
}
