
public class Employee {
	private String email;
	private String name;
	private String department;
	
	public Employee(){
		
	}
	
	public Employee(String e, String n, String d){
		email=e;
		name=n;
		department=d;
	}
	
	public String getDescription(){
		return "Department: " + department;
	}
	public String getEmail(){
		return email;
	}
	public String getName(){
		return name;
	}
	public String getDepartment(){
		return department;
	}


}
