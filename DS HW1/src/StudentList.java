import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentList{
	
	public static ArrayList<Student> studentlist = new ArrayList<Student>();
	private static Scanner input = new Scanner(System.in);
	
	public static void addObj(){
		String a,b,c,d,e,f,g,h,i,j;
		System.out.println("Enter name: ");
		a=input.next();
		System.out.println("Enter username: ");
		b=input.next();
		System.out.println("Enter password: ");
		c=input.next();
		Write(b + " " + c, "students.txt");
		System.out.println("Enter studentNumber: ");
		d=input.next();
		System.out.println("Enter SSN: ");
		e=input.next();
		System.out.println("Enter address: ");
		f=input.next();
		System.out.println("Enter phone: ");
		g=input.next();
		System.out.println("Enter DOB: ");
		h=input.next();
		System.out.println("Enter major: ");
		i=input.next();
		System.out.println("Enter GPA: ");
		j=input.next();
		//add an object of type Student to the ArrayList
		StudentList.studentlist.add(new Student(a,b,c,d,e,f,g,h,i,j));
	}
	
	public static void deleteObj(){
		System.out.println("Enter the index of the student you want to delete: ");
		int i = input.nextInt();
		//use remove method
		StudentList.studentlist.remove(i);
	}
	
	public static void editStudent(){
		String field;
			//determine which entry
			System.out.println("Enter the index of the entry you want to edit: ");
			int i = input.nextInt();
			//create variable to reference the object at index i
			Student x=StudentList.studentlist.get(i);
			//determine which data field 
			System.out.println("Which data field do you want to edit?\n" +
								"u for username \n"+
								"p for password \n"+
								"s for studentNumber\n"+
								"m for major\n"+
								"g for GPA \n\n"+
								"Enter your selection: ");
			field= input.next();
			//allow user to change data field 
			System.out.println("What would you like to change it to?: ");
			String edit= input.next();
			if (field.equals("u"))
				x.setUsername(edit);
			else if (field.equals("p"))
				x.setPassword(edit);
			else if (field.equals("s"))
				x.setStudentNumber(edit);
			else if (field.equals("m"))
				x.setMajor(edit);
			else if (field.equals("g"))
				x.setGPA(edit);
	}
	
	public static void displayObj(){
		for (int i=0; i<StudentList.studentlist.size(); i++){
			//create variable to reference the object at index i
			Student x=StudentList.studentlist.get(i);
			//print the name of the course
			System.out.println(x.getName());
		}
	}
	
	public static int searchByUsername(String u){
		for(int i=0; i<StudentList.studentlist.size(); i++){
			//create temp Student object x to access x.username
			Student x= StudentList.studentlist.get(i);
			if(u.equals(x.getUsername()))
				return i;
		}
		return -1;
	}

	
	public static void Write(String words, String textfile){
		File file =new File(textfile);
		
		try{
			//true allows writer to append rather than overwrite
			FileWriter fileWriter= new FileWriter(file, true);
			
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			
			bufferedWriter.write(words + "\n");
		
			bufferedWriter.close();
		
		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
	
}
