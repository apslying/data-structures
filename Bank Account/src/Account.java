public class Account {
	private int num;
	private float bal;
	
	public Account(int num, float bal) {
		this.num = num;
		this.bal = bal;
	}
	
	public Account(int num) {
		this.num = num;
		this.bal=0;
	}
	
	public Account(){
		
	}

	public int getNum() {
		return num;
	}
	public float getBal() {
		return bal;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setBal(float bal) {
		this.bal = bal;
	}
	
	public void deposit(float amount){
		bal=bal+amount;
	}
	
	public void withdraw(float amount){
		if(bal-amount >= 0){
			bal=bal-amount;
		}
		else{
			System.out.println("Error. Amount exceeds balance.");
		}
	}
	
}
