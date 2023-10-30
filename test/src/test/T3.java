import java.util.Scanner;
package test;

public class T3 {
	public static void main(String[] args) {
		String a,b,str;
		int n=0;
		Scanner myscan= new Scanner(System.in);
		
		System.out.println("Enter the first string: ");
		a= myscan.nextLine();
		System.out.println("Enter the second string: ");
		b= myscan.nextLine();
		
		//compare strings character-by-character. Increase index by 1 each time
		while(a.charAt(n) == b.charAt(n)){
			n++;
		}
		if(n==0){
			System.out.println(a + " and " + b + " have no common prefix.");
		}
		else{
			//print string from first character to last character that matched
			str= a.substring(0,n);
			System.out.println("The common prefix is " + str);
		}
		myscan.close();
	}

}
