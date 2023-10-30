package Shapes3D;


public class SphereShape implements ShapeThreeDimentional {
	private double radius;
	
	//area is surface area
	public double getShapeArea(){
		double area = 4 *Math.PI * Math.pow(radius, 2);
		return area;
		
	}
	public double getShapeVolume(){
		double volume = (4.0/3.0) * Math.PI *Math.pow(radius, 3);
		return volume;
	}
	public void printShapeInformation(){
		System.out.println("Shape: Sphere");
		System.out.println("Area: " + getShapeArea());
		System.out.println("Volume: " + getShapeVolume());
	}
	
	public SphereShape(double r) {
		radius = r;
	}
	public SphereShape(){
		
	}
	
	public void setRadius(double r){
		radius=r;
	}
	
	public double getRadius(){
		return radius;
	}

}