import java.util.Scanner;


public class BankTest {

	public static void main(String[] args) {

		Account acc;
		Scanner in=new Scanner(System.in);

		System.out.println("Enter account type: (1) current (2) savings");
		int type=in.nextInt();
		System.out.println("Enter account number");
		int num=in.nextInt();

		if (type==1){
			acc=new CurrentAccount(num, 0,  500);
		}else{
			acc=new SavingsAccount(num, 0, (float)0.01);
		}
		boolean exit=false;
		while (!exit){			
			System.out.println("Select an option:");
			System.out.println("1 - Withdraw");
			System.out.println("2 - Deposit");
			System.out.println("3 - Show balance");
			System.out.println("4 - Exist");
			int selection=in.nextInt();
			switch(selection){
			case 1:
				while (true){
					System.out.println("Enter Amount");
					float amount=0;
					try{
						amount=in.nextFloat();
					}catch(Exception ex){
						System.out.println("invalid input, try again");
						continue;
					}
					acc.withdraw(amount);
					break;
				}

				break;
			case 2:
				while (true){
					System.out.println("Enter Amount");
					float amount=0;
					try{
						amount=in.nextFloat();
					}catch(Exception ex){
						System.out.println("invalid input, try again");
						continue;
					}
					acc.deposit(amount);
					break;
				}
				break;
			case 3:
				System.out.println("Account balance is "+acc.getBal());
				break;
			case 4:
				System.out.println("Thank you for banking with us");
				exit=true;
				break;
			default:
				System.out.println("invalid input, try again");

			}
		}
		in.close();
	}


}

