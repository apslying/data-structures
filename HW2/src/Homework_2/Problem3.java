import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
		int lines,down,up,current,spaces;
		current=1;
		
		Scanner myscan = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		lines=myscan.nextInt();
		
		//prints line by line, starting from line 1, i.e current=1 
		while(current<=lines){
			down=current;
			up=2;
			spaces=lines-current;
			//prints spaces by calculating how many lines are between current line and last line
			while(spaces>0){
				System.out.print("  ");
				spaces--;
			}
			//prints decreasing portion of current line
			while(down>0){
				System.out.print(down + " ");
				down--;
			}
			//prints increasing portion of current line starting from 2
			while(up<=current){
				System.out.print(up + " ");
				up++;
			}
			System.out.println("");
			current++;
		}
		myscan.close();
		
		
	}

}
