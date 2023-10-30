package Inheritance;

public class Person {
	private String name;
	//height in inches
	private double height;
	
	
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}
	public Person(){
		
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}


}
