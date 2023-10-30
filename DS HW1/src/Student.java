import java.util.ArrayList;

public class Student{
	private String name;
	private String username;
	private String password;
	private String studentNumber;
	private String SSN;
	private String address;
	private String phone; 
	private String DOB;
	private String major;
	private String GPA;
	private ArrayList<String> courses;
	
	public Student(){
	}
	

	public Student(String name, String username, String password,
			String studentNumber, String sSN, String address, String phone,
			String dOB, String major, String gPA) {
		this.name = name;
		this.username = username;
		this.password = password;
		this.studentNumber = studentNumber;
		SSN = sSN;
		this.address = address;
		this.phone = phone;
		DOB = dOB;
		this.major = major;
		GPA = gPA;
		this.courses= new ArrayList<String>();
	}


	public String getName() {
		return name;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public String getSSN() {
		return SSN;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public String getDOB() {
		return DOB;
	}

	public String getMajor() {
		return major;
	}

	public String getGPA() {
		return GPA;
	}

	public ArrayList<String> getCourses() {
		return courses;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void setGPA(String gPA) {
		GPA = gPA;
	}

	public void addCourses(String course) {
		this.courses.add(course);
	}
	
	public void printCourses(){
		for(int i=0; i<courses.size(); i++){
			System.out.println(courses.get(i));
		}
	}
	
}