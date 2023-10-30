import java.util.Scanner;
public class wedsept23 {
	public static void main (String[] args){
		int n,sum;
		sum=0;
		Scanner myscan = new Scanner(System.in);
		System.out.println("enter num: ");
		n=myscan.nextInt();
		while(n>0){
			sum=sum+n;
			n=n-1;
			
			}
		System.out.println(sum);
	
		myscan.close();
		
		}
	}

