package testng.com;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeGroups("Sanity")
	public void beforeGroup() {
		System.out.println("Inside Before Group Method");
	}
	
	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("Before Test Method");
	}
	
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before Method ");
	}

	
	@Test(groups = {"Sanity"})
	public void LoginTest() {
		System.out.println(" Login Test ");
		
	}
	


   @Test(groups = {"Regression"})
	public void SignUPTest() {
	System.out.println(" SigUp Test ");

	}
   
   @Test (groups = {"Regression","Sanity"})
	public void RandomName() {
	System.out.println(" Random Name ");

	}
		
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("After Method ");
	}

	@AfterTest
	public void afterTestMethod() {
		System.out.println("Before Test Method");
	}
	
	
	
}
