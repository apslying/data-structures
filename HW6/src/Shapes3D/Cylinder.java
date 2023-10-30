package Shapes3D;

public class Cylinder extends Circle {
	private double height;
	
	public Cylinder() {
	}
	public Cylinder(double r, double h) {
		super(r);
		height=h;
	}
	//area is surface area
	public double getShapeArea(){
		return 2 * Math.PI * getRadius() * height + 2 * Math.PI * Math.pow(getRadius(), 2);
	}
	public double getShapeVolume(){
		return Math.PI * Math.pow(getRadius(), 2) * height;
	}
	public void printShapeInformation(){
		System.out.println("Shape: Cylinder");
		System.out.println("Area: " + getShapeArea());
		System.out.println("Volume: " + getShapeVolume());
	}

}
