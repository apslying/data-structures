public class numtobin {

	public static void main(String[] args) {
		int a=85479; //enter num
		
		int x =power(a);
		
		

	}
	
	public static int power(int n){

		int b=0;
		while(n/Math.pow(2, b)>=2){
			b++;
		}
		return b;

}
