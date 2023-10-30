import java.util.Scanner;
public class Exercise7_3 {

	public static void main(String[] args) {
		//create array of one million integers, presumably the user will not enter a million integers
		int[] nums= new int[1000000];
		Scanner myscan = new Scanner(System.in);
		System.out.println("Enter the integers between 1 and 100: ");
		for(int i=0; i<1000000; i++){
			//The entered numbers are stored in nums[0] up to nums[999999] in the order they were entered.
			nums[i]=myscan.nextInt();
			//Stops reading input after 0 is entered
			if(nums[i]==0){
				break;
			}
		}
		
		int count=0;
		//checks how often 1 appears, then 2, up to 100 in a for loop. 
		for(int key=1; key<=100; key++){
			//for a fixed key, this loop checks each value of the array for a match
			for (int i=0; i<1000000; i++){
				if (nums[i]==key){
					//count increased by 1 each time key is found
					count++;
				}
			}
			//do nothing if key is found 0 times
			if (count==0){
				
			}
			else if (count==1){
				System.out.println(key + " occurs 1 time.");
			}
			else{
				System.out.println(key + " occurs " + count + " times");
			}
			//reset count to 0 before advancing to the next key 
			count=0;
		}
		myscan.close();

	}

}
