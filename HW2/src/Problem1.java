//import Scanner class
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		//declare variables
		int select;
		double balance, deposit, withdraw;
		balance= 0;
		deposit= 0;
		withdraw= 0;
		
		//create Scanner object
		Scanner myscan = new Scanner(System.in);
		//do-while loop to display kiosk options at least once
		do{
			System.out.println("1. View your account balance\n" +
					"2. Deposit cash\n"+
					"3. Withdraw cash\n"+
					"4. Leave kiosk\n\n"+
					"Enter your selection:");
			
			//receive selection
			select= myscan.nextInt();
			 
			//decide which branch to take depending on selection
			if(select==1){
				//format balance to 2 decimal places
				System.out.printf("Your current balance is: %.2f", balance);
				System.out.println("\n");
			}
			else if(select==2){
				System.out.println("Enter the amount you want to deposit: ");
				deposit= myscan.nextDouble();
				//increment balance by deposit amount
				balance=balance + deposit;
			}
			else if(select==3){
				System.out.println("Enter the amount you want to withdraw: ");
				withdraw= myscan.nextDouble();
				//prevent withdrawing more money that customer has in account
				if(withdraw>balance){
					System.out.println("Sorry you don't have enough balance!");
				}
				else{
				balance=balance - withdraw;
				}
			}
			//exit loop
			else if(select==4){
			System.out.println("Goodbye.");
			}
		} while(select!=4);
		//close scanner
		myscan.close();	
			
	}

}
