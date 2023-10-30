import java.util.Scanner;
public class PhoneBookDirectory {
	//create an array of PhoneBookEntry objects 
	public PhoneBookEntry[] directory = new PhoneBookEntry[10];
	private Scanner myscan = new Scanner(System.in);
	public int index=0;
	
	//constructor for PhoneBookDirectory class
	public PhoneBookDirectory(){
		for(int i=0; i<10; i++){
			directory[i]=new PhoneBookEntry();
		}
	}
	
	//allows user to add multiple entries 
	public void addEntry(){
		String choice;
		do{
			System.out.println("Enter first name: ");
			directory[index].setFirstName(myscan.nextLine());
			System.out.println("Enter last name: ");
			directory[index].setLastName(myscan.nextLine());
			System.out.println("Enter email: ");
			directory[index].setEmail(myscan.nextLine());
			System.out.println("Enter zipcode: ");
			directory[index].setZipcode(myscan.nextLine());
			System.out.println("Enter phone number: ");
			directory[index].setPhoneNumber(myscan.nextLine());
			index++;
			if(index<10){
				System.out.println("Add another entry?");
				System.out.println("Enter y for yes, n for no: ");
				choice= myscan.nextLine();
			}
			else{
				System.out.println("The directory is now full. No more entries may be added." );
				break;
			}
		} while(choice.equals("y"));
	}
	
	//allows user to delete an entry
	public void deleteEntry(){
		String choice;
		
		do{
			System.out.println("Enter the index (0-9) of the entry you want to delete: ");
			int del = myscan.nextInt();
			//set all data fields to null 
			directory[del].setFirstName(null);
			directory[del].setLastName(null);
			directory[del].setEmail(null);
			directory[del].setZipcode(null);
			directory[del].setPhoneNumber(null);
			
			System.out.println("Delete another entry? y/n:");
			choice = myscan.nextLine();
		}while(choice.equals("y"));
		
	}
	
	//allows user to edit data fields of one or more entries
	public void editEntries(){
		String field;
			//determine which entry
			System.out.println("Enter the index (0-9) of the entry you want to edit: ");
			int i = myscan.nextInt();
			//determine which data field 
			System.out.println("Which data field do you want to edit?\n" +
								"f for first name\n"+
								"l for last name\n"+
								"e for email\n"+
								"z for zipcode\n"+
								"p for phone number\n\n"+
								"Enter your selection: ");
			field= myscan.next();
			//allow user to change data field 
			System.out.println("What would you like to change it to?: ");
			String edit= myscan.next();
			if (field.equals("f"))
				directory[i].setFirstName(edit);
			else if (field.equals("l"))
				directory[i].setLastName(edit);
			else if (field.equals("e"))
				directory[i].setEmail(edit);
			else if (field.equals("z"))
				directory[i].setZipcode(edit);
			else if (field.equals("p"))
				directory[i].setPhoneNumber(edit);
		
	}
	
	//prints all data fields of an entry given last name
	public void searchByLastName(){
		boolean found=false; 
		System.out.println("Enter the last name of the entry you are searching for:");
		String last=myscan.nextLine();
		//will print multiple entries if last name is found more than once
		for (int i=0; i<10; i++){
			String x = directory[i].getLastName();
			if (x==null){
				
			}
			else if (x.equals(last)){
				found=true;
				directory[i].printPhoneBookEntry();
			}
		}
		if (found==false){
			System.out.println("Sorry, this last name could not be found.");
		}
	}
	
	//prints all data fields of an entry given phone number
	public void searchByPhoneNumber(){
		boolean found=false; 
		System.out.println("Enter the phone number of the entry you are searching for:");
		String phone=myscan.nextLine();
		for (int i=0; i<10; i++){
			String y = directory[i].getPhoneNumber();
			if (y==null){
				
			}
			else if (y.equals(phone)){
				found=true;
				directory[i].printPhoneBookEntry();
			}
		}
		if (found==false){
			System.out.println("Sorry, this phone number could not be found.");
		}
	}
	
	//allows user to print all entries 
	public void printAllEntries(){
		for(int i=0; i<10; i++){
			directory[i].printPhoneBookEntry();
			System.out.println("");
		}
	}
}