
public class Circle {
	private double radius;

	public Circle() {
	}
	
	public Circle(double r) {
		radius=r;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double r) {
		radius = r;
	}
	
	public double getArea(){
		return radius * radius * Math.PI;
	}

}
