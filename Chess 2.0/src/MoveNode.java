import javax.swing.tree.DefaultMutableTreeNode;
import java.util.LinkedList;

public class MoveNode extends DefaultMutableTreeNode {
	public Move thisMove;
	public Position pos;
	public LinkedList<Move> list;
	public Move bestMove;
	public int evaluation;
	
	public MoveNode(Move thisMove, Position pos, LinkedList<Move> list) {
		super();
		this.thisMove = thisMove;
		this.pos = pos;
		this.list = list;
	}
	
	public MoveNode(Move thisMove, Position pos, LinkedList<Move> list,
			Move bestMove, int evaluation) {
		super();
		this.thisMove = thisMove;
		this.pos = pos;
		this.list = list;
		this.bestMove = bestMove;
		this.evaluation = evaluation;
	}
	
	

	

}
