import java.util.*;
public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<String>();
		q.add("hello");
		q.add("me");
		q.add("you");
		
		System.out.println(q.peek());
		q.poll();
		System.out.println(q.peek());
		q.poll();

		System.out.println(q.peek());



	}

}
