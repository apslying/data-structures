import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class filereader {


	// obtained skeleton of file reader code from https://www.mkyong.com/java/how-to-read-file-from-java-bufferedreader-example/
	public static String str="";
	public static String[] arr;
	
	public static String[] readFile(String filename) {

		BufferedReader br = null;
		FileReader fr = null;

		try {
			
			fr = new FileReader(filename);
			br = new BufferedReader(fr);

			String current;

			br = new BufferedReader(new FileReader(filename));

			
			while ((current = br.readLine()) != null) {
				str+=current + " ";

			}
			
			//next line from http://stackoverflow.com/questions/2932392/java-how-to-replace-2-or-more-spaces-with-single-space-in-string-and-delete-lead
			str = str.trim().replaceAll(" +", " ");

			
			arr= str.split(" ");
			for(int i=0;i<arr.length;i++){
				
				arr[i]=arr[i].trim();
				//System.out.println(arr[i]);
				
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
		return arr;

	}
	
	
	public static String unEscapeString(String s){
	    StringBuilder sb = new StringBuilder();
	    for (int i=0; i<s.length(); i++)
	        switch (s.charAt(i)){
	            case '\n': sb.append("\\n"); break;
	            case '\t': sb.append("\\t"); break;
	            // ... rest of escape characters
	            default: sb.append(s.charAt(i));
	        }
	    return sb.toString();
	}
	


}