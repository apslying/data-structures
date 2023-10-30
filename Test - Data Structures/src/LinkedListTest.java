import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {

	public static void main(String[] args) {
		 LinkedList<String> staff = new LinkedList<String>();
		 staff.addLast("Diana");
		 staff.addLast("Harry");
		 staff.addLast("Romeo");
		 staff.addLast("Tom");
		
		 ListIterator<String> iterator = staff.listIterator(); // |DHRT
		 iterator.next(); // D|HRT
		 iterator.next(); // DH|RT
		 
		 iterator.add("Juliet"); // DHJ|RT
		 iterator.add("Nina"); // DHJN|RT
		 
		 iterator.next(); // DHJNR|T
		 
		 // Remove last traversed element
		 
		 iterator.remove(); // DHJN|T
		 
		 // Print all elements
		 
		 for (String name : staff){
			 System.out.print(name + " ");
		 }
		 System.out.println();
		 System.out.println("Expected: Diana Harry Juliet Nina Tom");

	}

}
