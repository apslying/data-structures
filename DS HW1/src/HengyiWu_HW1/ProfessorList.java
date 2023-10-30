import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProfessorList {
	public static ArrayList<Professor> professorlist = new ArrayList<Professor>();
	private static Scanner input = new Scanner(System.in);
	
	public static void addObj(){
		String a,b,c,d,e,f,g,h;
		System.out.println("Enter username: ");
		a=input.next();
		System.out.println("Enter password: ");
		b=input.next();
		Write(a + " " + b, "professors.txt");
		System.out.println("Enter ID: ");
		c=input.next();
		System.out.println("Enter SSN: ");
		d=input.next();
		System.out.println("Enter name: ");
		e=input.next();
		System.out.println("Enter address: ");
		f=input.next();
		System.out.println("Enter office: ");
		g=input.next();
		System.out.println("Enter phone: ");
		h=input.next();
		//add an object of type Professor to the ArrayList
		professorlist.add(new Professor(a,b,c,d,e,f,g,h));
	}
	
	public static void deleteObj(){
		System.out.println("Enter the index of the professor you want to delete: ");
		int i = input.nextInt();
		//use remove method
		professorlist.remove(i);
	}
	
	public static void displayObj(){
		for (int i=0; i<professorlist.size(); i++){
			//create variable to reference the object at index i
			Professor x=professorlist.get(i);
			//print the name of the professor
			System.out.println(x.getName());
		}
	}
	
	public static int searchByUsername(String u){
		for(int i=0; i<ProfessorList.professorlist.size(); i++){
			//create temp Student object x to access x.username
			Professor x= ProfessorList.professorlist.get(i);
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
