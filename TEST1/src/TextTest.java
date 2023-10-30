import java.io.*;
public class TextTest {

	public static void main(String[] args) {
		String fileName= "temp.txt";
		
		String line=null;
	
			
		try{
			FileReader fR= new FileReader(fileName);
			
			BufferedReader bR= new BufferedReader(fR);
			
			while((line=bR.readLine()) !=null){
				String[] array = line.split("\\s");
				for (int x=0; x<array.length; x++)
			         System.out.println(array[x]);
			}
			
			bR.close();
		
		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
	}

}
