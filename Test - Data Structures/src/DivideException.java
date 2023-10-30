
public class DivideException {
	
	public static int divide(int a, int b){
		try{
			return a/b;
		
		}
		catch(ArithmeticException e){
			System.out.println("oops" + e);
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(divide(10,0));

	}

}
