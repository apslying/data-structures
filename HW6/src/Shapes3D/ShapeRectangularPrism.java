package Shapes3D;

public class ShapeRectangularPrism extends ShapeRectangle{
	
	private double height;

	public ShapeRectangularPrism(){
	
	}
	
	public ShapeRectangularPrism(double l, double w, double h){
		super(l, w);
		height=h;
		
	}
	
	//area is surface area
	public double getShapeArea(){
		return 2*getWidth()*getLength() + 2*getWidth()*height + 2*height*getLength();
	}
	public double getShapeVolume(){
		return getLength()* getWidth() * height;
	}
	public void printShapeInformation(){
		System.out.println("Shape: Rectangular Prism");
		System.out.println("Area: " + getShapeArea());
		System.out.println("Volume: " + getShapeVolume());
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double h) {
		height = h;
	}

}
