package Polymorphism;

public class Athlete extends Person {
	private String sport;

	public Athlete() {
	}

	public Athlete(String name, double height, String sport) {
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
