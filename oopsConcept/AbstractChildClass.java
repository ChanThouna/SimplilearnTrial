package oopsConcept;

public class AbstractChildClass extends AbstractParentClass{

	@Override
	public void method2() {
		System.out.println("Abstract method 2 implementation in child class");
		
	}
	
	public void method1() {
		System.out.println("method 1 child class");
	}
	public static void method4() {
		System.out.println("This is test static child  method");
	}

}
