public class Person {
	private String fname;
	private String lname;
	private int SSN;

	
	public Person(String fname, String lname, int sSN) {
		this.fname = fname;
		this.lname = lname;
		SSN = sSN;

	}

	public int getSSN() {
		return SSN;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
	
	
}
