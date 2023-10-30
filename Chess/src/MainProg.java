import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

import java.util.LinkedList;
import java.util.Scanner;

public class MainProg {
	//public static EvalNode root=new EvalNode(1,1,1,1,1);
	
	public final static int[][] Board = 
		{{500, 300, 301, 1000000, 900, 301, 300, 500},
		{100, 100, 100, 100, 100, 100, 100, 100},
		{0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0},
		{-100, -100, -100, -100, -100, -100, -100, -100},
		{-500, -300, -301, -1000000, -900, -301, -300, -500}};
	
	public static void main(String[] args) {
		//given a position, you want to add all possible node (all possible moves) to the tree.
		//Do this by selecting one piece, finding all of its possible moves, then moving on to the next piece.
 
	
		
		//System.out.println(Board[0][4]);
		
	
		//Rook wqRook=new Rook();
		//Knight wqKnight=new Knight();
		//etc...
		
		
		
		
		//Board[0][0]=wqRook;
		//Board[0][1]=wqKnight;
		//etc...
		
		
		//DefaultTreeModel tree= new DefaultTreeModel(root);
		
		for(int i=0; i<8; i++){
			for(int j=0; j<8; j++){
				if(Board[i][j]==500 || Board[i][j]==-500){
					
				}
				
				//Board[i][j].canMove; //most of the work should be done in this line, but in the other class) 
			}
		}
		
		
	}
	
	public static LinkedList<int[][]> getPieceAndMoves(int rank, int file){
		switch(Board[rank][file]){
		case 500:
			Rook tempRook=new Rook();
			LinkedList<int[][]> a= tempRook.positionsAfterAllPossibleMoves(Board, rank, file);
			return a;
		}
		return null;
			
	}
	
	public static int depth=0;
	
	public static int evalPosition(int[][] Pos){
		if (depth==6){
			
			depth=0;
			return countMaterial(Pos);
		}
		else if (depth%2==0){//will be white's move, thus max. (NOT true for general case)
			for(int i=0; i<8; i++){
				for(int j=0; j<8; j++){
					getPieceAndMoves(i, j);
				}
			}
		}
		
		else{
			depth++;
			for allpossiblemoves{
				evalPosition(move);
			}
		}
	}
	
	public static int countMaterial(int[][] Pos){
		int count=0;
		for(int i=0; i<8; i++){
			for(int j=0; j<8; j++){
				//add to count for white pieces, sub for black 
				count=count+Pos[i][j];
			}
		}
		
		return count;
	}

}
