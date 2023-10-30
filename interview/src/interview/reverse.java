package interview;

import Node;

public class reverse {
	public void reverse(){
		Node prev=null;
		Node curr=first;
		while(curr!=null){
			Node temp=curr;
			curr=curr.next;
			temp.next=prev;
			prev=temp;
		}
		first=prev;
	}
	
}
