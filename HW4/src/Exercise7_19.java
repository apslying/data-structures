import java.util.Scanner;

public class Exercise7_19 {
	public static boolean isSorted(int[] list){
		for (int i=2; i<list.length; i++){
			//checks if current number in list if larger than previous one
			//this is done for every element in the list
			if (list[i]<list[i-1]){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner myscan= new Scanner(System.in);
		System.out.println("Enter list (first number indicates number of elements in list): ");
		//store the first number entered and use it as the length of the array
		int length= myscan.nextInt();
		int[] nums = new int[length];
		//store the array one entry at a time 
		for (int i=0; i<length; i++){
			nums[i]=myscan.nextInt();
		}
		//call the method
		if(isSorted(nums)==true){
			System.out.println("The list is already sorted.");
		}
		else{
			System.out.println("The list is not sorted.");
		}
		myscan.close();
		
	}



}
