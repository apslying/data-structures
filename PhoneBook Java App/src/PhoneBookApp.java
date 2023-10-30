import java.util.Scanner;
public class PhoneBookApp {
	public static void main(String[] args){
		int input;
		Scanner myscanner = new Scanner(System.in);
		PhoneBookDirectory user_directory = new PhoneBookDirectory();
		
		do{
			System.out.println("1.Add an entry to the phonebook\n"+
								"2.Delete an Entry\n"+
								"3.Edit an entry\n"+
								"4.Search for an entry by Last Name \n"+
								"5.Search for an entry by Phone Number\n"+ 
								"6.Print all phonebook entries\n"+
								"7.Quit\n\n"+
								"Enter your selection (1-7): ");
			input= myscanner.nextInt();
			if (input==1)
				user_directory.addEntry();
			else if (input==2)
				user_directory.deleteEntry();
			else if (input==3)
				user_directory.editEntries();
			else if (input==4)
				user_directory.searchByLastName();
			else if (input==5)
				user_directory.searchByPhoneNumber();
			else if (input==6)
				user_directory.printAllEntries();
			else if (input==7)
				break;
		} while(input !=7);
		myscanner.close();
	}
	
	

}
