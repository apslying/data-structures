
public class Merge {
	public static int[] Merge2Arrays(int[] A, int[] B){
		int i=0;
		int j=0;
		int[] x= new int[A.length+B.length];
		int index=0;
		while((i<=A.length-1) && (j<=B.length-1)){
			if(A[i]<B[j]){
				x[index]=A[i];
				i++;
				index++;
			}
			else if(A[i]>=B[j]){
				x[index]=B[j];
				j++;
				index++;				
			}
		}
		if(i==A.length){
			for(int n=index; n<=x.length-1; n++){
				x[n]=B[j];
				j++;
			}	
		}
		else if(j==B.length){
			for(int n=index; n<=x.length-1; n++){
				x[n]=A[i];
				i++;
			}
		}
		return x;
	}
	
	public static void main(String[] args) {
		int A[] = {7,10,14,15,16,17,18,100,102};
		int B[] = {9,12,40,77};
		
		int[] X= Merge2Arrays(A, B);
		
		for(int i=0; i<=X.length-1; i++){
			System.out.print(X[i] + " ");
		}
	}

}
