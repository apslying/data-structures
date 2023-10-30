
public class Trees {
	class Node{
		public int idata;
		public double ddata;
		public Node leftchild;
		public Node rightchild;
		
	}
	
	class Tree{
		private Node root;
		
		public Tree(){
			root=null;
		}
		
		public Node find(int key){
			Node current=root;
			while(key!=current.idata){
				if(current==null){
					
				}
				if(key>current.idata){
					current=current.rightchild;
				}
				else if(key<current.idata){
					current=current.leftchild;
				}
				
			}
			return current;
		}
		
		public void insert(int id, double dd){
			Node newNode= new Node();
			newNode.idata=id;
			newNode.ddata=dd;
			if (root==null){
				root=newNode;
			}
			else{
				Node current = root;
				Node parent = null; 
			
				while(current !=null){
					
					if(id>current.idata){
						parent=current;
						current=current.rightchild;
					}
					else if(id<current.idata){
						parent=current;
						current=current.leftchild;
					}
				}//not done
				
			}
			
		}
		
		public boolean delete(int key){
			
		}
		
	}

}
