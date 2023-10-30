package Interface;

//This is an interface called NYU Buildings. Classes that implement this interface would be NYU buildings 
//such as KimmelCenter, SilverCenter, BobstLibrary. Each class would have these three methods. 
public interface NYUBuildings {
	public String getBuildingName();
	public int getBuildingNumber();
	public void printBuildingInfo();

}
