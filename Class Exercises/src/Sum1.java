import java.util.Scanner;
public class Sum1 {
	public static int Sum1(int n){
		int sum=0;
		while(n/10>0){
			int rem=n%10;
			n=n/10;
			System.out.println("n= " +n);
			sum=sum+rem;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner myscan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=myscan.nextInt();
		int x=Sum1(num);
		System.out.println(x);
		myscan.close();
	
	}

}
