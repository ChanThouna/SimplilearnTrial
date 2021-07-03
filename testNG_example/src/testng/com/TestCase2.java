package testng.com;

import org.testng.annotations.Test;

public class TestCase2 {
	@Test(priority = 0,description = "Referral Test ",groups = {"Sanity"})
	public void ReferralTest1() {
		System.out.println("Referral Test 1");
	}
	
	

	@Test(dependsOnMethods = "ReferralTest1" )
	public void ReferralTest2() {
		System.out.println("Referral Test 2");
	}

	@Test(dependsOnMethods = "ReferralTest2")
	public void ReferralTest3() {
		System.out.println("Referral Test 3");
	}
	

}
