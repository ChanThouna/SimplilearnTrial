package oopsConcept;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 //ClassA obj2 = new ClassA();
	//	obj.displayEmp();
		
		//MethodOverridingChild obj1 = new MethodOverridingChild();
	//	obj1.display();
		
		AbstractChildClass obj3 = new AbstractChildClass();
		obj3.method1();
		obj3.method2();
		//obj3.method3();
		obj3.method4();
			
		
		
		EncapsulationExample obj4 = new EncapsulationExample();
		obj4.setName("Jisha");
		System.out.println(obj4.getName());
		}

	}


