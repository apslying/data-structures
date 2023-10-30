import java.util.Scanner;
public class PhoneBookApp1 {

	public static void main(String[] args) {
		int choice;
		Scanner myscanner = new Scanner(System.in);
		PhoneBookDirectory1 user_directory = new PhoneBookDirectory1();
		//compact code because everything is in PhoneBookDirectory class
		do{
			System.out.println("1.Add an entry to the phonebook\n"+
								"2.Delete an Entry\n"+
								"3.Edit an entry\n"+
								"4.Search for an entry by Last Name \n"+
								"5.Search for an entry by Phone Number\n"+ 
								"6.Print all phonebook entries\n"+
								"7.Quit\n\n"+
								"Enter your selection (1-7): ");
			choice= myscanner.nextInt();
			if (choice==1)
				user_directory.addEntry();
			else if (choice==2)
				user_directory.deleteEntry();
			else if (choice==3)
				user_directory.editEntries();
			else if (choice==4)
				user_directory.searchByLastName();
			else if (choice==5)
				user_directory.searchByPhoneNumber();
			else if (choice==6)
				user_directory.printAllEntries();
			else if (choice==7)
				break;
		} while(choice !=7);
		myscanner.close();

	}

}
