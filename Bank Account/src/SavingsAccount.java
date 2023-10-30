
public class SavingsAccount extends Account {
	
	private float interestRate;

	public SavingsAccount(int num, float bal, float i) {
		super(num, bal);
		interestRate=i;
	}
	
	public SavingsAccount(){
		super();
	}
	
	public void addInterest(){
		this.setBal(this.getBal() + this.getBal()*interestRate);
	}
	
	

}
