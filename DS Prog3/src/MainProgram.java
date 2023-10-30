import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class MainProgram {
	private static Person[] array;
	private static int[][] A;
	private static int n;
	
	public static void main(String[] args) {
		n=numberOfNodes(args[0]);
		array = new Person[n];
		A= new int[n][n];
		for(int i=0; i<=n-1;i++){
			for(int j=0; j<=n-1; j++){
				A[i][j]=0;
			}
		}
		
		createArray(args[0]);
		createGraph(args[0]);
		
		//finished creating array and graph
		
		//create output file
		File outfile=new File("output.txt");
		try {
			outfile.createNewFile();
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}

		try{
			String line;
			FileReader fr= new FileReader(args[1]);
			
			BufferedReader br= new BufferedReader(fr);
			
			while((line=br.readLine()) !=null){
				if(line.matches("NAME-OF" + ".*")){
					int ssn= Integer.parseInt(line.substring("NAME-OF".length()).trim());
					NAME_OF(outfile, findIndex(ssn));	
				}
				else if(line.matches("FATHER-OF" + ".*")){
					int ssn= Integer.parseInt(line.substring("FATHER-OF".length()).trim());
					FATHER_OF(outfile, findIndex(ssn));
				}
				else if(line.matches("MOTHER-OF" + ".*")){
					int ssn= Integer.parseInt(line.substring("MOTHER-OF".length()).trim());
					MOTHER_OF(outfile, findIndex(ssn));
				}
				else if(line.matches("CHILDREN-OF" + ".*")){
					int ssn= Integer.parseInt(line.substring("CHILDREN-OF".length()).trim());
					CHILDREN_OF(outfile, findIndex(ssn));
				}
				else if(line.matches("HALF-SIBLINGS-OF" + ".*")){
					int ssn= Integer.parseInt(line.substring("HALF-SIBLINGS-OF".length()).trim());
					HALF_SIBLINGS_OF(outfile, findIndex(ssn));
				}
				else if(line.matches("FULL-SIBLINGS-OF" + ".*")){
					int ssn= Integer.parseInt(line.substring("FULL-SIBLINGS-OF".length()).trim());
					FULL_SIBLINGS_OF(outfile, findIndex(ssn));
				}
				else if(line.matches("MUTUAL-FRIENDS-OF" + ".*")){
					int ssn= Integer.parseInt(line.substring("MUTUAL-FRIENDS-OF".length()).trim());
					MUTUAL_FRIENDS_OF(outfile, findIndex(ssn));
				}
				else if(line.matches("INVERSE-FRIENDS-OF" + ".*")){
					int ssn= Integer.parseInt(line.substring("INVERSE-FRIENDS-OF".length()).trim());
					INVERSE_FRIENDS_OF(outfile, findIndex(ssn));
				}
				else if(line.matches("WHO-HAS-MOST-MUTUAL-FRIENDS" + ".*")){
					int a=WHO_HAS_MOST_MUTUAL_FRIENDS(outfile);
					writeName(outfile,a);
				}
				
			}
			
			br.close();
		
		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
		
	}
		
	public static int numberOfNodes(String file){
		String line;
		int count=0;
		try{
			FileReader fr= new FileReader(file);
			BufferedReader br= new BufferedReader(fr);
			
			while((line=br.readLine()) !=null){
				if(line.matches("FIRST" + ".*")){
					count++;
				}
			}
			br.close();
			return count;
		}

		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
		return -1;
	}
	
	public static void createArray(String file){
		String line=null;
		try{
			FileReader fr= new FileReader(file);
			BufferedReader br= new BufferedReader(fr);
			int i=0;
			while((line=br.readLine()) !=null){
				if(line.matches("FIRST" + ".*")){
					String first= line.substring("FIRST NAME:".length()).trim();
					line=br.readLine();
					String last= line.substring("LAST NAME:".length()).trim();
					line=br.readLine();
					int ssn= Integer.parseInt(line.substring("SSN:".length()).trim());
					array[i]=new Person(first, last, ssn);
					i++;
				}
			}
			br.close();

		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
		

	}
	
	public static void createGraph(String file){
		String line=null;
		try{
			FileReader fr= new FileReader(file);
			BufferedReader br= new BufferedReader(fr);
			while((line=br.readLine()) !=null){
				if(line.matches("SSN:" + ".*")){
					int ssn= Integer.parseInt(line.substring("SSN:".length()).trim());
					int i=findIndex(ssn);
					line=br.readLine();
					ssn= Integer.parseInt(line.substring("FATHER:".length()).trim());
					int j=findIndex(ssn);
					if(j<=n-1 && j!=-1){
						A[i][j]=9;
					}
					line=br.readLine();
					ssn= Integer.parseInt(line.substring("MOTHER:".length()).trim());
					j=findIndex(ssn);
					if(j<=n-1 && j!=-1){
						A[i][j]=8;
					}
					line=br.readLine();
					String f= line.substring("FRIENDS:".length());
					String[] friends= f.split(",");
					for(int k=0; k<=friends.length-1; k++){
						ssn=Integer.parseInt(friends[k].trim());
						j=findIndex(ssn);
						if(j<=n-1 && j!=-1){
							A[i][j]=1;
						}
					}
				}
			}
			br.close();

		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
		

	}
	
	public static int findIndex(int ssn){
		for(int i=0;i<=array.length-1;i++){
			if(array[i].getSSN()==ssn){
				return i;
			}
		}
		return -1;
	}
	
	public static String getFullName(int ssn){
		for(int i=0;i<=array.length-1;i++){
			if(array[i].getSSN()==ssn){
				return array[i].getFname() + " " + array[i].getLname();
			}
		}
		return null;
	}
	
	public static void NAME_OF(File file, int index){
		try{
			FileWriter fileWriter= new FileWriter(file, true);
			
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			
			bufferedWriter.write("NAME-OF " + array[index].getSSN() + ": " + array[index].getFname() + " " + array[index].getLname() + "\n");
		
			bufferedWriter.close();
		
		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
	
	public static void FATHER_OF(File file, int index){
		int fatherindex=-1;
		for(int j=0;j<=n-1;j++){
			if(A[index][j]==9){
				fatherindex=j;
				break;
			}
		}
		
		String fathername;
		if(fatherindex==-1){
			fathername="Has no father.";
		}
		else{
			fathername= getFullName(array[fatherindex].getSSN());
		}
		
		
		
		try{
			FileWriter fileWriter= new FileWriter(file, true);
			
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			
			bufferedWriter.write("FATHER-OF " + array[index].getSSN() + ": " + fathername + "\n");
		
			bufferedWriter.close();
		
		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
	
	public static void MOTHER_OF(File file, int index){
		int motherindex=-1;
		for(int j=0;j<=n-1;j++){
			if(A[index][j]==8){
				motherindex=j;
				break;
			}
		}
		
		String mothername;
		if(motherindex==-1){
			mothername="Has no mother.";
		}
		else{
			mothername= getFullName(array[motherindex].getSSN());
		}		
		
		
		try{
			FileWriter fileWriter= new FileWriter(file, true);
			
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			
			bufferedWriter.write("MOTHER-OF " + array[index].getSSN() + ": " + mothername + "\n");
		
			bufferedWriter.close();
		
		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
	
	public static void HALF_SIBLINGS_OF(File file, int index){
		try{
			FileWriter fileWriter= new FileWriter(file, true);
			
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			
			bufferedWriter.write("HALF-SIBLINGS-OF " + array[index].getSSN() + ": ");
		
			bufferedWriter.close();
		
		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
		
		int fatherindex=-1;
		for(int j=0;j<=n-1;j++){
			if(A[index][j]==9){
				fatherindex=j;
				break;
			}
		}
		
		int motherindex=-1;
		for(int j=0;j<=n-1;j++){
			if(A[index][j]==8){
				motherindex=j;
				break;
			}
		}
		
		if (fatherindex==-1 && motherindex==-1){//has no parents

		}
		
		else{ 
			for(int i=0; i<=n-1; i++){
				if(i==index){
					//don't compare with self
				}
				else{
					if(A[i][fatherindex]==9 && A[i][motherindex]==8){
						//full siblings
					}
					else if(A[i][fatherindex]==9 || A[i][motherindex]==8){
						String sibling= getFullName(array[i].getSSN());
						try{
							FileWriter fileWriter= new FileWriter(file, true);
							
							BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
							
							bufferedWriter.write(sibling + ", ");
						
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
			}
		}
		try{
			FileWriter fileWriter= new FileWriter(file, true);
			
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			
			bufferedWriter.write("\n");
		
			bufferedWriter.close();
		
		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
	
	}
		
	public static void FULL_SIBLINGS_OF(File file, int index){
		try{
			FileWriter fileWriter= new FileWriter(file, true);
			
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			
			bufferedWriter.write("FULL-SIBLINGS-OF " + array[index].getSSN() + ": ");
		
			bufferedWriter.close();
		
		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
		
		int fatherindex=-1;
		for(int j=0;j<=n-1;j++){
			if(A[index][j]==9){
				fatherindex=j;
				break;
			}
		}
		
		int motherindex=-1;
		for(int j=0;j<=n-1;j++){
			if(A[index][j]==8){
				motherindex=j;
				break;
			}
		}
		
		if (fatherindex==-1 || motherindex==-1){

		}
		
		else{ //has both father and mother 

			for(int i=0;i<=n-1;i++){
				if(i==index){	
				}
				else{
					if(A[i][fatherindex]==9 && A[i][motherindex]==8){
						String sibling= getFullName(array[i].getSSN());
						try{
							FileWriter fileWriter= new FileWriter(file, true);
							
							BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
							
							bufferedWriter.write(sibling + ", ");
						
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
			}
		}
		try{
			FileWriter fileWriter= new FileWriter(file, true);
			
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			
			bufferedWriter.write("\n");
		
			bufferedWriter.close();
		
		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
	
	}
	
	public static void CHILDREN_OF(File file, int index){

		try{
			FileWriter fileWriter= new FileWriter(file, true);
			
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			
			bufferedWriter.write("CHILDREN-OF " + array[index].getSSN() + ": ");
		
			bufferedWriter.close();
		
		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
		
		for(int i=0; i<=n-1; i++){
			if(A[i][index]==8 || A[i][index]==9){
				String child= getFullName(array[i].getSSN());
				try{
					FileWriter fileWriter= new FileWriter(file, true);
					
					BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
					
					bufferedWriter.write(child + ", ");
				
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
		
		try{
			FileWriter fileWriter= new FileWriter(file, true);
			
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			
			bufferedWriter.write("\n");
		
			bufferedWriter.close();
		
		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
	
	public static void MUTUAL_FRIENDS_OF(File file, int index){

		try{
			FileWriter fileWriter= new FileWriter(file, true);
			
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			
			bufferedWriter.write("MUTUAL-FRIENDS-OF " + array[index].getSSN() + ": ");
		
			bufferedWriter.close();
		
		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
		
		for(int j=0; j<=n-1; j++){
			if(A[index][j]==1){
				if(A[j][index]==1){
					String friend= getFullName(array[j].getSSN());
					try{
						FileWriter fileWriter= new FileWriter(file, true);
						
						BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
						
						bufferedWriter.write(friend + ", ");
					
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
		}
		
		try{
			FileWriter fileWriter= new FileWriter(file, true);
			
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			
			bufferedWriter.write("\n");
		
			bufferedWriter.close();
		
		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
	
	public static void INVERSE_FRIENDS_OF(File file, int index){

		try{
			FileWriter fileWriter= new FileWriter(file, true);
			
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			
			bufferedWriter.write("INVERSE-FRIENDS-OF " + array[index].getSSN() + ": ");
		
			bufferedWriter.close();
		
		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
		
		for(int i=0; i<=n-1; i++){
			if(A[i][index]==1){
				String friend= getFullName(array[i].getSSN());
				try{
					FileWriter fileWriter= new FileWriter(file, true);
					
					BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
					
					bufferedWriter.write(friend + ", ");
				
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
		
		try{
			FileWriter fileWriter= new FileWriter(file, true);
			
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			
			bufferedWriter.write("\n");
		
			bufferedWriter.close();
		
		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
	
	public static int WHO_HAS_MOST_MUTUAL_FRIENDS(File file){
		try{
			FileWriter fileWriter= new FileWriter(file, true);
			
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			
			bufferedWriter.write("WHO-HAS-MOST-MUTUAL-FRIENDS" + ": ");
		
			bufferedWriter.close();
		
		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
		int mostindex=0;
		int max=0;
		for(int i=0; i<=n-1; i++){
			int count=0;
			for(int j=0; j<=n-1; j++){
				if(A[i][j]==1){
					if(A[j][i]==1){
						count++;
					}
				}
			}
			if(count>max){
				mostindex=i;
				max=count;
			}
		}
		return mostindex;
	}
	
	public static void writeName(File file, int index){
		try{
			FileWriter fileWriter= new FileWriter(file, true);
			
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			
			bufferedWriter.write(getFullName(array[index].getSSN()) + "\n");
		
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
