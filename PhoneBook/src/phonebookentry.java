
public class phonebookentry {
	private String firstname;
	private String lastname;
	private int phonenumber;
	private String emailaddress;
	
	public phonebookentry(String fn, String ln, int num, String email){
		firstname=fn;
		lastname=ln;
		phonenumber=num;
		emailaddress=email;
	}
	
	public phonebookentry(String fn, int num){
		firstname=fn;
		phonenumber=num;
	}
	
	public String getfirstname(){
		return firstname;
	}
	
	public String getlastname(){
		return lastname;
	}
	public int getphonenumber(){
		return phonenumber;
	}
	public String getemailaddress(){
		return emailaddress;
	}
	
	public void setfirstname(String f){
		firstname=f;
	}
	public void setlastname(String s){
		lastname=s;
	}
	public void setphonenumber(int x){
		phonenumber=x;
	}
	public void printPhoneentry(){
		System.out.println("Phone Book Entry");
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(phonenumber);
		System.out.println(emailaddress);
	}

}
