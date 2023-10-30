
public class PhoneBookEntry1 {
	//data fields
	//must not be static, will cause problems 
	public String firstname;
	public String lastname;
	public String email;
	public String zipcode;
	public String phonenumber; 
	
	//constructors 
	public PhoneBookEntry1(String f,String l,String e,String z,String p){
		firstname=f;
		lastname= l;
		email=e;
		zipcode=z;
		phonenumber=p;
	}
	
	public PhoneBookEntry1(){
	}
	
	public PhoneBookEntry1(String f, String p){
		firstname= f;
		phonenumber= p;
	}
	
	//prints all data fields of an entry
	public void printPhoneBookEntry(){
		System.out.println("First name: " + firstname);
		System.out.println("Last name: " +lastname);
		System.out.println("Email: " + email);
		System.out.println("Zip code: " + zipcode);
		System.out.println("Phone Number: " + phonenumber);
	}
	
	//getters
	public String getFirstName(){
		return firstname;
	}
	
	public String getLastName(){
		return lastname;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getZipCode(){
		return zipcode;
	}
	
	public String getPhoneNumber(){
		return phonenumber;
	}
	
	//setters
	public void setFirstName(String a){
		firstname=a;
	}
	
	public void setLastName(String b){
		lastname=b;
	}
	
	public void setEmail(String c){
		email=c;
	}
	
	public void setZipcode(String d){
		zipcode=d;
	}
	
	public void setPhoneNumber(String e){
		phonenumber=e;
	}
		
}
