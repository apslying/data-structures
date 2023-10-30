
public class Customer {
	private int ID;
	private String ArrivalTime;
	private int WaitTime;
	
	
	
	public Customer(int iD, String arrivalTime) {
		ID = iD;
		ArrivalTime = arrivalTime;
	}
	
	
	
	public int getID() {
		return ID;
	}



	public String getArrivalTime() {
		return ArrivalTime;
	}



	public int getWaitTime() {
		return WaitTime;
	}



	public void setID(int iD) {
		ID = iD;
	}



	public void setArrivalTime(String arrivalTime) {
		ArrivalTime = arrivalTime;
	}



	public void setWaitTime(int WaitTime) {
		this.WaitTime = WaitTime;
	}



	public void printData(){
		System.out.println(ID+ " " + ArrivalTime + " " + WaitTime);
	}
	
	
}
