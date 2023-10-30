
public abstract class Person {
	private String name;
	private String username;
	private String password;
	private String SSN;
	private String address;
	private String phone; 
	
	protected Person(){
		
	}
	
	protected Person(String name, String username, String password, String sSN,
			String address, String phone) {
		this.name = name;
		this.username = username;
		this.password = password;
		SSN = sSN;
		this.address = address;
		this.phone = phone;
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

	public String getSSN() {
		return SSN;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
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

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}

