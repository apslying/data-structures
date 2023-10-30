import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

import java.util.LinkedList;
import java.util.ListIterator;

public class MoveTree extends DefaultTreeModel{
	
	public MoveTree(TreeNode root) {
		super(root);
		// TODO Auto-generated constructor stub
	}

	public void AddRoot(Position pos, LinkedList<Move> listOfMoves){//may not need this!
		//tree where each node is a linked list
			MoveNode aNode=new MoveNode(null, pos,listOfMoves);
			this.setRoot(aNode);	
	}
	
	public void SubtreeOfNode(MoveNode existingNode){
		ListIterator<Move> iterator= existingNode.list.listIterator();
		while(iterator.hasNext()==true){
			Move currentMove=iterator.next();
			Position newPos=existingNode.pos.PositionAfterMove(currentMove);
			int index=iterator.nextIndex();
			
			MoveNode newNode=new MoveNode(currentMove ,newPos, newPos.ListMoves()); //change the 0 to calculate material+mobility
			this.insertNodeInto(newNode, existingNode, index);
			
		}
	}
	
	public void SubtreeAllChildlessNodes(){
		MoveNode root= (MoveNode) this.getRoot();
		MoveNode leaf=(MoveNode) root.getFirstLeaf();
		this.SubtreeOfNode(leaf);
		while (leaf.getNextLeaf()!=null){
			leaf=(MoveNode) leaf.getNextLeaf();
			this.SubtreeOfNode(leaf);			
		}
		
	}
	
	public int Evaluate(MoveNode currentNode){
		if (currentNode.isLeaf()==true){
			currentNode.evaluation=currentNode.pos.CountMaterial();
			return currentNode.evaluation;
		}
		else{
			if (currentNode.pos.whiteToMove==true){
				int max;
				MoveNode child=(MoveNode) currentNode.getFirstChild();
				currentNode.evaluation=Evaluate(child);
				
				while (child.getNextLeaf()!=null){
					child=(MoveNode) child.getNextSibling();
					max=Evaluate(child);
					if(max>currentNode.evaluation)
						currentNode.evaluation=max;
						currentNode.bestMove=child.thisMove;
				}
			}
			else{
				int min;
				MoveNode child=(MoveNode) currentNode.getFirstChild();
				currentNode.evaluation=Evaluate(child);
				
				while (child.getNextLeaf()!=null){
					child=(MoveNode) child.getNextSibling();
					min=Evaluate(child);
					if(min<currentNode.evaluation)
						currentNode.evaluation=min;
						currentNode.bestMove=child.thisMove;
				}
			}
			return currentNode.evaluation;
		}
	}
}
