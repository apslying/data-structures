import java.util.LinkedList;
public class Bishop {
	public static final int piece=301;

	
	public static LinkedList<Move> positionsAfterAllPossibleMoves(Position Pos, int file, int rank){
		LinkedList<Move> bishopMoves= new LinkedList<Move>();
		
		int newFile=file+1;
		int newRank=rank+1; //northeast (from whites/both? perspective)
		while(newFile<8 && newFile>=0 && newRank<8 && newRank>=0){
			if (Pos.matrix[newFile][newRank]==0){
				Move aMove= new Move(piece, file, rank, newFile, newRank);
				bishopMoves.add(aMove);
				newFile++;
				newRank++;
			}
			else{
				break;
			}
		}
		
		newFile=file-1;
		newRank=rank-1; //southwest
		while(newFile<8 && newFile>=0 && newRank<8 && newRank>=0){
			if (Pos.matrix[newFile][newRank]==0){
				Move aMove= new Move(piece, file, rank, newFile, newRank);
				bishopMoves.add(aMove);
				newFile--;
				newRank--;
			}
			else{
				break;
			}
		}
		
		newFile=file-1;
		newRank=rank+1; //northwest
		while(newFile<8 && newFile>=0 && newRank<8 && newRank>=0){
			if (Pos.matrix[newFile][newRank]==0){
				Move aMove= new Move(piece, file, rank, newFile, newRank);
				bishopMoves.add(aMove);
				newFile--;
				newRank++;
			}
			else{
				break;
			}
		}
	
		newFile=file+1;
		newRank=rank-1; //southeast
		while(newFile<8 && newFile>=0 && newRank<8 && newRank>=0){
			if (Pos.matrix[newFile][newRank]==0){
				Move aMove= new Move(piece, file, rank, newFile, newRank);
				bishopMoves.add(aMove);
				newFile++;
				newRank--;
			}
			else{
				break;
			}
		}
		
		
		
		return bishopMoves;
	}
	
}
