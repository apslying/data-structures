import java.util.Scanner;
public class oct7wed {

	public static void main(String[] args) {
		Scanner myscan= new Scanner(System.in);
		int i;
		
		int[] grades= new int[5];
		for(i=0; i<grades.length; i++){
			System.out.println("Enter grade number "+(i+1));
			grades[i]=myscan.nextInt();
		}
		
		for(i=0; i<grades.length; i++){
			System.out.println(grades[i]);
			
		}
		int sum=0;
		for (i=0; i<grades.length; i++){
			sum=sum + grades[i];
		}
		
		double avg=sum/grades.length;
		System.out.println(avg);
		myscan.close();
		
		

	}

}
