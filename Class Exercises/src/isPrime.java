import java.util.Scanner;
public class isPrime {
	public static int isPrime(int n){
		for(int i=2; i<=(n/2); i++){
			if (n%i==0){
				return 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner myscan= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=myscan.nextInt();
		int x=isPrime(num);
		if(x==1){
			System.out.println("Not Prime.");
		}
		else{
			System.out.println("Is Prime.");
		}
		myscan.close();

	}

}
