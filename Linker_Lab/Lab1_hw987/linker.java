import java.util.HashMap;
import java.util.Scanner;

public class linker {
	
	public static HashMap<String, Integer> hash= new HashMap<String, Integer>();
	public static HashMap<String, Integer> hashCopy= new HashMap<String, Integer>();
	public static int curr=1;//correct
	public static int globalBase=0; //changes in addresses method
	public static int flag=-1;//correct

	
	public static void main(String[] args){
		
		System.out.println("Enter the filename (ex: input-1.txt): ");
		Scanner scanner = new Scanner(System.in);
		String file = scanner.nextLine();
		scanner.close();
		
		String[] arr= filereader.readFile(file);
		
		int modules=Integer.parseInt(arr[0]);
		
		for (int index=0; index<modules; index++){
			int max= definitions1(arr, curr);
			int start= uses1(arr, curr); //expected curr=4
			addresses1(arr, curr, globalBase, max, start);
		}
		
		System.out.println("Symbol Table:\n" +hash+ "\n");

		
		
		curr=1;
		globalBase=0; //changes in addresses method
		System.out.println("Memory Map:");
		for (int index=0; index<modules; index++){
			definitions(arr, curr);
			String[] use= uses(arr, curr); //expected curr=4
			addresses(arr, use, curr, globalBase);
		}
		
		if(hashCopy.isEmpty()==false){
			System.out.println("\nWARNING! The following symbol(s) is/are defined but not used:");
			System.out.println(hashCopy.keySet());
		}
	}
	
	public static void definitions(String[] arr, int i){
		int num=Integer.parseInt(arr[i]);
		for (int index=0; index<num; index++){
			i+=2;
		}
		curr=i+1;
	}
	
	public static String[] uses(String[] arr, int i){
		int num=Integer.parseInt(arr[i]);
		String[] use= new String[20];
		for (int index=0; index<num; index++){
			i+=2;
			String fun= arr[i-1];
			
			while(Integer.parseInt(arr[i])!=-1){
				if(use[Integer.parseInt(arr[i])]==null){
					use[Integer.parseInt(arr[i])]=fun;

				}
				else{
					flag=Integer.parseInt(arr[i]);
				}
				
				i++;
			}
		}
		curr=i+1;
		return use;
	}
	
	public static void addresses(String[] arr, String[] use, int i, int base){
		int num=Integer.parseInt(arr[i]);

	
		for(int p=num;p<use.length;p++){
			if (use[p]!=null){
				System.out.println("Error: Use of "+ use[p] +" exceeds module size; use ignored.");
			}
		}

		globalBase+=num;

		for (int index=0; index<num; index++){
			if(arr[i+1].contains("A")){
				if(Integer.parseInt(arr[i+2])-(1000*(Integer.parseInt(arr[i+2])/1000))<200){
					System.out.println(Integer.parseInt(arr[i+2]));
				}
				else{
					System.out.println((1000*(Integer.parseInt(arr[i+2])/1000)) + " Error: Absolute address exceeds machine size; zero used.");
				}
				
			}
			else if(arr[i+1].contains("I")){
				System.out.println(Integer.parseInt(arr[i+2]));
			}
			else if(arr[i+1].contains("R")){
				if(Integer.parseInt(arr[i+2])-(1000*(Integer.parseInt(arr[i+2])/1000))<num){
					System.out.println(Integer.parseInt(arr[i+2])+base);
				}
				else{
					System.out.println((1000*(Integer.parseInt(arr[i+2])/1000)) + " Error: Relative address exceeds module size; zero used.");

				}
			}
			else if(arr[i+1].contains("E")){
				if(hash.get(use[index])==null){
					System.out.println(use[index] + " is used but not defined.");
					System.out.println(use[index] + " will be given the value 0");
					hash.put(use[index], 0);
				}
				
				if(hashCopy.get(use[index])!=null){
					hashCopy.remove(use[index]);

				}
				
				if(index==flag){
					System.out.println(1000*(Integer.parseInt(arr[i+2])/1000)+hash.get(use[index])+" Error: Multiple variables used in instruction; all but first ignored.");
					flag=-1;
				}
				else{
					System.out.println(1000*(Integer.parseInt(arr[i+2])/1000)+hash.get(use[index]));
				}
			}
			
			i+=2;
		}
		curr=i+1;
	}
	
	
	
	
	
	
	
	
	
	
	public static int definitions1(String[] arr, int i){
		int num=Integer.parseInt(arr[i]);
		int max=-1;
		for (int index=0; index<num; index++){
			if(hash.get(arr[i+1])==null){
				hash.put(arr[i+1], Integer.parseInt(arr[i+2])+globalBase);
				hashCopy.put(arr[i+1], Integer.parseInt(arr[i+2])+globalBase);
				if(index==num-1){
					max= hash.get(arr[i+1]);
				}
			}
			else{
				System.out.println("Error: " + arr[i+1] + " is multiply defined; first value used.\n");
			}
			

			i+=2;
		}
		curr=i+1;
		return max;
	}
	
	public static int uses1(String[] arr, int i){
		int start=i;
		int num=Integer.parseInt(arr[i]);
		for (int index=0; index<num; index++){
			i+=2;
			while(Integer.parseInt(arr[i])!=-1){
				i++;
			}
		}
		curr=i+1;
		return start;
	}
	
	public static void addresses1(String[] arr, int i, int base, int max, int start){
		int num=Integer.parseInt(arr[i]);
		
		if(max-globalBase>=num){
			
			hash.remove(arr[start-2]);
			hash.put(arr[start-2], globalBase);
			System.out.println("ERROR: Definition of " + arr[start-2] +" exceeds module size; first word in module used.\n");
		}
		
	
		globalBase+=num;

		for (int index=0; index<num; index++){
			
			i+=2;
		}
		curr=i+1;
	}
	
	
}
