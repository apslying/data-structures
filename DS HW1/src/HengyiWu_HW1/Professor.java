public class Professor{
	private String username;
	private String password;
	private String ID;
	private String SSN;
	private String name;
	private String address;
	private String office;
	private String phone;
	
	public Professor(){
		
	}

	
	public Professor(String username, String password, String iD, String sSN,
			String name, String address, String office, String phone) {
		this.username = username;
		this.password = password;
		ID = iD;
		SSN = sSN;
		this.name = name;
		this.address = address;
		this.office = office;
		this.phone = phone;
	}



	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getID() {
		return ID;
	}

	public String getSSN() {
		return SSN;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getOffice() {
		return office;
	}

	public String getPhone() {
		return phone;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
