import java.io.*;

public class TextWrite {

	public static void main(String[] args) {
		String fileName= "temp.txt";
	
		try{
			FileWriter fileWriter= new FileWriter(fileName);
			
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
