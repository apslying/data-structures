
public class Student implements Person {
	private String email;
	private String name;
	private String grade;
	
	public Student(){
		
	}
	
	public Student(String e, String n, String g){
		email=e;
		name=n;
		grade=g;
	}
	
	public String getDescription(){
		return "A " + grade + " grade student";
	}
	public String getEmail(){
		return email;
	}
	public String getName(){
		return name;
	}
	public String getGrade(){
		return grade;
	}

}
