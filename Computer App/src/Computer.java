public class Computer {
	private String name;
	private int quantity;
	
	public Computer(){
		
	}
	
	public Computer(String n, int q){
		name=n;
		quantity=q;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name =n; 
		
	}
}
