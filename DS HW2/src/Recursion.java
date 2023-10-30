public class Recursion {
	
	public static int max(int[] array, int start, int end){
		if(start==end){
			return array[start];
		}
		else{
			int left= max(array, start, (start+end)/2);
			int right=max(array, ((start+end)/2)+1, end);
			if(left>=right){
				return left;
			}
			else{
				return right;
			}
		}
	}
	
	public static int numberofZeros(int n){
		String nstring=Integer.toBinaryString(n);
		int count=0;
		for(int i=0; i<=nstring.length()-1; i++){
			if(nstring.charAt(i)=='0'){
				count++;
			}
		}
		return count;
	}
	
	public static int zerosBinary(int n){
		if(n==0){
			return 1;
		}
		
		if(n==1){
			return 0;
		}
		
		else if(n%2==0){
			return zerosBinary(n/2)+1;
		}
		else{
			return zerosBinary(n/2);
		}
	}
	
	
	public static int isPalindromeRecursive(String a){
		String phrase= a.replaceAll("\\s+", "");
		int size= phrase.length();
		
		if(size==2){
			if (phrase.charAt(0)==phrase.charAt(1)){
				return 1;
			}
			else{
				return 0;
			}
		}
			
		else if ((size==1) || (size==0)){
			return 1;
		}
		
		
		else if (phrase.charAt(0)!=phrase.charAt(size-1)){
			return 0;
		}
		
		else if (phrase.charAt(0)==phrase.charAt(size-1)){
			return isPalindromeRecursive(phrase.substring(1, size-1));
		}
		else{
			return -99;
		}
	}
	
	public static int isPalindromeIterative(String a){
		String phrase= a.replaceAll("\\s+", "");
		int size= phrase.length();
		
		if(size==1){
			return 1;
		}
		
		else if((size)%2==0){
			//even
			for(int i=0; i<=(size-1)/2; i++){
				if(phrase.charAt(i) != phrase.charAt((size-1)-i)){
					return 0;
				}
			}
			return 1;
		}
		
		else if((size)%2==1){
			//odd
			for(int i=0; i<=(size-1)/2; i++){
				if(phrase.charAt(i) != phrase.charAt((size-1)-i)){
					return 0;
				}
			}
			return 1;
		}
		
		else{
			return -99;
		}
	}

	public static void main(String[] args) {
		int[] array= {4,77,98,30,20,50,77,22,49,2};
		System.out.println("max: "+max(array,0,array.length-1));
		
		System.out.println("zerosBinary: "+ zerosBinary(100));
		System.out.println("numberofZeros: "+numberofZeros(100));
		
		
		long startTime1 = System.nanoTime();
		System.out.println("Is racecar a palindrome?(recursive): " +isPalindromeRecursive("racecar"));
		long endTime1   = System.nanoTime();
		long totalTime1 = endTime1 - startTime1;
		System.out.println("Recursive: " + totalTime1 + " nanoseconds");
		
		long startTime2 = System.nanoTime();
		System.out.println("Is racecar a palindrome?(iterative): " +isPalindromeIterative("racecar"));
		long endTime2   = System.nanoTime();
		long totalTime2 = endTime2 - startTime2;
		System.out.println("Iterative: " +totalTime2 + " nanoseconds");

	}

}
