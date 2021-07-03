package test;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest  extends BaseClass{
	
	@Test
	public void LoginTestCase() {
		LoginPage loginPage = new LoginPage();
		
		String username = sheet.getRow(1).getCell(0).getStringCellValue();
		String password = sheet.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(" username is " + username);
		System.out.println("password is " + password);
		
		loginPage.login(username, password);
	
	}

}
