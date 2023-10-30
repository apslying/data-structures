import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class AdminMenu {
	private static Scanner input = new Scanner(System.in);
	
	public static void displayMenu(){
		int affairs;
		do{
			System.out.println("1. Course Affairs\n" +
								"2. Student Affairs\n" +
								"3. Professor Affairs\n" +
								"4. Back to login\n\n" +
								"Enter your selection (1-4): ");
			affairs= input.nextInt();
			
			if (affairs==1){
				int choice;
				do{
					System.out.println("Course Affairs\n" +
							"1. Add a course\n" +
							"2. Remove a course\n" +
							"3. Display All Courses\n" +
							"4. Display All Courses that are currently full\n" +
							"5. Back to Main Menu\n\n" +
							"Enter your selection (1-5): ");
					choice= input.nextInt();
					if (choice==1){
						CourseList.addObj();
					}
					else if (choice==2){
						CourseList.deleteObj();
					}
					else if (choice==3){
						CourseList.displayObj();
					}
					else if (choice==4){
						CourseList.displayFullCourses();
					}
					else if (choice==5){
					}
				} while(choice != 5);
			}
			else if (affairs==2){
				int choice;
				do{
					System.out.println("Student Affairs\n" +
							"1. Add a student\n" +
							"2. Remove a student\n" +
							"3. Edit Student\n" +
							"4. Display Course list\n" +
							"5. Display Student list\n" +
							"6. Register a Course(s) for a student\n"+
							"7. Display Courses(s) taken by a student\n" +
							"8. Back to Main Menu\n\n" +
							"Enter your selection (1-8): ");
					choice= input.nextInt();
					//username for options 7,8
					String username;
					if (choice==1){
						StudentList.addObj();
					}
					if (choice==2){
						StudentList.deleteObj();
					}
					if (choice==3){
						StudentList.editStudent();
					}
					if (choice==4){
						CourseList.displayObj();
					}
					if (choice==5){
						StudentList.displayObj();
					}
					if (choice==6){
						System.out.println("Enter username of the student: ");
						username= input.next();
						int indexofstudent= StudentList.searchByUsername(username);
						//x is the object that courses will be accessed from
						Student x= StudentList.studentlist.get(indexofstudent);
						System.out.println("Enter course: ");
						String course= input.next();
						x.addCourses(course);

					}
					if (choice==7){
						System.out.println("Enter username of the student: ");
						username= input.next();
						int indexofstudent= StudentList.searchByUsername(username);
						//x is the object that courses will be accessed from
						Student x= StudentList.studentlist.get(indexofstudent);
						x.printCourses();
					}
					if (choice==8){
					}
				} while(choice != 8);
			}
			else if (affairs==3){
				int choice;
				do{
					System.out.println("Professor Affairs\n" +
							"1. Add a Professor\n" +
							"2. Remove a Professor\n" +
							"3. Display All Professors\n" +
							"4. Back to Main Menu\n\n" +
							"Enter your selection (1-4): ");
					choice= input.nextInt();
					if (choice==1){
						ProfessorList.addObj();
					}
					else if (choice==2){
						ProfessorList.deleteObj();					}
					else if (choice==3){
						ProfessorList.displayObj();					}
					else if (choice==4){
					}
				} while(choice != 4);
			}
			else if(affairs==4){
				Login.main(null);
			}
		} while(affairs != 4);
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
	


}

