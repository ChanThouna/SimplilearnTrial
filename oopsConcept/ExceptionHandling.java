package oopsConcept;

public class ExceptionHandling {
	
	public static void main(String args[]) {
		int a = 10;
		int b = 0;
		try {
			
			int div = a/b;

		}
		 catch(ArithmeticException e) {
			 System.out.println("Arithmetic Exception Handled");
		 }
		
		
		catch(Exception e) {
			System.out.println("Exception Handled");
			e.getMessage();
		}
		finally{
			System.out.println("Finally Block Executed");
		}
		System.out.println("Hello");
		
		int arr[] = {1,3,7,3};
		try {
			System.out.println(arr[5]);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("AIOB exception handled");
		}
		
	}
	

}
