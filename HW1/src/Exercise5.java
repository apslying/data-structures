import java.util.Scanner;
public class Exercise5 {

	public static void main(String[] args) {
		
		//declare variables
		String password="NYU1256";
		String input;
		
		Scanner myscan = new Scanner(System.in);
		
		//receive input
		System.out.println("Enter password: ");
		
		input=myscan.nextLine();
		
		/*instructs the program to compare the input with the correct password 
		  and proceed following an if-else statement*/
		if (input.equals(password)==true) {
			System.out.println("Valid Password.");
		}
		else{
			System.out.println("Invalid Password.");
		}
		myscan.close(); 

	}

}
