import java.util.ArrayList;
import java.util.Scanner;
public class PhoneBookDirectory1 {
	//create an ArrayList of PhoneBookEntry objects
	public ArrayList<PhoneBookEntry1> mydirectory = new ArrayList<PhoneBookEntry1>();
	private Scanner input = new Scanner(System.in);
	
	//constructor for PhoneBookDirectory2 class
	public PhoneBookDirectory1(){
	}
	
	//allows user to add multiple entries 
	public void addEntry(){
		String a,b,c,d,e;
		String choice;
		do{
			System.out.println("Enter first name: ");
			a=input.nextLine();
			System.out.println("Enter last name: ");
			b=input.nextLine();
			System.out.println("Enter email: ");
			c=input.nextLine();
			System.out.println("Enter zipcode: ");
			d=input.nextLine();
			System.out.println("Enter phone number: ");
			e=input.nextLine();
			//add an object of type PhoneBookEntry to the ArrayList
			mydirectory.add(new PhoneBookEntry1(a,b,c,d,e));
			System.out.println("Add another entry?");
			System.out.println("Enter y for yes, n for no: ");
			choice= input.nextLine();
		} while(choice.equals("y"));
	}
	
	//allows user to delete an entry
	public void deleteEntry(){
		System.out.println("Enter the index of the entry you want to delete: ");
		int i = input.nextInt();
		//use remove method
		mydirectory.remove(i);
	}
	
	//allows user to edit data fields of one or more entries
	public void editEntries(){
		String field;
			//determine which entry
			System.out.println("Enter the index of the entry you want to edit: ");
			int i = input.nextInt();
			//create variable to reference the object at index i
			PhoneBookEntry1 x=mydirectory.get(i);
			//determine which data field 
			System.out.println("Which data field do you want to edit?\n" +
								"f for first name\n"+
								"l for last name\n"+
								"e for email\n"+
								"z for zipcode\n"+
								"p for phone number\n\n"+
								"Enter your selection: ");
			field= input.next();
			//allow user to change data field 
			System.out.println("What would you like to change it to?: ");
			String edit= input.next();
			if (field.equals("f"))
				x.setFirstName(edit);
			else if (field.equals("l"))
				x.setLastName(edit);
			else if (field.equals("e"))
				x.setEmail(edit);
			else if (field.equals("z"))
				x.setZipcode(edit);
			else if (field.equals("p"))
				x.setPhoneNumber(edit);
	}
	
	//prints all data fields of an entry given last name
	public void searchByLastName(){
		boolean found=false; 
		System.out.println("Enter the last name of the entry you are searching for:");
		String last=input.nextLine();
		//will print multiple entries if last name is found more than once
		for (int i=0; i<mydirectory.size(); i++){
			PhoneBookEntry1 x = mydirectory.get(i);
			if (x.getLastName()==null){
				
			}
			else if (x.getLastName().equals(last)){
				found=true;
				x.printPhoneBookEntry();
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
		String phone=input.nextLine();
		for (int i=0; i<mydirectory.size(); i++){
			PhoneBookEntry1 y = mydirectory.get(i);
			if (y.getPhoneNumber()==null){
				
			}
			else if (y.getPhoneNumber().equals(phone)){
				found=true;
				y.printPhoneBookEntry();
			}
		}
		if (found==false){
			System.out.println("Sorry, this phone number could not be found.");
		}
	}
	
	//allows user to print all entries 
	public void printAllEntries(){
		for(int i=0; i<mydirectory.size(); i++){
			PhoneBookEntry1 x= mydirectory.get(i);
			x.printPhoneBookEntry();
			System.out.println("");
		}
	}


}
