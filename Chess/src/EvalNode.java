import java.util.Enumeration;
import javax.swing.tree.TreeNode;
public class EvalNode implements TreeNode {//i need TreeNode because that is the node for TreeModel 
//i dont care why DTM must have TN as an arg
	
	public int evaluation; 
	public int startRank;
	public int startFile;
	public int endRank;
	public int endFile;

	
	public EvalNode(int evaluation, int startRank, int startFile, int endRank,int endFile) {
		this.evaluation = evaluation;
		this.startRank = startRank;
		this.startFile = startFile;
		this.endRank = endRank;
		this.endFile = endFile;
	}

	@Override
	public TreeNode getChildAt(int childIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getChildCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TreeNode getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getIndex(TreeNode node) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getAllowsChildren() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLeaf() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Enumeration children() {
		// TODO Auto-generated method stub
		return null;
	}

}
