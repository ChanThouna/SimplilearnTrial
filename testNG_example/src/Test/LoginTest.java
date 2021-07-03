package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.LoginPage;



public class LoginTest extends BaseClass {
		
	
	@Test(enabled= false)
	@Parameters({"username","password"})
	public void LoginTestCase1(String uname,String password) {
		LoginPage login = new LoginPage();
		login.login(uname, password);
	}
		
	@Test
	public void LoginTestCase2() {
			
	String uname = 	sheet.getRow(1).getCell(0).getStringCellValue();
	String password = 	sheet.getRow(1).getCell(1).getStringCellValue();

			
	LoginPage login = new LoginPage();
	login.login(uname, password);
		
	}
	
	
	
}
