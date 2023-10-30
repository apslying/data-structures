public class CircleMain {

	public static void main(String[] args) {
		ComparableCircle a = new ComparableCircle(2);
		ComparableCircle b = new ComparableCircle(3);
		//will print -1 because area of a is less than area of b. 
		System.out.println(a.compareTo(b));
	}

}
