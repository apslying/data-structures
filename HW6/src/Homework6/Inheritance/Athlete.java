package Inheritance;

//An athlete has all of the characteristics of a person, this class is the subclass and Person
//is the super class. This class inherits all of the variables and methods of the Person class. 
public class Athlete extends Person {
	//Every athlete has a sport, which not every person has. 
	private String sport;

	public Athlete() {
	}

	public Athlete(String name, double height, String sport) {
		//The super method allows the Athlete constructor to be concise. It essentially performs 
		//the actions of the Person constructor. 
		super(name, height);
		this.sport=sport;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}
	

}
