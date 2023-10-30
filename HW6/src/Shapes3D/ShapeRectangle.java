package Shapes3D;


public class ShapeRectangle implements ShapeThreeDimentional {
	private double length;
	private double width;
	
	public ShapeRectangle(){
		
	}
	
	public ShapeRectangle(double l, double w){
		length=l;
		width=w;
		
	}
	
	public double getShapeArea(){
		double area = length*width;
		return area;
		
	}
	
	//2D objects don't have volume
	public double getShapeVolume(){
		return 0;
	}
	
	public void printShapeInformation(){
		System.out.println("Shape: Rectangle");
		System.out.println("Area: " + getShapeArea());
	}

	public void setLength(double l){
		length=l;
	}
	
	public void setWidth(double w){
		width=w;
	}
	
	public double getLength(){
		return length;
	}
	
	public double getWidth(){
		return width;
	}
}