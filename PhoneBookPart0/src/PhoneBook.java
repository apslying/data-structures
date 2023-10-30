
public class PhoneBook {

	public static void main(String[] args) {
		PhoneBookEntry john, james, sarah;
		john= new PhoneBookEntry("John", "Smith", "jsmith@gmail.edu", "20037", "2023334444");
		james=new PhoneBookEntry("James", "202344344");
		sarah= new PhoneBookEntry();
		sarah.setFirstName("Sarah");
		
		john.setPhoneNumber("202555555");
		john.printPhoneBookEntry();
		String x= john.getZipCode();
		james.setZipcode(x);

	}

}
