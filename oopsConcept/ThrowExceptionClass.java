package oopsConcept;

public class ThrowExceptionClass {
	
	static int age = 14;

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
	try {	
		if (age<18) {
			throw new Exception("Not Elligible");
			}

	}catch (Exception e) {
		System.out.println("elligible" );
	}
	
	}
	

}
