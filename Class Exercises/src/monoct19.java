import java.util.Scanner;
public class monoct19 {
	public static int linearsearch(int [] array, int key){
		for(int i=0; i<array.length; i++){
			if (array[i]==key){
				return i;
			}

		}
		return -1;
		
	}
	public static void main(String[] args) {
		int[] list1= {1,2,3,4,5,6};
		int x=linearsearch(list1, 4);
		System.out.println(x);
		

	}

}
