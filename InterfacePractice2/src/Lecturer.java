
public class Lecturer {
	private String email;
	private String name;
	private String subject;
	
	public Lecturer(){
		
	}
	
	public Lecturer(String e, String n, String s){
		email=e;
		name=n;
		subject=s;
	}
	
	public String getDescription(){
		return "Teaches " + subject;
	}
	public String getEmail(){
		return email;
	}
	public String getName(){
		return name;
	}
	public String getSubject(){
		return subject;
	}

}
