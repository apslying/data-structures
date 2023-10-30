import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String u;
		String p;
		System.out.println("Are you an admin, student or professor?\n" +
							"1. Admin\n" +
							"2. Student\n" +
							"3. Professor\n\n" +
							"Enter your selection (1-3): ");
		int choice= input.nextInt();
		if (choice==1){
			//next vs nextLine
			System.out.println("Enter username: ");
			u= input.next();
			System.out.println("Enter password: ");
			p= input.next();
			
			ArrayList<String> array = Read("admin.txt", ",");

			
			if (u.equals(array.get(0)) && p.equals(array.get(1))){
				System.out.println("Welcome Admin!");
				AdminMenu.displayMenu();
			}
			else{
				System.out.println("Access Denied.");

			}
		}
		
		else if (choice==2){
			System.out.println("Enter username: ");
			u= input.next();
			System.out.println("Enter password: ");
			p= input.next();
			
			ArrayList<String> array = Read("students.txt", "\\s+");
			
			for (int i=0; i<(array.size()); i++){

				if(i==(array.size())-1){
					System.out.println("Access Denied");
					break;
				}
				
				else if (u.equals(array.get(i)) && p.equals(array.get(i+1))){
					System.out.println("Welcome Student!");
					int index= StudentList.searchByUsername(u);
					StudentMenu.setStudentindex(index);
					StudentMenu.displayMenu();
					break;
				}
			}
		}
		
		else if (choice==3){
			System.out.println("Enter username: ");
			u= input.next();
			System.out.println("Enter password: ");
			p= input.next();
			
			ArrayList<String> array = Read("professors.txt", "\\s+");
			
			for (int i=0; i<(array.size()); i++){

				if(i==(array.size())-1){
					System.out.println("Access Denied");
					break;
				}
				
				else if (u.equals(array.get(i)) && p.equals(array.get(i+1))){
					System.out.println("Welcome Professor!");
					int index= ProfessorList.searchByUsername(u);
					ProfessorMenu.setProfindex(index);
					ProfessorMenu.displayMenu();
					break;
				}
			}
			
		}
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
