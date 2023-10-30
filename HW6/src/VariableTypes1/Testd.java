package VariableTypes1;

import VariableTypes.Testa;

public class Testd{
	
	Testa obj= new Testa();
	
	//This class is NOT subclass of Testa and NOT in the same package. Therefore the only variable
	//this class can access is d, which is public. 
	public void printVariables(){
		System.out.println(obj.d);
	}

}
