package Shapes3D;


public class SquarePyramidShape implements ShapeThreeDimentional {
	private double length;
	private double height;
	
	//area is surface area
	public double getShapeArea(){
		double area = Math.pow(length, 2) + 2*length*height;
		return area;
		
	}
	public double getShapeVolume(){
		double volume = (Math.pow(length, 2) * height)/3;
		return volume;
	}
	public void printShapeInformation(){
		System.out.println("Shape: SquarePyramid");
		System.out.println("Area: " + getShapeArea());
		System.out.println("Volume: " + getShapeVolume());
	}
	
	public SquarePyramidShape(double l, double h) {
		length = l;
		height = h;
	}
	
	public SquarePyramidShape(){
		
	}
	
	public void setLength(double l){
		length=l;
	}
	
	public void setHeight(double h){
		height=h;
	}
	
	public double getLength(){
		return length;
	}
	
	public double getHeight(){
		return height;
	}

}
