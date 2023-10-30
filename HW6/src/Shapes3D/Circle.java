package Shapes3D;


public class Circle implements ShapeThreeDimentional {
	protected double radius;
	
	public Circle(double r) {
		radius = r;
	}

	public Circle() {
		
	}

	public double getShapeArea(){
		double area = Math.PI * Math.pow(radius, 2);
		return area;
		
	}
	
	//2D objects don't have volume
	public double getShapeVolume(){
		return 0;
	}
	
	public void printShapeInformation(){
		System.out.println("Shape: Circle");
		System.out.println("Area: " + getShapeArea());
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double r) {
		radius = r;
	}

}
