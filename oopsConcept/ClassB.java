package oopsConcept;

public class ClassB {
	
	public static  String name;
	public static int salary;
	protected static String orgName;
	
	public ClassB() {
		System.out.println(" Inside constructor");
	}
	
	public ClassB(String val1,int val2,String val3) {
		System.out.println(" Inside parameterized constructor ");
		
		name = val1;
		salary = val2;
		orgName = val3;
		ClassB.display();
		
	}
	public  static void display() {
		System.out.println(" Name: " + name);
		System.out.println(" salary: " + salary);
		System.out.println(" Name of Organisation " + orgName);
	}

}
