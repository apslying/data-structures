import java.util.Scanner;
public class Exercise8_2 {
	public static double sumMajorDiagonal(double[][] m){
		//since the lengths of all rows are the same, use the first row and find its length
		//for an nxn matrix, this is the n 
		int n=m[0].length;
		double sum=0;
		//initiate sum to 0 and add elements on the major diagonal one at a time
		for(int i=0; i<n; i++){
			sum=sum+m[i][i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner myscan=new Scanner(System.in);
		double[][] matrix=new double[4][4];
		System.out.println("Enter a 4x4 matrix row by row: ");
		//elements are entered row by row. In each row, elements are enter element by element
		for(int r=0;r<4;r++){
			for(int c=0;c<4;c++){
				matrix[r][c]=myscan.nextDouble();
			}
		}
		//call the method
		double sum = sumMajorDiagonal(matrix);
		System.out.println("The sum of the elements on the major diagonal is " + sum);
		myscan.close();
	}

}
