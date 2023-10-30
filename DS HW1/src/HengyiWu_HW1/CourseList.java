import java.util.ArrayList;
import java.util.Scanner;

public class CourseList {
	public static ArrayList<Course> courselist = new ArrayList<Course>();
	private static Scanner input = new Scanner(System.in);
	
	public CourseList(){
	}
	
	public static void addObj(){
		String a,b,c,d,e,f;
		Boolean g=false;
		
		System.out.println("Enter coursenumber: ");
		a=input.next();
		System.out.println("Enter coursename: ");
		b=input.next();
		System.out.println("Enter time: ");
		c=input.next();
		System.out.println("Enter room: ");
		d=input.next();
		System.out.println("Enter students: ");
		e=input.next();
		System.out.println("Enter instructor: ");
		f=input.next();
		System.out.println("1. Course is full\n" +
				"2. Course is NOT full\n\n" +
				"Enter your selection (1 or 2): ");
		int choice=input.nextInt();
		if (choice==1)
			g= true;
		else if (choice==2)
			g= false;
		//add an object of type Student to the ArrayList
		courselist.add(new Course(a,b,c,d,e,f,g));
	}
	
	public static void deleteObj(){
		System.out.println("Enter the index of the course you want to delete: ");
		int i = input.nextInt();
		//use remove method
		courselist.remove(i);
	}
	
	public static void displayObj(){
		for (int i=0; i<courselist.size(); i++){
			//create variable to reference the object at index i
			Course x=courselist.get(i);
			//print the name of the course
			System.out.println(x.getCoursename());
		}
	}
	
	public static void displayFullCourses(){
		for (int i=0; i<courselist.size(); i++){
			Course x=courselist.get(i);
			//check if course is full
			if (x.getIsFull()==true)
				//if full, then print course name
				System.out.println(x.getCoursename());
		}
	}
	
	
}


