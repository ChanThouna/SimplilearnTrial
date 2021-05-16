package oopsConcept;

public class EncapsulationExample {
 private String name;
 private int salary;
 private int empID;
 
 public String setName(String name) {
	 return this.name = name;
 }
 public String getName() {
	 return name;
 }
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getEmpID() {
	return empID;
}
public void setEmpID(int empID) {
	this.empID = empID;
}

}
