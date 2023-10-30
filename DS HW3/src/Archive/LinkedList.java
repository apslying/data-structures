public class LinkedList{
	
	private Node first;
	private Node last;

	public LinkedList() {
		first=null;
		last=null;
	}
	
	public Node getFirst(){
		return first;
	}
	
	public boolean isEmpty(){
		if(first==null && last==null){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void displayElements(){
		Node current=first;
		while(current!=last){
			current.data.printData();
			current=current.next;
		}
		last.data.printData();
	
	}
	
	public Customer peek(){
		if (first != null)
			return first.data;	
		else{
			return null;
		}
	}
	
	public void add(Customer c){
		Node newNode = new Node();
		newNode.data=c;
		newNode.next=null;
		if(this.isEmpty()==true){
			first=newNode;
			last=newNode;
		}
		else{
			last.next=newNode;
			last=newNode;
		}
		
	}
	
	public void poll(){
		first=first.next;	
	}
	
}

