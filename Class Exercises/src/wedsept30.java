import java.util.Scanner;
public class wedsept30 {
	
	public static void printmessage(String s){
		System.out.println(s);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myscan = new Scanner(System.in);
		System.out.println("Enter name: ");
		String a = myscan.nextLine();
		printmessage(a);

	}

}
