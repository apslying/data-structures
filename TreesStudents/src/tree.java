
public class tree {
	private Student root;
	
	public tree(){
		root=null;
	}
	
	public double find(int id){
		Student current=root;
		while(current != null){
			if(id>current.ID){
				current=current.rightChild;
			}
			else if(id<current.ID){
				current=current.leftChild;
			}
			else{
				return current.GPA;
			}
		}//end while
		return -1; //id not found
	}

	public boolean delete(Student del) {
		Student parent=null;
		Student current=root;
		while(current.ID != del.ID){
			if(del.ID>current.ID){
				parent=current;
				current=current.rightChild;
			}
			else if(del.ID<current.ID){
				parent=current;
				current=current.leftChild;
			}
			if(current==null){
				return false;
			}
		} //end while- current is ready to be deleted
		
		if(current.leftChild==null && current.rightChild==null){
			//leaf
			if(current.ID< parent.ID){
				parent.leftChild=null;
			}
			else{
				parent.rightChild=null;
			}
		}
		
		else if(current.leftChild==null){
			//only has right subtree
			if(current.ID< parent.ID){
				parent.leftChild=current.rightChild;
			}
			else{
				parent.rightChild=current.rightChild;
			}
		}
		
		else if(current.rightChild==null){
			//only has left subtree
			if(current.ID< parent.ID){
				parent.leftChild=current.leftChild;
			}
			else{
				parent.rightChild=current.leftChild;
			}
		}
		
		else{
			//has two children
			Student parentSuccessor=current.leftChild;
			if(parentSuccessor.rightChild==null){
				//no successor, parentSuccessor will replace current
				parentSuccessor.rightChild=current.rightChild;
				if(current.ID>parent.ID){
					parent.rightChild=parentSuccessor;
				}
				else{
					parent.leftChild=parentSuccessor;
				}
			}
			else{
				Student successor=parentSuccessor.rightChild;
				while(successor.rightChild!=null){
					parentSuccessor=successor;
					successor=successor.rightChild;
				}
				//successor will replace current
				//parentSuccessor will connect to the left subtree of successor
				parentSuccessor.rightChild=successor.leftChild;
				successor.leftChild=current.leftChild;
				successor.rightChild=current.rightChild;
				parent.rightChild=successor;
			}
			
		}
		return true;
	}
}
