import java.util.LinkedList;
public class King {
	public static final int piece=1000000;

	
	public static LinkedList<Move> positionsAfterAllPossibleMoves(Position Pos, int file, int rank){
		LinkedList<Move> kingMoves= new LinkedList<Move>();
		int[] numbers= {-1,0,1};
		for(int newFile:numbers){
			for(int newRank: numbers){
				if (newFile==0 && newRank==0){
					//do nothing. king can't move to its own square
				}
				else{
					if(Pos.matrix[file+newFile][rank+newRank]==0){
						Move aMove= new Move(piece, file, rank, newFile, newRank);
						kingMoves.add(aMove);
					}
				}
			}
		}
		return kingMoves;
	}

}
