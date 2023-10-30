import java.util.Scanner;
public class PHONEBOOK {

	public static void main(String[] args) {
		String fi;
		String la;
		int ph;
		String em;
		Scanner input;
		input=new Scanner(System.in);
		System.out.println("Enter first name: ");
		fi=input.next();
		System.out.println("Enter last name: ");
		la=input.next();
		System.out.println("Enter phone number: ");
		ph=input.nextInt();
		System.out.println("Enter email address: ");
		em=input.next();
		
		phonebookentry John= new phonebookentry(fi,la,ph,em);
		John.printPhoneentry();
		John.setlastname("yes");
		
		
		
		
	}

}
