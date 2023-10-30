import java.lang.Math;
import java.util.LinkedList;
public class Knight {
	/*public int endFile;
	public int endRank;
	public int startFile=endFile;
	public int startRank=endRank;*/
	public static final int piece=300;

	
	public static LinkedList<Move> positionsAfterAllPossibleMoves(Position Pos, int file, int rank){
		LinkedList<Move> knightMoves= new LinkedList<Move>();
		int[] numbers= {-2,-1,1,2};
		for(int newFile:numbers){
			for(int newRank: numbers){
				if (Math.abs(newFile)!=Math.abs(newRank)){
					//checks each of the 8 squares 
					if(Pos.matrix[file+newFile][rank+newRank]==0){
						Move aMove= new Move(piece, file, rank, newFile, newRank);
						knightMoves.add(aMove);
					}
				}
			}
		}
		return knightMoves;
	}
					

}
