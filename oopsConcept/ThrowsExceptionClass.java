package oopsConcept;

public class ThrowsExceptionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ThrowsExceptionClass obj = new ThrowsExceptionClass();	
		
		try {
		obj.eligibilityCheck(15);
		}catch(Exception e) {
			System.out.println("EXception Handled ");
			e.printStackTrace();
		}

	}

	
	public void eligibilityCheck(int age) throws Exception {
		
		if(age <18) {
			throw new  Exception("not elligible");
		}else {
			System.out.println("eligiblw");
		}
	}
}
