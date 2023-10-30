import java.util.Scanner;


public class Sept21mon {
	public static void main(String[] args){
		String userreal="john123";
		String passreal="hello 5";
		String a,b; 
		
		Scanner myscan = new Scanner(System.in);
		
		System.out.println("Enter username: ");
		
		a=myscan.nextLine(); 
		
		System.out.println("Enter password: ");
		
		b=myscan.nextLine();
		
		if ((a.equals(userreal)==true) && (b.equals(passreal)==true)) {
			System.out.println("Correct both");
		}
		else{
			System.out.println("One is wrong");
		}
		myscan.close(); 
			
			
				
	}
	

}
