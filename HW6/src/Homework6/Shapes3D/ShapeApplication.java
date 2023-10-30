package Shapes3D;

public class ShapeApplication {

	public static void main(String[] args) {
		ShapeThreeDimentional [] shapes = new ShapeThreeDimentional [4]; 
		shapes[0]= new SquarePyramidShape(2, 3);
		shapes[1]= new SphereShape(10);
		shapes[2]= new ShapeRectangularPrism(2, 3, 4);
		shapes[3]= new Cylinder(2, 10);
		
		for(int i=0; i<4; i++){
			shapes[i].printShapeInformation();
			System.out.println("");
		}
			

	}

}
