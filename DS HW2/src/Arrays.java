
public class Arrays {
	
	public static int isReversed(String a, String b){
		String newA= a.replaceAll("\\s+","").toLowerCase();
		String newB= b.replaceAll("\\s+","").toLowerCase();
		int size= newA.length();
		if(newA.length() != newB.length()){
			return 0;
		}
		else{
			for(int i=0; i<=size-1; i++){
				if(newA.charAt(i) != newB.charAt((size-1)-i)){
					return 0;
				}
			}
			return 1;
		}
	}
	
	public static void smallestofThreeConsecutive(String sentence){
		String[] words= sentence.split("\\s+");
		for(int i=0; i<=words.length-3; i+=3){
			String smallest= words[i];
			for(int j=i+1; j<=i+2;j++){
				if(words[j].length()<words[i].length()){
					smallest=words[j];
				}
			}
			System.out.println(smallest);	
		}
		
	}

	public static void main(String[] args) {
		
		String a="google";
		String b="eL gO   oG    ";
		System.out.println("reversed?: "+isReversed(a,b));
		
		smallestofThreeConsecutive("Other entries include a historic district " + 
				"in Charlottesville Virginia cut-flower greenhouse complex");
		
		
	}

}
