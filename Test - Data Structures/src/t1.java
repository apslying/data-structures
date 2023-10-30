public class t1{
	public static void main(String[] args) {
		int[] A= new int[10];
		A[0]=0;
		for(int i=1;i<=9;i++){
			A[i]=(int) (Math.pow(i, 4) + A[i-1]);
		}
		
		for(int i=0;i<=9;i++){
			System.out.print(A[i] + " ");
		}
		

		System.out.println("");
		
		for(int j=0; j<9; j++){
		
			for(int i=0;i<=9;i++){
				try{
					A[i]=A[i+1]-A[i];
	
				}
				catch(ArrayIndexOutOfBoundsException e){
					A[i]=0;
				}
			}
			
			for(int i=0;i<=9;i++){
				System.out.print(A[i] + " ");
			}
			
			System.out.println("");

		}
	}
}
