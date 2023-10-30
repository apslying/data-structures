import java.util.Scanner;
public class Exercise7_8 {
	
	public static int average(int[] array){
		//initialize sum at 0
		int sum = 0;
		for(int i=0; i<array.length; i++){
			//add entries of array to sum one-by-one
			sum = sum + array[i];
		}
		return sum/(array.length);
	}
	
	public static double average(double[] array){
		double sum = 0;
		for(int i=0; i<array.length; i++){
			sum = sum + array[i];
		}
		return sum/(array.length);
	}	
	
	public static void main(String[] args) {
		//create new array
		double[] nums= new double[10];
		Scanner myscan = new Scanner(System.in);
		System.out.println("Enter 10 doubles: ");
		for(int i=0; i<10; i++){
			//store inputs in array one-by-one
			nums[i]=myscan.nextDouble();
		}
		//call method, set x equal to returned value
		double x = average(nums);
		System.out.println("The average is " + x);
		myscan.close(); 

	}

}
