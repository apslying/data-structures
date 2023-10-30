import java.util.Scanner;
public class Exercise7_10 {
	public static int indexOfSmallestElement(double[] array){
		//set min as first element of array
		double min = array[0];
		//store the index as 0
		int index= 0;
		for(int i=1; i<array.length; i++){
			//go through the elements of the array one by one. If an element is less than min, 
			//store it as the new min 
			if(array[i]<min){
				min = array[i];
				//store the index of the min if it changes
				index = i; 
			}
		}
		return index;
	}

	public static void main(String[] args) {
		double[] nums= new double[10];
		Scanner myscan=new Scanner(System.in);
		System.out.println("Enter 10 doubles: ");
		//store values in array one-by-one
		for(int i=0; i<10; i++){
			nums[i]=myscan.nextDouble();
		}
		//call the method
		int x=indexOfSmallestElement(nums);
		System.out.println("The index of the smallest element is: " +x);
		myscan.close();

	}

}
