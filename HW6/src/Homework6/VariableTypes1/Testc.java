package VariableTypes1;

import VariableTypes.Testa;

public class Testc extends Testa{
	
	//This class is a subclass of Testa but is NOT in the same package. Even though this class is
	//in a different package, since it is a subclass of Testa, it can access the variable c 
	//because it is protected. It can also access the public variable d. 
	public void printVariables(){
		System.out.println(c);
		System.out.println(d);
	}

}
