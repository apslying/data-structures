
public class RunningAverage {

	public static int[] runAvg(int[] A){
		int[] B = new int[A.length];
		for(int i=0;i<=B.length-1;i++){
			try{
				B[i]=(A[i-1]+A[i]+A[i+1])/3;
			}
			catch(ArrayIndexOutOfBoundsException e){
				B[i]=0;
			}
		}
		return B;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1,2,3,4,5,6,7,8,9,10};
		int[] X=runAvg(A);
		for(int i=0;i<=X.length-1;i++){
			System.out.println(X[i]);
		}
		

	}

}
