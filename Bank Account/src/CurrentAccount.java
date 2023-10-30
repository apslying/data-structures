public class CurrentAccount extends Account{
	private int overdraftLimit;

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(int num, float bal, int over) {
		super(num, bal);
		overdraftLimit=over;
	}
	
	public void withdraw(float amount){
		if(this.getBal()-amount >= overdraftLimit){
			this.setBal(this.getBal()-amount);
		}
		else{
			System.out.println("Error. Amount exceeds overdraft limit.");
		}
	}

}
