import java.util.Scanner;
public class Exercise3 {
	public static void main (String[] args){
		
		//declare variables
		String grade;
		
		double min_avg, curr_avg, percent_grd, score_needed;
		
		Scanner myscan = new Scanner(System.in);
		
		//receive and store input
		System.out.println("Enter desired grade: ");
		
		grade= myscan.next();
		
		System.out.println("Enter minimum average required: ");
		
		min_avg= myscan.nextDouble();
		
		System.out.println("Enter current average in course: ");
		
		curr_avg= myscan.nextDouble();
		
		System.out.println("Enter how much the final counts as a percentage of the course grade: ");
		
		percent_grd= myscan.nextDouble();
		
		//calculate score needed
		score_needed= (100*min_avg-(curr_avg*(100-percent_grd)))/percent_grd;
		
		System.out.printf("You need a " + score_needed + " on the final to get a/an " + grade);
		
		myscan.close();
		
		
		
	}

}
