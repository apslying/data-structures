import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Program {
	public static LinkedList queue = new LinkedList();
	public static LinkedList queue2 = new LinkedList();
	public static int totalBreakTime=0;
	public static int maxBreak=0;
	public static int breakTime=0;
	public static int numberServed=0;
	public static int maxQueue=0;
	public static int inQueue=0;

	public static void main(String[] args) throws FileNotFoundException {

		createCustomers(args[0]);
		File cfile = new File(args[0]);
		Scanner myscan = new Scanner(cfile);
		int K=myscan.nextInt();
		myscan.close();
		Customer previous=null;
		Customer current=queue.peek();
		
		
		while(current!=null){

			if(numberServed==0){
				if(timeDiff(current.getArrivalTime(),"9:00:00")<0){
					//arrived before 9am
					current.setWaitTime(-timeDiff(current.getArrivalTime(),"9:00:00"));
					inQueue++;
					if(inQueue>maxQueue){
						maxQueue=inQueue;
					}
				}
				else{
					//arrived after 9am
					current.setWaitTime(0);
					inQueue=0;
					breakTime=timeDiff(current.getArrivalTime(),"9:00:00");
					if(breakTime>maxBreak){
						maxBreak=breakTime;
					}
					totalBreakTime += breakTime;
				}
				
			}
			
			else{
				//not first customer
				//arrived before previous customer finished
				if(timeDiff(current.getArrivalTime(),previous.getArrivalTime())-previous.getWaitTime()-K<0){
					//arrived before customer finished but after 5pm
					if(timeDiff("5:00:00",current.getArrivalTime())<0){
						break;
					}
					current.setWaitTime(previous.getWaitTime()+K-timeDiff(current.getArrivalTime(),previous.getArrivalTime()));
					inQueue++;
					if(inQueue>maxQueue){
						maxQueue=inQueue;
					}
					//previous customer finished after 5pm
					if(timeDiff("5:00:00",current.getArrivalTime())<current.getWaitTime()){
						break;
					}
				}
				//arrived after previous customer finished
				else{
					//arrived after 5pm
					if(timeDiff("5:00:00",current.getArrivalTime())<0){
						break;
					}
					current.setWaitTime(0);
					inQueue=0;
					breakTime=timeDiff(current.getArrivalTime(),previous.getArrivalTime())-previous.getWaitTime()-K;
					if(breakTime>maxBreak){
						maxBreak=breakTime;
					}
					totalBreakTime += breakTime;
				}
			}
			
			//remove customer from queue
			previous= current;
			queue2.add(previous);
			queue.poll();
			numberServed++;
			current=queue.peek();

		}
		
				
		//prepare to read queriesfile and output data 
		//create new file to output queries data
		File outfile=new File("output.txt");
		try {
			outfile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		try{
			String line;
			FileReader fr= new FileReader(args[1]);
			
			BufferedReader br= new BufferedReader(fr);
			
			while((line=br.readLine()) !=null){
				if(line.equals("LONGEST-BREAK-LENGTH")){
					LONGEST_BREAK_LENGTH(outfile);
				}
				else if (line.equals("TOTAL-IDLE-TIME")){
					TOTAL_IDLE_TIME(outfile);
				}
				else if (line.equals("NUMBER-OF-CUSTOMERS-SERVED")){
					NUMBER_OF_CUSTOMERS_SERVED(outfile);
				}
				else if (line.equals("MAXIMUM-NUMBER-OF-PEOPLE-IN-QUEUE-AT-ANY-TIME")){
					MAXIMUM_NUMBER_OF_PEOPLE_IN_QUEUE_AT_ANY_TIME(outfile);
				}
				else if(line.matches("WAITING-TIME-OF" + ".*")){
					int num= Integer.parseInt(line.substring("WAITING-TIME-OF".length()).trim());
					Node position=queue2.getFirst();
					while(position!=null && position.data.getID()!=num){
						position=position.next;
					}
					if (position==null){
					}
					else{
						WAITING_TIME_OF(position,outfile);
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
		
		System.out.println("Done.");
		System.out.println("Output in output.txt");

		
	}
	
	public static void WAITING_TIME_OF(Node place, File file){
		try{
			//true allows writer to append rather than overwrite
			FileWriter fileWriter= new FileWriter(file, true);
			
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			
			bufferedWriter.write("WAITING-TIME-OF " + place.data.getID() + ": " + place.data.getWaitTime() + "\n");
		
			bufferedWriter.close();
		
		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
	
	public static void MAXIMUM_NUMBER_OF_PEOPLE_IN_QUEUE_AT_ANY_TIME(File file){
		try{
			//true allows writer to append rather than overwrite
			FileWriter fileWriter= new FileWriter(file, true);
			
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			
			bufferedWriter.write("MAXIMUM-NUMBER-OF-PEOPLE-IN-QUEUE-AT-ANY-TIME: " + maxQueue + "\n");
		
			bufferedWriter.close();
		
		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
	
	public static void NUMBER_OF_CUSTOMERS_SERVED(File file){
		try{
			//true allows writer to append rather than overwrite
			FileWriter fileWriter= new FileWriter(file, true);
			
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			
			bufferedWriter.write("NUMBER-OF-CUSTOMERS-SERVED: " + numberServed + "\n");
		
			bufferedWriter.close();
		
		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
	}

	
	public static void TOTAL_IDLE_TIME(File file){
		try{
			//true allows writer to append rather than overwrite
			FileWriter fileWriter= new FileWriter(file, true);
			
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			
			bufferedWriter.write("TOTAL-IDLE-TIME: " + breakTime + "\n");
		
			bufferedWriter.close();
		
		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
	
	public static void LONGEST_BREAK_LENGTH(File file){
		try{
			//true allows writer to append rather than overwrite
			FileWriter fileWriter= new FileWriter(file, true);
			
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			
			bufferedWriter.write("LONGEST-BREAK-LENGTH: " + maxBreak + "\n");
		
			bufferedWriter.close();
		
		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
	
	public static void createCustomers(String file){
		String line=null;
		
		try{
			FileReader fr= new FileReader(file);
			BufferedReader br= new BufferedReader(fr);
			while((line=br.readLine()) !=null){
				if(line.matches("ID-NUMBER:" + ".*")){
					int id= Integer.parseInt(line.substring("ID-NUMBER:".length()).trim());
					line=br.readLine();
					String time= line.substring("ARRIVAL-TIME:".length()).trim();
					queue.add(new Customer(id,time));
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
	
	public static String queries(String filename, String query) {
		String line=null;
			
		try{
			FileReader fr= new FileReader(filename);
			
			
			BufferedReader br= new BufferedReader(fr);
			
			
			while((line=br.readLine()) !=null){
				if(line.matches(query + ".*")){
					br.close();
					return line.substring(query.length());
				}
			}
			br.close();
			return "not found";	

		}
		
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
		
		return null;

	}
	
	
	public static int timeDiff(String time1, String time2){
		String[] A= time1.split(":"); 
		String[] B= time2.split(":"); 
		
		int[] A1= new int[3];
		for(int i=0;i<=2;i++){
			//System.out.println(A1[i]);
			A1[i]= Integer.parseInt(A[i]);
		}
		
		if (A1[0]==1){
			A1[0]=13;
		}
		else if (A1[0]==2){
			A1[0]=14;
		}
		else if (A1[0]==3){
			A1[0]=15;
		}
		else if (A1[0]==4){
			A1[0]=16;
		}
		else if (A1[0]==5){
			A1[0]=17;
		}
		
		int[] B1= new int[3];
		for(int i=0;i<=2;i++){
			B1[i]= Integer.parseInt(B[i]);
		}
		
		if (B1[0]==1){
			B1[0]=13;
		}
		else if (B1[0]==2){
			B1[0]=14;
		}
		else if (B1[0]==3){
			B1[0]=15;
		}
		else if (B1[0]==4){
			B1[0]=16;
		}
		else if (B1[0]==5){
			B1[0]=17;
		}
		
		int hdiff= A1[0]-B1[0];
		int mdiff= A1[1]-B1[1];
		int sdiff= A1[2]-B1[2];
		
		return 3600*hdiff+60*mdiff+sdiff;




	}

}
