package test;

public class T1 {
	public static int max(int a, int b, int c){
		if ((a>=b) && (a>=c)){
			return a;
		}
		if ((b>=a) && (b>=c)){
			return b;
		}
		if ((c>=b) && (c>=a)){
			return c;
		}
	}
	public static void main (String[] args){
		System.out.println(max(3,3,3));
		

		
	}
	
	

}
