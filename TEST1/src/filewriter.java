import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class filewriter {
	
	public static void main(String[] args) {
		File myfile =new File("output.txt");
		
		try{
			//true allows writer to append rather than overwrite
			FileWriter fileWriter= new FileWriter(myfile, true);
			
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			
			bufferedWriter.write("\nhi");
		
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
