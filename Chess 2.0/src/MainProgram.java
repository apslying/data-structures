import java.util.LinkedList;

public class MainProgram {

	public static void main(String[] args) {
		int[][] board = 
			{{500, 300, 301, 1000000, 900, 301, 300, 500},
			{100, 100, 100, 100, 100, 100, 100, 100},
			{0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0},
			{-100, -100, -100, -100, -100, -100, -100, -100},
			{-500, -300, -301, -1000000, -900, -301, -300, -500}};
		
		Position start=new Position(board,true);
		LinkedList<Move> listOfMoves= start.ListMoves();
		MoveNode root=new MoveNode(null, start ,listOfMoves);
		MoveTree testTree=new MoveTree(root);
		testTree.SubtreeOfNode(root);
		testTree.Evaluate(root);
		
		System.out.println("The best move and evaluation:");
		root.thisMove.printFields();
		System.out.println(root.evaluation);
		

	}

}
