package Interface;

//Possible subclasses include Stocks and Bonds. This class cannot create objects of its own
//because it is an abstract class.
public abstract class FinancialSecurities {
	private String type;
	private double SellPrice;
	
	//Constructors are protected because we only want subclasses to be able to access the constructor.
	//This prevents a class from attempting to create an object of type FinancialSecurities. 
	protected FinancialSecurities(){
		
	}
	
	protected FinancialSecurities(String type, double sellPrice) {
		this.type = type;
		SellPrice = sellPrice;
	}

	public String getType() {
		return type;
	}

	public double getSellPrice() {
		return SellPrice;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSellPrice(double sellPrice) {
		SellPrice = sellPrice;
	}

	//abstract method. Both stocks and bonds have present value but it is calculated differently
	//depending on whether it is a stock or bond. 
	public abstract double getPresentValue();

}
