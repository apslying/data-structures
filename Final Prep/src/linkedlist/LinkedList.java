package linkedlist;

public class LinkedList {
	public Node first;
	
	public LinkedList(){
		first=null;
	}
	
	public void add(Node newNode){
		if(first==null){
			first=newNode;
			first.next=null;
		}
		else{
			newNode.next=first;
			first=newNode;									
		}
	}

}
