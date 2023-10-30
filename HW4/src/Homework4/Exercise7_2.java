import java.util.Scanner;
public class Exercise7_2 {

	public static void main(String[] args) {
		//create array of 10 integers
		int[] nums = new int[10];
		Scanner myscan = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		//Enter 10 numbers separated by a space then press enter. Or enter one number at
		//a time and press enter each time.
		for(int i=0; i<10; i++){
			//The entered numbers are stored in nums[0] to nums[9] in the order they were entered.
			nums[i]=myscan.nextInt();
		}
		for(int i=9; i>=0; i--){
			//The array is printed in reverse order, starting from nums[9] to nums[0].
			System.out.print(nums[i] + " ");
		}
		myscan.close();
		
	}

}
