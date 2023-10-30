
public class Test implements MyInterface {
	 public void method1()
	 {
	 System.out.println("implementation of method1");
	 }
	 public void method2()
	 {
	 System.out.println("implementation of method2");
	 }
	
	 public static void main(String[] args)
	 {
	 MyInterface object = new Test();
	 object. method1();
	 }
	}


