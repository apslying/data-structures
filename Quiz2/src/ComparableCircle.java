//variable type is circle, so E=Circle 
public class ComparableCircle extends Circle implements Comparable<Circle>{
	public ComparableCircle(double r){
		super(r);
	}

//define compareTo method. Compares circles using area 
	public int compareTo(Circle o) {
		if (getArea() > o.getArea()){
			return 1;
		}
		else if (getArea() < o.getArea()){ 
			return -1;
		}
		else{
			return 0;
		}	
	}

}
