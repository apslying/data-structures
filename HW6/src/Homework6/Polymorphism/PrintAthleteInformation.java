package Polymorphism;

public class PrintAthleteInformation {
	
	//The method printAll takes a Person object as an argument.
	public static void printAll(Person p){
		System.out.println("Name: " + p.getName());
		System.out.println("Height: " + p.getHeight());
	}

	public static void main(String[] args) {
		Athlete MichaelJordan = new Athlete("Michael Jordan", 78, "Basketball");
		//MichaelJordan is an object of type Athlete, which is a subclass of Person, which is why 
		//the printAll method is able to take MichaelJordan as an argument. This is a polymorphic call.
		printAll(MichaelJordan);
	}

}
