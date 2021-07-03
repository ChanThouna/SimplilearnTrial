package testng.com;

import org.testng.annotations.Test;

public class Test2 {
	
	@Test(groups = {"Sanity"})
	public void HomePageTest() {
		System.out.println(" Homepage Test");
	}

}
