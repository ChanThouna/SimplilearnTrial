package testng.com;

import org.testng.annotations.Test;

public class TestCase1 {
	
	
	@Test(priority = 0,description = "Checkout Page Test 1",groups = {"Sanity"})
	public void CheckoutPage1() {
		System.out.println("Checkout Test 1");
	}
	
	

	@Test(priority = 1)
	public void CheckoutPage2() {
		System.out.println("Checkout Test 2");
	}

	@Test(priority = 2)
	public void CheckoutPage3() {
		System.out.println("Checkout Test 3");
	}
	

}
