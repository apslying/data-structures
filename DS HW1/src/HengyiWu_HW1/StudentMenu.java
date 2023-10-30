import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentMenu {
	private static Scanner input = new Scanner(System.in);
	private static int studentindex;

	public static int getStudentindex() {
		return studentindex;
	}

	public static void setStudentindex(int studentindex) {
		StudentMenu.studentindex = studentindex;
	}

	public static void displayMenu(){
		int choice;
		do{
			System.out.println("1. View all courses\n" +
								"2. View all courses I am registed in\n" +
								"3. Change password\n" +
								"4. Change username\n" +
								"5. Logout\n\n" +
								"Enter your selection (1-5): ");
			choice= input.nextInt();
			Student me= StudentList.studentlist.get(studentindex);
		
			if (choice==1){
				CourseList.displayObj();
			}
			else if (choice==2){
				me.printCourses();
			}
			else if (choice==3){
				String user= me.getUsername();
				String oldpass= me.getPassword();
				ArrayList<String> temp= ReadPart("students.txt", "\\s+", user + " " + oldpass);
				Flush("students.txt");
				for(int i=0; i<temp.size(); i +=2){
					Write(temp.get(i) + " " + temp.get(i+1), "students.txt");
				}
				//file has been rewritten with this username and password removed
				
				System.out.println("Enter new password: ");
				String newpass=input.next();
				Write(user + " " + newpass, "students.txt");
				me.setPassword(newpass);
				}
			
			else if (choice==4){
				String olduser= me.getUsername();
				String pass= me.getPassword();
				ArrayList<String> temp= ReadPart("students.txt", "\\s+", olduser + " " + pass);
				Flush("students.txt");
				for(int i=0; i<temp.size(); i +=2){
					Write(temp.get(i) + " " + temp.get(i+1), "students.txt");
				}
				//file has been rewritten with this username and password removed
				
				System.out.println("Enter new username: ");
				String newuser=input.next();
				Write(newuser + " " + pass, "students.txt");
				me.setUsername(newuser);
			}
			else if (choice==5){
				Login.main(null);
			}
			
		}while(choice !=5);
						
	}
	
	public static ArrayList<String> Read(String textfile, String separator){
		String fileName= textfile;
		String line=null;
		String[] temp; 
		ArrayList<String> array = new ArrayList<String>();
			
		try{
			FileReader fR= new FileReader(fileName);
			
			BufferedReader bR= new BufferedReader(fR);
			
			while((line=bR.readLine()) !=null){
				temp= (line.split(separator));
				array.add(temp[0]);
				array.add(temp[1]);

			}
			
			bR.close();
			return array;
		
		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
			return array;
		}
		
		catch(IOException ex){
			ex.printStackTrace();
			return array;
		}

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
	
	public static ArrayList<String> ReadPart(String textfile, String separator, String delete){
		String fileName= textfile;
		String line=null;
		String[] temp; 
		ArrayList<String> array = new ArrayList<String>();
			
		try{
			FileReader fR= new FileReader(fileName);
			
			BufferedReader bR= new BufferedReader(fR);
			
			while((line=bR.readLine()) !=null && (line=bR.readLine()) !=delete ){
				temp= (line.split(separator));
				array.add(temp[0]);
				array.add(temp[1]);

			}
			
			bR.close();
			return array;
		
		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
			return array;
		}
		
		catch(IOException ex){
			ex.printStackTrace();
			return array;
		}

	}
	
	//clears file
	public static void Flush(String textfile){
		File file =new File(textfile);
		
		try{
			FileWriter fileWriter= new FileWriter(file);
			
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			
			bufferedWriter.flush();
		
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
