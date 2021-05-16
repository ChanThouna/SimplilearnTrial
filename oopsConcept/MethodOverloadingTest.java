package oopsConcept;

public class MethodOverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloadingTest obj = new MethodOverloadingTest();
	System.out.println(	obj.overLoading(1,2));
		obj.overLoading(1.2,2.3);
	}
	
	
	public int overLoading(int a,int b) {
		int sum = a+b;
		return sum;
	}
	public double overLoading(double a,double b) {
	double sum  = a+b;
	return sum;
	}

}
