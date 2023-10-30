import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		//declare variables
		int a, power, i;
		Scanner myscan= new Scanner(System.in);
		//receive input
		System.out.println("Enter an integer:" );
		a= myscan.nextInt();
		System.out.println("What power do you want " + a + " to be raised to? :" );
		power= myscan.nextInt();
		
		//loop to print a "x" power times
		for(i=0; i<power; i++){
			System.out.print(a + "x");
		}
		
		//prints the last a and the answer 
		System.out.print(a + " = ");
		System.out.printf("%.0f", Math.pow(a,power));
		myscan.close();
		
		
	}

}
