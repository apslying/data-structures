import java.lang.Math;
import java.util.LinkedList;
public class Position {
	public int[][] matrix;
	public boolean whiteToMove; 
	
	
	
	public Position(int[][] matrix, boolean whiteToMove) {
		this.matrix = matrix;
		this.whiteToMove = whiteToMove;
	}

	/*public int[][] GetPosition(){
		return matrix;
	}*/
	
	public Position PositionAfterMove(Move aMove){
		matrix[aMove.beginfile][aMove.beginrank]=0;
		matrix[aMove.endfile][aMove.endrank]=aMove.piece;
		whiteToMove=!whiteToMove;
		return this;
	}
	
	public int CountMaterial(){
		int material=0;
		for (int file=0; file<8; file++){
			for (int rank=0; rank<8; rank++){
				material=material+matrix[file][rank];
			}
		}
		
		return material;
	}
	
	public LinkedList<Move> ListMoves(){//must have a list of all moves, can't split up by square 
		LinkedList<Move> listOfMoves=new LinkedList<Move>();
		for (int file=0; file<8; file++){
			for (int rank=0; rank<8; rank++){
				int whichPiece=Math.abs(matrix[file][rank]);
				LinkedList<Move> temp = null;
				switch (whichPiece){
				case 0:
					break;
				case 100:
					temp= Pawn.positionsAfterAllPossibleMoves(this, file, rank);
					break;
				case 300:
					temp= Knight.positionsAfterAllPossibleMoves(this, file, rank);
					break;
				case 301:
					temp= Bishop.positionsAfterAllPossibleMoves(this, file, rank);
					break;
				case 500:
					temp= Rook.positionsAfterAllPossibleMoves(this, file, rank);
					break;
				case 900:
					temp= Queen.positionsAfterAllPossibleMoves(this, file, rank);
					break;
				case 1000000:
					temp= King.positionsAfterAllPossibleMoves(this, file, rank);
					break;
				}
				listOfMoves.addAll(temp);
			}

		}
		return listOfMoves;
	}
}
