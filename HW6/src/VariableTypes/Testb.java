package VariableTypes;

public class Testb extends Testa{
	//This class is a subclass of Testa and is in the same package. The only variable this class
	//will not be able to access is a because it is private. 
	public void printVariables(){
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	

}
