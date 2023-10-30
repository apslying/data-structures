import java.util.Scanner;
public class Exercise7_26 {
	public static boolean equals(int[] list1, int[] list2){
		//checks if list lengths are the same
		if (list1.length != list2.length){
			return false;
		}
		//if the program reaches this line, check if every element of list1 matches the 
		//corresponding element of list2 
		for (int i=0; i<list1.length;i++){
			if (list1[i] != list2[i]){
				return false;
			}
		}
		//if the program reaches this line, it has not yet returned false, so the two lists
		//must be identical
		return true;
	}

	public static void main(String[] args) {
		Scanner myscan= new Scanner(System.in);
		System.out.println("Enter first list (first number MUST indicate number of elements in list): ");
		//store the first number entered and use it as the length of the array
		int length1= myscan.nextInt();
		int[] list1 = new int[length1];
		//store the array one entry at a time 
		for (int i=0; i<length1; i++){
			list1[i]=myscan.nextInt();
		}
		//repeat for second list
		System.out.println("Enter second list (first number MUST indicate number of elements in list): ");
		int length2= myscan.nextInt();
		int[] list2 = new int[length2];
		for (int i=0; i<length2; i++){
			list2[i]=myscan.nextInt();
		}
		//call the method
		boolean x= equals(list1, list2);
		if (x==true){
			System.out.println("The two lists are strictly identical");
		}
		else {
			System.out.println("The two lists are NOT strictly identical");
		}
		myscan.close();

	}

}
