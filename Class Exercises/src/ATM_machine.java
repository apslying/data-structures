import java.util.Scanner;
public class ATM_machine {
	public static double balance=0;
	public static int pin=1234;
	public static Scanner myscan = new Scanner(System.in);
	
	public static void change_pin(){
		System.out.println("Enter your current PIN: ");
		int input= myscan.nextInt();
		if (input==pin){
			System.out.println("Enter your new PIN: ");
			int new_pin= myscan.nextInt();
			pin = new_pin;
		}
		else {
			System.out.println("That is not the correct PIN.");
		}
	}
	public static boolean login(){
		System.out.println("Enter your PIN: ");
		int input=myscan.nextInt();
		if(input== pin){
			return true;
		}
		else{
			return false;
		}
	}
	public static void menu(){
		System.out.println("1. View your account balance\n" +
				"2. Deposit cash\n"+
				"3. Withdraw cash\n"+
				"4. Change PIN\n"+
				"5. Leave kiosk\n\n"+
				"Enter your selection:");
	}
	
	
	public static void balance(){
		System.out.printf("Your current balance is: %.2f", balance);
		System.out.println("\n");
	}
	public static double deposit(){
		double d;
		System.out.println("Enter the amount you want to deposit: ");
		d= myscan.nextDouble();
		balance=balance + d;
		return balance;
	}
	public static double withdraw(){
		double w;
		System.out.println("Enter the amount you want to withdraw: ");
		w= myscan.nextDouble();
		if(w>balance){
			System.out.println("Sorry you don't have enough balance!");
		}
		else{
		balance=balance - w;
		}
		return balance;
	}
	
	
	public static void main(String[] args) {
		int s=0;
		if (login()==true){
			while (s != 5){
				menu();
				s=myscan.nextInt();
				if (s==1){
					balance();
				}
				else if (s==2){
					deposit();
				}
				else if (s==3){
					withdraw();
				}
				else if (s==4){
					change_pin();
				}
				else if (s==5){
					System.out.println("Goodbye.");
				}	
			}
		}
		else{
			System.out.println("Sorry, that is not the correct PIN.");
		}
		myscan.close();
	}


}
